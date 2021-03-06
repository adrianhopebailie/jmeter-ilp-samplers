package org.interledger.jmeter.samplers;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BtpAuthForm {
    public JPanel btpAuthPanel;
    public JLabel usernameLabel;
    public JLabel tokenLabel;
    public JTextField usernameField;
    public JTextField tokenField;
    public JLabel messageField;

    public void clearGui() {
        messageField.setText(" ");
        usernameField.setText("");
        tokenField.setText("");
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public void setUsername(String username) {
        usernameField.setText(username);
    }

    public String getToken() {
        return tokenField.getText();
    }

    public void setToken(String token) {
        tokenField.setText(token);
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        btpAuthPanel = new JPanel();
        btpAuthPanel.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:10dlu:noGrow,fill:479px:noGrow", "center:max(d;4px):noGrow,top:3dlu:noGrow,center:max(d;4px):noGrow,top:3dlu:noGrow,center:max(d;4px):noGrow"));
        btpAuthPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-4473925)), "BTP Auth", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-4473925)));
        usernameLabel = new JLabel();
        usernameLabel.setText("Username: ");
        CellConstraints cc = new CellConstraints();
        btpAuthPanel.add(usernameLabel, cc.xy(1, 3));
        usernameField = new JTextField();
        usernameField.setText("");
        btpAuthPanel.add(usernameField, cc.xy(3, 3));
        tokenLabel = new JLabel();
        tokenLabel.setText("Token: ");
        btpAuthPanel.add(tokenLabel, cc.xy(1, 5));
        tokenField = new JTextField();
        btpAuthPanel.add(tokenField, cc.xy(3, 5));
        messageField = new JLabel();
        messageField.setText(" ");
        btpAuthPanel.add(messageField, cc.xy(3, 1));
        usernameLabel.setLabelFor(usernameField);
        tokenLabel.setLabelFor(tokenField);
        messageField.setLabelFor(usernameField);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return btpAuthPanel;
    }
}
