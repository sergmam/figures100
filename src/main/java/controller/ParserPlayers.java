package controller;

import com.google.gson.Gson;
import utils.Player;
import utils.Players;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static utils.GameConstants.PATH_TO_JSON;

/**
 * Created by Сергей on 27.09.2018.
 */
public class ParserPlayers {

    public ParserPlayers() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(PATH_TO_JSON
                    + "players.json"));
            Players players = gson.fromJson(br, Players.class);
            if (players != null) {
                for (Player p : players.getPlayers()) {
                    System.out.println(p.getPlayerID()
                            + " - " + p.getPlayerName()
                            + " - " + p.getCountPassedLevels()
                            + " - " + p.getPassedLevels());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
