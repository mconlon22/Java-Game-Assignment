package util;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import util.UnitTests;


public class DeathWindow {
    private static  JFrame frame = new JFrame("Game");   // Change to the name of your game 
 
    private static   int TargetFPS = 100;
    private static boolean startGame= false; 
    private static boolean died= false; 

    private   JLabel BackgroundImageForStartMenu ;
    public DeathWindow() {
        frame.setSize(1000, 1000);  // you can customise this later and adapt it to change on size.  
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //If exit // you can modify with your way of quitting , just is a template.
        frame.setLayout(null);
      
              
           
        JButton startMenuButton = new JButton("Start Game");  // start button 
        startMenuButton.addActionListener(new ActionListener()
           { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                startMenuButton.setVisible(false);
                BackgroundImageForStartMenu.setVisible(false); 
                 // making sure that the Canvas is in focus so keyboard input will be taking in .
                startGame=true;
            }});  
        startMenuButton.setBounds(400, 500, 200, 40); 
        
        //loading background image 
        File BackroundToLoad = new File("D:/Downloads/gameassignment1/game/res/trump.jpg");  //should work okay on OSX and Linux but check if you have issues depending your eclipse install or if your running this without an IDE 
        try {				 
             BufferedImage myPicture = ImageIO.read(BackroundToLoad);
             BackgroundImageForStartMenu = new JLabel(new ImageIcon(myPicture));
             BackgroundImageForStartMenu.setBounds(0, 0, 1000, 1000);
            frame.add(BackgroundImageForStartMenu); 
        }  catch (IOException e) { 
            e.printStackTrace();
        }   
         frame.add(startMenuButton);  
       frame.setVisible(true);   
}

}
