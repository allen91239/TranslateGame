/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translategame;

import javax.swing.JFrame;

/**
 *
 * @author zlsh80826
 */
public class TranslateGame {
    public void connect(String account, String password){
        
    }
    
    static public void main(String[] args){
        TranslateGame game = new TranslateGame();
        JFrame frame = new JFrame("Translate Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1134, 704);
        frame.setVisible(true);
        /* Need to implement
        frame.setShape(shape);
        frame.setIconImage(image);        
        */
        frame.setLocation(550, 100);//need to tune
        LoginPaint applet = new LoginPaint(game);
        applet.init();
        applet.start();
        frame.setContentPane(applet);
    }
}