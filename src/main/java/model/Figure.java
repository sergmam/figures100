package model;

import view.GameScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.HashMap;
import java.util.Map;

import static java.awt.geom.PathIterator.WIND_EVEN_ODD;

/**
 * Created by Сергей on 10.09.2018.
 */
public class Figure extends JComponent implements ScreenSize{

    private static double a = (ScreenSize.getWidthApp() - 100) / 10;

    static final Map<String, double[]> X_COORD = new HashMap<String, double[]>() {{
        put("Triangle", new double[]{ 0, a, a});
        put("SmallTrapezium", new double[]{0, a, a, 0});
        put("BigTrapezium", new double[]{0, a, a, 0});
        put("Pentagon", new double[]{0, a,
                a,
                 a / Math.sqrt(2),
                0});
    }};
    static final Map<String, double[]> Y_COORD = new HashMap<String, double[]>() {{
        put("Triangle", new double[]{a, 0, a});
        put("SmallTrapezium", new double[]{a, 0, a * Math.sqrt(2),
                a * Math.sqrt(2)});
        put("BigTrapezium", new double[]{0, a, a * 3,
                a * 3});
        put("Pentagon", new double[]{0, a,
                a * (1 + Math.sqrt(2)),
                a *(1 + Math.sqrt(2) - 1 / Math.sqrt(2) * Math.sqrt((3 - 2 * Math.sqrt(2)))),
                a * 2 * Math.sqrt(2)});
    }};

    private Color color;
    private double xCoordinates[];
    private double yCoordinates[];
    private double dX, dY;
    private String text, type;

    Figure( double xCoordinates[], double yCoordinates[],
           double dX, double dY, Color color, String text, String type) {
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
        this.color = color;
        this.dX = dX;
        this.dY = dY;
        this.text = text;
        this.type = type;
        setBounds(0,0, (int) (a * 10), (int) (a * 15));
        setOpaque(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
//        g2.setColor(Color.BLUE.darker());
//        g2.setColor(new Color(0f,0f,1f,.3f ));
//        g2.fill3DRect((int) (minCoordX() - 3), (int) (minCoordY() - 3),
//                (int)(maxCoordX() - minCoordX() + 7), (int) (maxCoordY() - minCoordY() + 7), false);
//
//        g2.draw3DRect((int) (minCoordX() - 5), (int) (minCoordY() - 5),
//                (int)(maxCoordX() - minCoordX() + 10), (int) (maxCoordY() - minCoordY() + 10), false);
//
        g2.setColor(color);
        GeneralPath path = new GeneralPath(WIND_EVEN_ODD, xCoordinates.length);
        // Adds point to the path by moving to the specified
        // coordinates.
        path.moveTo(xCoordinates[0] +  dX, yCoordinates[0] + dY);
        for (int i = 1; i < xCoordinates.length; i++) {
            // Adds a point to the path by drawing a straight
            // line from the current position to the specified
            // coordinates.
            path.lineTo(xCoordinates[i] +  dX, yCoordinates[i] + dY);
        }
        path.closePath();
        switch (type) {
            case "Figure":
                g2.fill(path);
                break;
            case "Button":
                g2.fill(path);


                g2.setFont(new Font("TimesRoman", Font.BOLD, 14));
                g2.setColor(Color.RED);
                g2.drawString(text, (int) (xCoordinates[0] + 10 + dX),
                        (int) (yCoordinates[yCoordinates.length - 1]  + dY));
                break;
            case "Target":
                g2.draw(path);
                break;
            case "Level":
                g2.draw(path);
                break;
        }
        repaint();
    }
}
