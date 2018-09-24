package model;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Сергей on 23.09.2018.
 */
public class LevelsPanel extends JPanel {
    private final int WIDTH = (int) (ScreenSize.getWidthApp() / 2);

    private Image img;

    public LevelsPanel() {
        this.img = new ImageIcon("src/main/resources/grass.jpg").getImage();
//        this.imgStartButton = new ImageIcon("src/main/resources/startButtonWood.png").getImage();
//        this.imgExitButton = new ImageIcon("src/main/resources/exitButtonWood.png").getImage();
//        this.imgInfoButton = new ImageIcon("src/main/resources/infoButtonWood.png").getImage();
//        this.imgNewButton = new ImageIcon("src/main/resources/newButtonWood.png").getImage();
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
//        setPreferredSize(size);
//        setMinimumSize(size);
//        setMaximumSize(size);
        setSize(size);
        setLayout(null);
        NavigateButton exitButton = new NavigateButton("exitButton");

        JPanel totalPan = new JPanel(new BorderLayout());
        JPanel panel = new JPanel();


        panel.setLayout(new GridLayout(8,6,10,10));
        JButton button;
//        button.getPreferredSize();
//        panel.add(button,0,0);
//        panel.add(button,1,0);
//        panel.add(button,2,0);
        ImageIcon imageIcon = new ImageIcon("src/main/resources/4259.jpg");
        for(int i=1; i<38;i++){
            String sI= String.valueOf(i);
            JLabel label =new JLabel(imageIcon);
            label.setEnabled(false);
            panel.add(label);

        }
        panel.add(exitButton);
        panel.setBounds(10,10,WIDTH - 20, (int) (WIDTH*1.5)-20);
        totalPan.setBounds(10,10,WIDTH - 20, (int) (WIDTH*1.5)-20);

        panel.setOpaque(false);
        totalPan.setOpaque(false);
//        add(exitButton);
        totalPan.add(panel,BorderLayout.CENTER);
//        totalPan.add(exitButton,BorderLayout.SOUTH);
        add(totalPan);

        setOpaque(true);
        setSize(getWidth(), getHeight());
        setVisible(true);

    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, (int) (WIDTH), (int) (WIDTH * 1.5), null);

//        g.drawImage(imgStartButton, 60, 200, (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
//        g.drawImage(imgExitButton, (int) (ScreenSize.getWidthApp()/3-20), (int) (ScreenSize.getWidthApp()/3*1.5), (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
//        g.drawImage(imgInfoButton, (int) (ScreenSize.getWidthApp()/3), 30, (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
//        g.drawImage(imgNewButton, 10, 30, (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
    }
}
