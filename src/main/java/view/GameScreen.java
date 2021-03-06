package view;

import controller.NavButtonClicked;
import controller.SavePlayers;
import model.*;
import utils.GameConstants;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;


/**
 * Created by Сергей on 07.09.2018.
 */
public class GameScreen extends JFrame implements GameConstants {
    StartPanel startPanel;
    LevelsPanel levelsPanel;
    boolean isPlay = false;
    PanelPlayers panelPlayers;

    GameScreen() throws IOException {
        super("100 Figures");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(GameConstants.WIDTH, (int) (GameConstants.WIDTH * 1.5));
        setLocationRelativeTo(null);
        setUndecorated(true);
        setResizable(false);

        JComponent jLayeredPane = getLayeredPane();
        jLayeredPane.setOpaque(false);

        startPanel = new StartPanel();
        startPanel.setActivated(true);

        jLayeredPane.add(startPanel, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (startPanel.isEnabled()) {
                    switch (NavButtonClicked.getNameBut(e.getX(), e.getY())) {
                        case "start":
                            System.out.println("Click Start");
                            panelPlayers = new PanelPlayers();
                            panelPlayers.setEnabled(true);
                            jLayeredPane.add(panelPlayers, JLayeredPane.DRAG_LAYER);
                            isPlay = true;
                            break;
                        case "exit":
                            System.out.println("Click Exit");
                            System.exit(0);
                            break;
                        case "new":
                            System.out.println("Click New");
                            String newPlayer = new PlayerDialog().getInputName();
                            if (newPlayer != null) {
                                SavePlayers sp = new SavePlayers(newPlayer);
                                isPlay = true;
                            } else {
                                isPlay = false;
                            }
                            break;
                        case "info":
                            System.out.println("Click Info");
                            break;
                    }
                }
                if (isPlay) {
                    startPanel.setVisible(false);
                    levelsPanel = new LevelsPanel();
                    levelsPanel.setActivated(true);
                    startPanel.setActivated(false);
                    jLayeredPane.add(levelsPanel, JLayeredPane.DEFAULT_LAYER);
                }
//                System.out.println("levelsPanel.isActivated() " +levelsPanel.isActivated());
                if (levelsPanel.isActivated()) {
                    switch (NavButtonClicked.getNameBut(e.getX(), e.getY())) {
                        case "exitSmall":
                            System.out.println("Click ExitSmall");
                            System.exit(0);
                            levelsPanel.setActivated(false);
                            break;
                    }
                }
            }
        });

//        ObjectMapper mapper = new ObjectMapper();
//
////////запись в JSON File//////////////////////////////////////////////////////////
////        final Map<String, Level> dataLevel = new HashMap<String, Level>() {{
////            put("1", new Level(new double[]{1,1,1}, new double[]{1,1,1}, 3));
////            put("2", new Level(new double[]{2,2,2,2}, new double[]{2,2,2,2}, 4));
////         }
////        };
////        try {
////            mapper.writeValue(new File("src/main/resources/levels.json"), dataLevel);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//////// ///////////////////////////////////////////////////////////////////////////////////////
//
//
/////////Извлечение и замена данных в JSON File/////////////////////////////////////////////////
//        Map<String, Object> map0 = mapper.readValue(
//                        new File(PATH_TO_JSON + "levels.json"),
//                        new TypeReference<Map<String, Object>>() {});
////        System.out.println("map0.get(\"3\")      " +  map0.get("Level 3"));
//        JSONObject myJsonobject = new JSONObject(map0);
////        System.out.println("String.valueOf(myJsonobject):    " + String.valueOf(myJsonobject));
//        Map<String, Level> map =
//                new Gson().fromJson(String.valueOf(myJsonobject), new TypeToken<HashMap<String, Level>>() {}.getType());
////        System.out.println("map:         " + map.get("Level 3"));
//        Level l = map.get("Level 1");
//        map.get("Level 3").setX(new double[]{100,100,100});
//        map.get("Level 1").setP(5);
//        map.get("Level 1").setActive(false);
//
//        double[] xx = l.getX();
//        double[] yy = l.getY();
//
//        for(int i =0; i < xx.length; i++) {
//            System.out.println("xx :   " + xx[i] + "   yy :   " + yy[i]);
//        }
//        System.out.println("isActive :   " + l.isActive() + "   isPassed :   " + l.isPassed() +
//                "    backImage :   " + l.getBackImage() + "   p :   " + l.getP());
//        try {
//            mapper.writeValue(new File(PATH_TO_JSON + "levels.json"),new JSONObject(map));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        setVisible(true);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GameScreen();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
//        Object obj = new JSONParser().parse(new FileReader("src/main/resources/levels.json"));
//
//        // typecasting obj to JSONObject
//        JSONObject jo = (JSONObject) obj;
//
//        // getting firstName and lastName
//        String firstName = (String) jo.get("firstName");
//        String lastName = (String) jo.get("lastName");
//
//        System.out.println(firstName);
//        System.out.println(lastName);
//
//        // getting age
//        long age = (long) jo.get("age");
//        System.out.println(age);
//
//        // getting address
//        Map address = ((Map) jo.get("address"));
//
//        // iterating address Map
//        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
//        while (itr1.hasNext()) {
//            Map.Entry pair = itr1.next();
//            System.out.println(pair.getKey() + " : " + pair.getValue());
//        }
//
//        // getting phoneNumbers
//        JSONArray ja = (JSONArray) jo.get("phoneNumbers");
//        // iterating phoneNumbers
//        Iterator itr2 = ja.iterator();
//
//        while (itr2.hasNext()) {
//            itr1 = ((Map) itr2.next()).entrySet().iterator();
//            while (itr1.hasNext()) {
//                Map.Entry pair = itr1.next();
//                System.out.println(pair.getKey() + " : " + pair.getValue());
//            }
//        }
    }
}
