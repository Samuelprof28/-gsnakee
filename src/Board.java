import java.awt.*;

public class Board {

    public void draw(Graphics2D g2) {
        drawGrass(g2);
    }

    private void drawGrass(Graphics2D g2) {
        int tile = GameConstants.TILE;

        for (int x = 0; x < GameConstants.COLS; x++) { //X são as nossas colunas
            for(int y = 0; y < GameConstants.ROWS; y++) { //Y são as nossas linhas
                boolean shade = (x + y) % 2 == 0; //Verifica se a soma dos números é par

                g2.setColor(shade ? new Color(99,163,66) : new Color(83,153,60));
                g2.fillRect(x * tile, y * tile, tile, tile);
            }
        }
    }
}
