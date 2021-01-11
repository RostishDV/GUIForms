import GUI.CollapseGUI;
import GUI.ExpandGUI;
import GUI.MainGUI;

import javax.swing.*;

public class Loader {

    public static void main(String[] args) {
        MainGUI mainGUI = new MainGUI();

        JFrame frame = new JFrame();
        frame.setContentPane(mainGUI.getMainPanel());
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
