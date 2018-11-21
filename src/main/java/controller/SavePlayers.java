package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import utils.Player;
import utils.Players;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import static utils.GameConstants.PATH_TO_JSON;

/**
 * Created by Сергей on 28.09.2018.
 */
public class SavePlayers {


    public SavePlayers(String newPlayerName) {
        Gson gson = new Gson();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(PATH_TO_JSON
                    + "players.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Players players = gson.fromJson(br, Players.class);

        if (players != null) {
            Player p1 = new Player();
            p1.setPlayerID(players.getPlayers().size() + 1);
            p1.setPlayerName(newPlayerName);
            p1.setPassedLevels( Arrays.asList(0) );

            players.addPlayer(p1);
// used to pretty print result
            gson = new GsonBuilder().setPrettyPrinting().create();
            String strJson = gson.toJson(players);
            FileWriter writer = null;
            try {
                writer = new FileWriter(PATH_TO_JSON + "players.json");
                writer.write(strJson);
            } catch (IOException e) {
                e.printStackTrace();
            } finally

            {
                if (writer != null) {
                    try {
                        writer.close();
                        for (Player p : players.getPlayers()) {
                            System.out.println(p.getPlayerID()
                                    + " - " + p.getPlayerName()
                                    + " - " + p.getCountPassedLevels()
                                    + " - " + p.getPassedLevels());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
