package model;


import utils.GameConstants;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Сергей on 07.09.2018.
 */
public class StartPanel extends JPanel {

    private Image img;
    private boolean isActivated;

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public StartPanel() {
        this.img = new ImageIcon("src/main/resources/dry_leaf.jpg").getImage();
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

        setOpaque(true);
        setSize(getWidth(), getHeight());
        setVisible(true);


//        Figure triangle0 = new Figure((Rotateable.getCoord(Figure.X_COORD.get("Triangle"),
//                Figure.Y_COORD.get("Triangle"), Math.PI).get("x")),
//                (Rotateable.getCoord(Figure.X_COORD.get("Triangle"),
//                        Figure.Y_COORD.get("Triangle"), Math.PI).get("y")),
//                 60,  -65, Color.YELLOW, " ", "Figure");
//        Figure triangle1 = new Figure((Rotateable.getCoord(Figure.X_COORD.get("Triangle"),
//                Figure.Y_COORD.get("Triangle"), 0).get("x")),
//                (Rotateable.getCoord(Figure.X_COORD.get("Triangle"),
//                        Figure.Y_COORD.get("Triangle"), 0).get("y")),
//                ScreenSize.getWidthApp()/2-75,  ScreenSize.getWidthApp()/2 + 95, Color.YELLOW, " ", "Figure");


//        Figure startButton = new Figure((Rotateable.getCoord(Figure.X_COORD.get("BigTrapezium"),
//                Figure.Y_COORD.get("BigTrapezium"), Math.PI/4).get("x")),
//                (Rotateable.getCoord(Figure.X_COORD.get("BigTrapezium"),
//                        Figure.Y_COORD.get("BigTrapezium"), Math.PI/4).get("y")),
//                150, 100, Color.BLUE, "PLAY", "Button");
//
//        Figure exitButton = new Figure((Rotateable.getCoord(Figure.X_COORD.get("SmallTrapezium"),
//                 Figure.Y_COORD.get("SmallTrapezium"), Math.PI/4).get("x")),
//                (Rotateable.getCoord(Figure.X_COORD.get("SmallTrapezium"),
//                        Figure.Y_COORD.get("SmallTrapezium"), Math.PI/4).get("y")),
//                ScreenSize.getWidthApp()/2-120, 400, Color.GREEN, "EXIT", "Button");
////        GameNavigationButton startButton = new GameNavigationButton(xCoord,
////                yCoord, Color.BLUE, "PLAY");
////        startButton = new JButton("Start");
////        exitButton = new JButton("Exit");
////        startButton.setBounds( 400/2 - 50,200,100,50);
////        exitButton.setBounds( 400/2 - 50,250,100,50);
////
////        startButton.setAlignmentX(CENTER_ALIGNMENT);
////
//         add(startButton);
//         add(exitButton);
//         add(triangle0);
//         add(triangle1);
        NavigateButton startBut = new NavigateButton("startButton");
        NavigateButton newBut = new NavigateButton("newGameButton");
        NavigateButton infoBut = new NavigateButton("infoButton");
        NavigateButton exitButton = new NavigateButton("exitButton");
//        if (isActivated) {
//            startBut.setEnable(true);
//            newBut.setEnable(true);
//            infoBut.setEnable(true);
//            exitButton.setEnable(true);
//        } else {
//            startBut.setEnable(false);
//            newBut.setEnable(false);
//            infoBut.setEnable(false);
//            exitButton.setEnable(false);
//        }
//        JLabel label = new JLabel();
//        label.setBounds(0, 0, 400, 600);
//        label.add(startBut);
//
        add(newBut);
        add(infoBut);
        add(startBut);
        add(exitButton);
//        add(label);
//        System.out.println(startBut.getBounds());
////        label.addMouseListener(new MouseAdapter() {
////            @Override
////            public void mouseClicked(MouseEvent e) {
//////                     System.out.println("e.x " + e.getX() + " e.y " + e.getY() +
//////                             "   Start: x " +  startBut.getX() + " y " + startBut.getY() +
//////                             " w " + startBut.getWidth()+ " h " + startBut.getHeight());
//////                System.out.println("e.x " + e.getX() + " e.y " + e.getY() +
//////                        "   Exit: x " + exitButton.getX() + " y " + exitButton.getY() +
//////                        " w " + exitButton.getWidth() + " h " + exitButton.getHeight());
//////
////                switch (NavButtonClicked.getNameBut(e.getX(), e.getY())) {
////                    case "start":
////                        System.out.println("Click Start");
////                        isVisibleStartPanel= false;
////                        System.out.println(isVisibleStartPanel);
////                        repaint();
////                        break;
////                    case "exit":
////                        System.out.println("Click Exit");
////                        System.exit(0);
////                        break;
////                    case "new":
////                        System.out.println("Click New");
////                        break;
////                    case "info":
////                        System.out.println("Click Info");
////                        break;
////                }
////
////            }
////        });
    }


    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, (int) (GameConstants.WIDTH), (int) (GameConstants.WIDTH * 1.5), null);

//        g.drawImage(imgStartButton, 60, 200, (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
//        g.drawImage(imgExitButton, (int) (ScreenSize.getWidthApp()/3-20), (int) (ScreenSize.getWidthApp()/3*1.5), (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
//        g.drawImage(imgInfoButton, (int) (ScreenSize.getWidthApp()/3), 30, (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);
//        g.drawImage(imgNewButton, 10, 30, (int) (ScreenSize.getWidthApp()/2), (int) (ScreenSize.getWidthApp()/2*1.5), null);

    }


}
