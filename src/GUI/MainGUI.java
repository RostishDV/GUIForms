package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MainGUI{
    private JPanel mainPanel;
    private JButton expandCollapseButton;
    private JPanel expandCollapseButtonPanel;
    private JPanel layoutPanel;
    private boolean isExpand;
    private final ExpandGUI expandGUI = new ExpandGUI();;
    private final CollapseGUI collapseGUI = new CollapseGUI();

    public MainGUI () {

        repaintLayoutPanel(expandGUI.getExpandPanel());
        isExpand = true;

        expandCollapseButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if (isExpand){
                    changeToCollapse();
                } else {
                    changeToExpand();
                }
            }
        });
    }

    private void changeToCollapse(){
        String name = expandGUI.getName();
        String surname = expandGUI.getSurname();
        String patronymic = expandGUI.getPatronymic();
        if ((name != null && name.trim().length() > 0)
                && (surname != null && surname.trim().length() > 0)){
            collapseGUI.setCombinedText(name + " " + surname + " " +
                    (patronymic != null ? patronymic : ""));

            repaintLayoutPanel(collapseGUI.getCollapsePanel());
            expandCollapseButton.setText("Collapse");
            isExpand = false;
        } else {
            JOptionPane.showMessageDialog(
                    mainPanel,
                    "type name, surname and try again",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
        }

    }

    private void changeToExpand(){
        String[] combinedText = collapseGUI.getCombinedText().split(" ", 3);
        if (combinedText.length > 1 &&
                combinedText[0].trim().length() > 0 &&
                combinedText[1].trim().length() > 0){
            expandGUI.setName(combinedText[0]);
            expandGUI.setSurname(combinedText[1]);
            expandGUI.setPatronymic(combinedText.length > 2 ? combinedText[2] : "");
            repaintLayoutPanel(expandGUI.getExpandPanel());
            expandCollapseButton.setText("Expand");
            isExpand = true;
        } else {
            JOptionPane.showMessageDialog(
                    mainPanel,
                    "type name, surname and try again",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }

    private void repaintLayoutPanel(Component component) {
        layoutPanel.removeAll();
        layoutPanel.add(component);
        layoutPanel.repaint();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
