import javax.swing.*;
import java.awt.*;



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
        tela.setVisible(true);
        desenharJanela();
    }
    

    public void desenharJanela(){
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(50,33,147,2));;
        painel.setBackground(new Color(22,13,14));
        tela.add(painel);    
    }
}