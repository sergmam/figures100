package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Сергей on 10.09.2018.
 */
public interface GameConstants {
    final double A = 50;          //Basic dimension of figure
    final int NUMBER_OF_LEVELS = 100;
    final Map<String, double[]> X_COORD = new HashMap<String, double[]>() {{
         put("Triangle", new double[]{0, A, A});
         put("SmallTrapezium", new double[]{0, A, A, 0});
         put("BigTrapezium", new double[]{0, A, A, 0});
         put("Pentagon", new double[]{0, A,
                 A,
                 A / Math.sqrt(2),
                 0});
    }};
    final Map<String, double[]> Y_COORD = new HashMap<String, double[]>() {{
         put("Triangle", new double[]{A, 0, A});
         put("SmallTrapezium", new double[]{A, 0, A * Math.sqrt(2),
                 A * Math.sqrt(2)});
         put("BigTrapezium", new double[]{0, A, A * 3,
                 A * 3});
         put("Pentagon", new double[]{0, A,
                 A * (1 + Math.sqrt(2)),
                 A *(1 + Math.sqrt(2) - 1 / Math.sqrt(2) * Math.sqrt((3 - 2 * Math.sqrt(2)))),
                 A * 2 * Math.sqrt(2)});
    }};
    final double START_DX = 230;
    final Map<String, Double> START_DY = new HashMap<String, Double>() {{
        put("Triangle", 10.0);
        put("SmallTrapezium", A + 20);
        put("BigTrapezium", A + A * Math.sqrt(2) + 30);
        put("Pentagon", A + A * Math.sqrt(2) + A * 3 + 40);

    }};
    final double ANGLE = Math.PI/4;

    final String PATH_TO_JSON = "src/main/resources/";
}
