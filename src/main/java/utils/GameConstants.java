package utils;

import model.ScreenSize;


/**
 * Created by Сергей on 10.09.2018.
 */
public interface GameConstants {
    int WIDTH = (int) (ScreenSize.getWidthApp() / 2);
    int NUMBER_OF_LEVELS = 100;
    double ANGLE = Math.PI/4;

    String PATH_TO_JSON = "src/main/resources/json/";
    String PATH_TO_RES = "src/main/resources/";
}
