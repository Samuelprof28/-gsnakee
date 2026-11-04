import java.awt.*;
import java.util.LinkedList;

private Direction nextDirection = Direction.RIGHT;
public void setNextDirection(Direction newDirection) {
    if(isOpposite(newDiretion)) {
        return;
    }
    nextDirection = newDirection;
}

private boolean isOpposite(Direction newDirection) {
    return(direction == Direction.UP && newDirection == Direction.DOWN) ||
            (direction == Direction.DOWN && newDirection == Direction.UP) ||
            (direction == Direction.LEFT && newDirection == Direction.RIGHT) ||
            (direction == Direction.RIGHT && newDirection == Direction.LEFT)
}

public Point peekNextHead() {
    direction = nextDirection;
    Point head = body.getFirst();
    Point newHead = new Point(head.x, head.y);


switch (direction) {
    case UP: newHead.y--; break;
    case DOWN: newHead.y++; break;
    case LEFT: newHead.x--; break;
    case RIGHT.newHead.x++; break;
        }
        return newHead;
}


public class Snake {

    public enum Direction { UP, DOWN, LEFT, RIGHT}

    private final LinkedList<Point> body = new LinkedList<>();
    private Direction direction = Direction.RIGHT;


    public void reset(int startX, int startY) {
        body.clear();

        body.add(new Point(startX, startY)); //cabeça
        body.add(new Point(startX - 1, startY)); //corpo
        body.add(new Point(startX - 2, startY)); //cauda
        direction = Direction.RIGHT;
    }

    public LinkedList<Point> getBody() {
        return body;
    }
    public Direction getDirection() {
        return direction;
    }
}