package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import static utils.GameConstants.PATH_TO_JSON;

/**
 * Created by Юля on 25.09.2018.
 */
public class NewPlayer {
    Gson gson;
    public NewPlayer() {
        Todo t1 = new Todo();
        t1.setId(1);
        t1.setPlayerName("New Player");
        Todo t2 = new Todo();
        t2.setId(5);
        t2.setPlayerName("New 5xxx");
        Result r = new Result();
        r.setTodos(Arrays.asList(t1, t2));
// used to pretty print result
        gson = new  GsonBuilder().setPrettyPrinting().

                create();

        String strJson = gson.toJson(r);
        FileWriter writer = null;
        try   {
            writer = new FileWriter(PATH_TO_JSON + "playersName.json");
            writer.write(strJson);
        } catch (
                IOException e)

        {
            e.printStackTrace();
        } finally

        {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
