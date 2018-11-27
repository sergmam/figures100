package model;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Сергей on 27.09.2018.
 */
public class PlayerDialog {

    private List<JComponent> components;
    private String title;
    private int messageType;
    private JRootPane rootPane;
    private String[] options;
    private int optionIndex;
    private Color color;
    private int show;
    JOptionPane optionPane;

    public PlayerDialog() {

        components = new ArrayList<>();

        setTitle("Enter player name");

        addMessageText("New player: ");

        //addComponent(new HintTextField("Your name here"));
        setMessageType(JOptionPane.PLAIN_MESSAGE);

        setRootPane(null);

        setOptions(new String[]{"OK", "Cancel"});
        setOptionSelection(0);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public void addComponent(JComponent component) {
        components.add(component);
    }

    public void addMessageText(String messageText) {
        JLabel label = new JLabel("<html>" + messageText + "</html>");
        components.add(label);
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setOptionSelection(int optionIndex) {
        this.optionIndex = optionIndex;
    }

//    public int show()
//    {
//        UIManager UI=new UIManager();
//        UI.put("OptionPane.background", new ColorUIResource(132, 193, 64));
//        UI.put("Panel.background", new ColorUIResource(132, 193, 64));
//
//
//        int optionType = JOptionPane.OK_CANCEL_OPTION;
//        Object optionSelection = null;
//
//        if(options.length != 0)
//        {
//            optionSelection = options[optionIndex];
//        }
//
//        int selection = JOptionPane.showOptionDialog(rootPane,
//                components.toArray(), title, optionType, messageType, null,
//                options, optionSelection);
//        System.out.println("selection " + selection);
//        return selection;
//    }

    public static String getLineBreak() {
        return "<br>";
    }

    public String getInputName() {

        UIManager UI = new UIManager();
        UI.put("OptionPane.background", new ColorUIResource(132, 193, 64));
        UI.put("Panel.background", new ColorUIResource(132, 193, 64));

        String name = JOptionPane.showInputDialog(rootPane, components.toArray(), title, messageType);

        // System.out.println("PlayerDialog " + name);
        if (name == null) {
            JOptionPane.showMessageDialog(rootPane, "You didn't enter name!");
            return null;
        }
        return name;
    }
}
