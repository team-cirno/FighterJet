package Core;

import Object.Matrix;
import UI.MainUI;
import Object.Fighter;

public class Core extends Thread{

    Boolean LIFE;
    Matrix matrix;
    MainUI mainUI;
    Fighter MainChar;

    public Core() {
        this.LIFE = true;
        matrix=new Matrix();
        mainUI=new MainUI("MyGame",400,200);
        Fighter MainChar = new Fighter();
    }

    public void load(){

        matrix.addObject(MainChar);
        mainUI.display();
    }

    public void run() {


        while (LIFE) {
            matrix.update();
            mainUI.update(matrix);
        }
    }
}