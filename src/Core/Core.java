package Core;


import Object.*;
import Tools.Logger;
import UI.MainUI;
import Object.Fighter;

import javax.swing.*;
import java.awt.*;

public class Core extends Thread{

    Boolean LIFE;
    Matrix matrix;
    MainUI mainUI;
    public static Logger logger = new Logger();

    public Core() {
        logger.Log(this,"Building Core");
        this.LIFE = true;
        matrix=new Matrix();
        mainUI=new MainUI("MyGame",400,654,this);
        mainUI.load();
        Core.getLogger().Log(this,"Core build done");

    }

    public void load(){
        Core.getLogger().Log(this,"Lodding Core");
        Loader.load(matrix);
        matrix.addObject(new HeroJet());
        mainUI.display();
    }

    public void run() {
        Core.getLogger().Log(this,"Main Loop start");
        long startTime = System.currentTimeMillis();
        long cumTime = startTime;
        while (LIFE) {
            long timePassed = System.currentTimeMillis()-cumTime;
            cumTime+=timePassed;
            //update(timePassed)
            matrix.update();
            mainUI.update();


        }
    }

    public static Logger getLogger() {
        return logger;
    }

    public void paintMartix(Graphics g, JPanel mainUI) {
        matrix.paint(g,mainUI);
    }
}