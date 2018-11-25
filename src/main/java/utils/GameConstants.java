package utils;

import model.ScreenSize;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Сергей on 10.09.2018.
 */
public interface GameConstants {
    int WIDTH = (int) (ScreenSize.getWidthApp() / 2);
    final int NUMBER_OF_LEVELS = 100;
    final double ANGLE = Math.PI/4;

    final String PATH_TO_JSON = "src/main/resources/json/";
    final String PATH_TO_RES = "src/main/resources/";
}
