package pl.mizuirokoala.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimplyObserverSwingClass {

    JFrame frame;

    public static void main(String[] args) {
        SimplyObserverSwingClass firstObserver = new SimplyObserverSwingClass();
        firstObserver.start();
    }

    public void start() {
        frame = new JFrame();
        JButton button = new JButton("Are you there?");
        button.addActionListener(new YesImHere()); // we will se yes and No
        button.addActionListener(new No());        //
        frame.getContentPane().add(BorderLayout.CENTER, button);

        //window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(350, 400);
        frame.setVisible(true);

    }


    private class No implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.out.println("Hell No !!!!!!! :P");
        }
    }

    private class YesImHere implements ActionListener {

        public void actionPerformed(ActionEvent event){
            System.out.println(" Yes i'm here :)");
        }

    }
}
