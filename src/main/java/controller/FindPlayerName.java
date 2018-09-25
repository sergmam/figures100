package controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import utils.GameConstants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static utils.GameConstants.PATH_TO_JSON;

/**
 * Created by Юля on 25.09.2018.
 */
public interface FindPlayerName {
    List<String> playerName = new ArrayList<>();
    static List<String> playerName() {

        /////////Извлечение и замена данных в JSON File/////////////////////////////////////////////////
//        JSONParser parser = new JSONParser();
//        Object obj = null;
//        try {
//            obj = parser.parse(new FileReader(GameConstants.PATH_TO_JSON +"playersName.json"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        JSONObject jsonObject =  (JSONObject) obj;
//        // loop array
//        JSONArray names = (JSONArray) jsonObject.get("names");
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            playerName.add(iterator.next());
//
//        }
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> list = null;
        try {
             list = mapper.readValue(
                            new File(PATH_TO_JSON + "playersName.json"),
                            new TypeReference<Map<String,Object>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject(list);
        List<String> stringList = Arrays.asList((String.valueOf(jsonObject)));

        System.out.println(stringList);
        return playerName;
    }

}
