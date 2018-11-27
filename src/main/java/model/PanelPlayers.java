package model;

import controller.ParserPlayers;
import utils.GameConstants;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by Сергей on 25.11.2018.
 */
public class PanelPlayers extends JPanel {

    LabelPlayerName labelPlayerName;
    private ArrayList<JLabel> labelList;
    private JLabel[] jLabelArr;
    private Image img;
    ImageIcon imageIcon;

    public PanelPlayers() {
        this.img = new ImageIcon("src/main/resources/dry_leaf.jpg").getImage();
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setSize(size);
        setLayout(null);
        setOpaque(true);
        setSize(getWidth(), getHeight());
        setVisible(true);

        JPanel listPanel = new JPanel();
        listPanel.setOpaque(true);
        listPanel.setSize(getWidth(), getHeight());
        listPanel.setVisible(true);
        listPanel.setBounds(GameConstants.WIDTH / 2 - 100, GameConstants.WIDTH / 2, 200, 200);
        listPanel.setAlignmentY(100);
        listPanel.setOpaque(true);
        listPanel.setVisible(true);
        listPanel.setBackground(new ColorUIResource(132, 193, 64));
        listPanel.setBorder(BorderFactory.createMatteBorder(
                1, 3, 1, 3, Color.GREEN.darker().darker()));
        GridLayout gL = new GridLayout(0, 1);
        listPanel.setLayout(gL);

        JLabel list = new JLabel("List of players   ");
        //list.setIcon(new ImageIcon("src/main/resources/selectIcon.png"));
        list.setBorder(BorderFactory.createMatteBorder(
                1, 5, 1, 5, Color.GREEN.darker().darker()));
        list.setFont(new Font("Serif", Font.BOLD, 20));
        list.setForeground(Color.BLUE);
        list.setHorizontalAlignment(SwingConstants.CENTER);
        listPanel.add(list);

        ParserPlayers parserPlayers = new ParserPlayers();

        jLabelArr = new JLabel[parserPlayers.getListNames().size()];
        labelList = new ArrayList<>();
        for (int i = 0; i < parserPlayers.getListNames().size(); i++) {
            labelPlayerName = new LabelPlayerName();
//            labelPlayerName = new LabelPlayerName("Player: " + parserPlayers.getListNames().get(i), imageIcon, JLabel.EAST);
            labelPlayerName.setText("Player: " + parserPlayers.getListNames().get(i));
            jLabelArr[i] = labelPlayerName;
            listPanel.add(jLabelArr[i]);
            final int p = i;
            jLabelArr[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    jLabelArr[p].setForeground(Color.RED);
//                    System.out.println("Label " + jLabelArr[p] + " was clicked");
                }
            });
            jLabelArr[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    for (int j = 0; j < parserPlayers.getListNames().size(); j++) {
                        jLabelArr[j].setForeground(Color.BLUE);
                    }
                }

            });
        }

        imageIcon = new ImageIcon("src/main/resources/selectIcon20x20.png");
        JLabel labelSelect = new JLabel("Select ", imageIcon, JLabel.LEFT);

        labelSelect.setBorder(BorderFactory.createMatteBorder(
                1, 5, 1, 5, Color.GREEN.darker().darker()));
        labelSelect.setFont(new Font("Serif", Font.BOLD, 20));
        labelSelect.setForeground(Color.BLUE);
        labelSelect.setHorizontalAlignment(SwingConstants.RIGHT);
        listPanel.add(labelSelect);

        labelSelect.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                setEnabled(false);
            }
        });
        add(listPanel);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, (GameConstants.WIDTH), (int) (GameConstants.WIDTH * 1.5), null);
    }
}
