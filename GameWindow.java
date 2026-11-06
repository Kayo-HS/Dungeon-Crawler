import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;



public class GameWindow {
    private JFrame tela;

    public void executar(){
            janela();
            
    }
    


    public void janela(){
        tela = new JFrame("Dungeon Crawler");
        tela.setSize(400, 400);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        desenharJanela();

        tela.setVisible(true);
    }
    

    public void desenharJanela(){
        PainelJogo painel = new PainelJogo();
        
        painel.setBackground(new Color(22,13,14));
        tela.add(painel);    
    }

    private class PainelJogo extends JPanel implements KeyListener{
        private final int LINHAS = 10;
        private final int COLUNAS = 10;
        private final int TAMANHO_QUADRADO = 40;
        private int jogadorX = 4;
        private int jogadorY = 5;

        public PainelJogo(){
            setFocusable(true);
            addKeyListener(this);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int botao = e.getKeyCode();
            switch (botao) {
                case KeyEvent.VK_W:
                    jogadorY -= 1;
                    break;
                case KeyEvent.VK_S:
                    jogadorY += 1;
                    break;
                case KeyEvent.VK_D:
                    jogadorX += 1;
                    break;
                case KeyEvent.VK_A:
                    jogadorX -= 1;
                    break;
            
                default:
                    break;
            }
            repaint();
        }
        @Override 
        public void keyReleased(KeyEvent e) {
    }
        @Override 
        public void keyTyped(KeyEvent e) {
    }


    
        private int[][] mapamatriz = {
            {3, 1, 1, 1, 1, 1, 3, 1, 1, 1},
            {3, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
            {1, 1, 1, 1, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 2, 1, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 3, 1},
        };

        @Override 
        protected void paintComponent(Graphics g){
            super.paintComponent(g);

            for(int i= 0; i < LINHAS; i++){
                for(int j= 0; j < COLUNAS; j++){

                    g.setColor(Color.RED);

                    g.fillRect(
                        jogadorX = TAMANHO_QUADRADO, 
                        jogadorY = TAMANHO_QUADRADO, 
                        TAMANHO_QUADRADO,
                        TAMANHO_QUADRADO
                    );

                    int x = j * TAMANHO_QUADRADO;
                    int y = i * TAMANHO_QUADRADO;

                    if(mapamatriz[i][j] == 1){
                        g.setColor(Color.DARK_GRAY);
                        g.fillRect(x, y, TAMANHO_QUADRADO, TAMANHO_QUADRADO);
                    }
                    else if (mapamatriz[i][j] == 0){
                        g.setColor(Color.GREEN);
                        g.fillRect(x, y, TAMANHO_QUADRADO, TAMANHO_QUADRADO);
                    }
                    else if(mapamatriz[i][j] ==2){
                        g.setColor(Color.BLUE);
                        g.fillRect(x, y, TAMANHO_QUADRADO, TAMANHO_QUADRADO);
                    }
                    else if(mapamatriz[i][j] ==3){
                        g.setColor(Color.GRAY);
                        g.fillRect(x, y, TAMANHO_QUADRADO, TAMANHO_QUADRADO);
                    }
                    else{
                        g.setColor(Color.WHITE);
                        g.fillRect(x, y, TAMANHO_QUADRADO, TAMANHO_QUADRADO);
                    }
                }
            }
        }
    }
}