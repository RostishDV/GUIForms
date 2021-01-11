package GUI;

import javax.swing.*;

public class ExpandGUI {
    private JTextPane nameTextPane;
    private JTextPane surnameTextPane;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel patronymicLabel;
    private JTextPane patronymicTextPane;
    private JPanel expandPanel;

    public ExpandGUI (){
        expandPanel.setVisible(true);
    }

    public void setName(String name) {
        nameTextPane.setText(name);
    }

    public String getName() {
        return nameTextPane.getText();
    }

    public void setSurname(String surname) {
        surnameTextPane.setText(surname);
    }

    public String getSurname() {
        return surnameTextPane.getText();
    }

    public void setPatronymic(String patronymic) {
        patronymicTextPane.setText(patronymic);
    }

    public String getPatronymic() {
        return patronymicTextPane.getText();
    }

    public JPanel getExpandPanel() {
        return expandPanel;
    }
}
