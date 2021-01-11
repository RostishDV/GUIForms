package GUI;

import javax.swing.*;

public class CollapseGUI {
    private JTextArea combinedText;
    private JPanel collapsePanel;

    public CollapseGUI (){
        collapsePanel.setVisible(true);
    }

    public void setCombinedText(String text) {
        combinedText.setText(text);
    }

    public String getCombinedText() {
        return combinedText.getText();
    }

    public JPanel getCollapsePanel() {
        return collapsePanel;
    }
}
