package controller;

import com.google.gson.Gson;
import utils.Player;
import utils.Players;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.GameConstants.PATH_TO_JSON;

/**
 * Created by Сергей on 27.09.2018.
 */
public class ParserPlayers {

    private int playerID;
    private String playerName;
    private List<String> names = new ArrayList<>();
    private int currentPlayerID;
    private String currentPlayername;
    private int passedLevelsCurrentPlayer;

    public ParserPlayers() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(PATH_TO_JSON
                    + "players.json"));
            Players players = gson.fromJson(br, Players.class);
            if (players != null) {
                for (Player p : players.getPlayers()) {
                    this.playerID = p.getPlayerID();
                    this.playerName = p.getPlayerName();
                    this.names.add(p.getPlayerName());
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

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public List<String> getListNames() {
        return names;
    }

    public String[] getPlayersName() {
        String[] playersName = new String[names.size()];
        for (int i = 0; i < names.size(); i++) {
            playersName[i] = names.get(i);
//            System.out.println("getPlayersName - " + playersName[i]);
        }
        return playersName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Player getCurrentPlayer(String name) {
        Player curPlayer = null;
        Gson gsonCur = new Gson();
        BufferedReader brCur = null;
        try {
            brCur = new BufferedReader(new FileReader(PATH_TO_JSON
                    + "players.json"));
            Players players = gsonCur.fromJson(brCur, Players.class);
            if (players != null) {
                for (Player p : players.getPlayers()) {
                    this.playerID = p.getPlayerID();
                    this.playerName = p.getPlayerName();
                    if (("Player: " + playerName).equals(name)) {
                        curPlayer = p;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return curPlayer;
    }
}
