package controller;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static utils.GameConstants.PATH_TO_JSON;

/**
 * Created by Юля on 25.09.2018.
 */
public interface FindPlayerName {

    static List<String> findPlayerName() {
        System.out.println("findPlayerName");
        List<String> names = new ArrayList<>();
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(PATH_TO_JSON + "playersName.json"));
            Result result = gson.fromJson(br, Result.class);
            System.out.println(result);
            if (result != null) {
                for (Todo t : result.getNames()) {
                    System.out.println(t.getId() + " - " + t.getPlayerName());
                    names.add(t.getPlayerName());

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
        return names;
    }
}


