package model;

import java.awt.*;

/**
 * Created by Сергей on 18.09.2018.
 */
public interface ScreenSize {

     static double getWidthApp() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double widthSc = screenSize.getWidth();
        double heightSc = screenSize.getHeight();

        if (widthSc > heightSc) widthSc = heightSc;
         return widthSc;
      }
}
