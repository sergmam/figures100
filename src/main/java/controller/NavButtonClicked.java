package controller;

import model.ScreenSize;

/**
 * Created by Сергей on 23.09.2018.
 */
public interface NavButtonClicked {
    int WIDTH = (int) (ScreenSize.getWidthApp() / 2);

    static String getNameBut(int x, int y) {
        String nameBut = "";
        System.out.println("x: " + x + " y; " + y);
        if ((x > WIDTH / 4 && x < WIDTH / 2) &&
                (y > WIDTH - WIDTH / 20 && y < WIDTH + WIDTH / 5)) {
            nameBut = "start";
//            System.out.println("Click START");
        } else if ((x > WIDTH - WIDTH / 3 && x < WIDTH - WIDTH / 6) &&
                (y > 1.25*WIDTH   && y < 1.45*WIDTH  )) {
            nameBut = "exit";
        } else if ((x > WIDTH/1.28 && x < WIDTH /1.1) &&
                (y > 1.25*WIDTH   && y < 1.43*WIDTH  )) {
            nameBut = "exitSmall";
//            System.out.println("Click EXIT");
        } else if ((x > WIDTH/4 && x < WIDTH /2) &&
                (y > WIDTH/2 - WIDTH / 10 && y < WIDTH - WIDTH / 3)) {
            nameBut = "new";
//            System.out.println("Click MEW");
        }else if ((x > WIDTH/1.5 && x < WIDTH-WIDTH/7) &&
                (y > WIDTH/5 && y < WIDTH/2.3)) {
            nameBut = "info";
//            System.out.println("Click INFO");
        }
        return nameBut;
    }
}
