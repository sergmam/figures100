package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

/**
 * Created by Сергей on 13.09.2018.
 */
 public class Level implements Serializable {
    private double[] x;
    private double[] y;
    private int p;
    private boolean isActive;
    private boolean isPassed;
    private String backImage;


    public Level(double[] x, double[] y, int p, boolean isActive, boolean isPassed,
                 String backImage) {
        this.x = x;
        this.y = y;
        this.p = p;
        this.isActive = isActive;
        this.isPassed = isPassed;
        this.backImage = backImage;
    }

//        public String toString() {
//            return x + " : " + getY() + " : " + p;
//    }

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getY() {
        return y;
    }

    public void setY(double[] y) {
        this.y = y;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    public String getBackImage() {
        return backImage;
    }

    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }
}
