package controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Сергей on 18.09.2018.
 */
public interface Rotateable {

    static Map<String,double[]> getCoord(double[] x, double[] y, double angle){

        double[] xCoord = new double[x.length];
        double[] yCoord = new double[x.length];
        for (int i = 0; i < x.length; i++){
            xCoord[i] = 0;
            yCoord[i] = 0;
        }

        double cosA = Math.cos(angle), sinA = Math.sin(angle);

        for(int i = 0; i < x.length; i++){
            xCoord[i] = (x[i] - x[0]) * cosA - (y[i] - y[0]) * sinA + x[0];
            yCoord[i] = (y[i] - y[0]) * cosA + (x[i] - x[0]) * sinA + y[0];
        }

        Map<String,double[]> coord = new HashMap<String, double[]>() {{
            put("x", xCoord);
            put("y", yCoord);
        }};

        return coord;
    }
}
