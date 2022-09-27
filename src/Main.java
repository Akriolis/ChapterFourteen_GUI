import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("CLICK ME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(500,100);
        frame.setVisible(true);

        // you need a method to be called when the click happened on a button
        // a way to know when to trigger that method

        /**
         * In Java, the process of getting and handling a user event
         * is called even-handling
         */

        // to care about button's events, implements an interface
        // listener interface connects the listener and event source



    }


}
