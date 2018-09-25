package model;

import utils.GameConstants;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Сергей on 23.09.2018.
 */
public class LevelsPanel extends JPanel {

    private Image img;
    private boolean isActivated = false;

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public LevelsPanel() {
        this.img = new ImageIcon("src/main/resources/grass.jpg").getImage();

        setLayout(null);


        NavigateButton exitButton = new NavigateButton("exitButtonSmall");

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(6, 0, 10, 10));
        for (int i = 0; i < 40; i++) {
            String sI = String.valueOf(i);
            JLabel label = new JLabel();
            label.setText(sI);
            panel.add(label);
        }
        panel.setOpaque(false);
        panel.setBounds(10,10,GameConstants.WIDTH-20,400);
//        setLayout(new BorderLayout(10,10));
        add(panel);
        add(exitButton);
        setSize(GameConstants.WIDTH, (int) (GameConstants.WIDTH * 1.5));
        setOpaque(true);
        setVisible(true);

    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, (int) (GameConstants.WIDTH), (int) (GameConstants.WIDTH * 1.5), null);

//        g.drawImage(imgStartButton, 60, 200, (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
//        g.drawImage(imgExitButton, (int) (ScreenSize.getWidthApp()/3-20), (int) (ScreenSize.getWidthApp()/3*1.5), (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
//        g.drawImage(imgInfoButton, (int) (ScreenSize.getWidthApp()/3), 30, (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
//        g.drawImage(imgNewButton, 10, 30, (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
    }
}
