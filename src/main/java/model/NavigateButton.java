package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Сергей on 22.09.2018.
 */
public class NavigateButton extends JComponent{
    private String nameButton;
    private Image img;
    private int x, y, width, height;
    private final int WIDTH = (int) (ScreenSize.getWidthApp() / 2);
    private final String PATH_IMG = "src/main/resources/";
    Image dimg;
    JLabel label = new JLabel();
    NavigateButton(String nameButton) {
        super();
        this.nameButton = nameButton;

        switch (nameButton) {
            case "startButton":
                this.img = new ImageIcon(PATH_IMG + "startButtonWood.png").getImage();
                this.x = 10;
                this.y = WIDTH/3;
                System.out.println(WIDTH);
                this.width = WIDTH;
                this.height = (int) (WIDTH * 1.5);

//                label.setIcon((Icon) img);
                break;
            case "exitButton":
                this.img = new ImageIcon(PATH_IMG + "exitButtonWood.png").getImage();
                this.x =  (WIDTH / 3);
                this.y = (int) (WIDTH/1.7);
                this.width = WIDTH;
                this.height = (int) (WIDTH * 1.5);
                break;
            case "infoButton":
                this.img = new ImageIcon(PATH_IMG + "infoButtonWood.png").getImage();
                this.x = (WIDTH / 3);
                this.y = 10;
                this.width = WIDTH;
                this.height = (int) (WIDTH * 1.5);
                break;
            case "newGameButton":
                this.img = new ImageIcon(PATH_IMG + "newButtonWood.png").getImage();
                this.x = 5;
                this.y = WIDTH/5;
                this.width = WIDTH;
                this.height = (int) (WIDTH * 1.5);
        }
        label.setBounds(0,0,img.getWidth(this)/10,
                img.getHeight(this)/10);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println(getName());
            }
        });
    }


    public String getNameButton() {
        return nameButton;
    }

    public Image getImg() {
        return img;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void paintComponent(Graphics g) {

        g.drawImage( img, getX(), getY(),label.getWidth(), label.getHeight(), this);
    }
}
