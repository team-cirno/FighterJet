package Core;

import Object.Matrix;
import UI.MainUI;
import Object.Fighter;

public class Core extends Thread{

    Boolean LIFE;
    Matrix matrix;
    MainUI mainUI;

    public Core() {
        this.LIFE = true;
        matrix=new Matrix();
        mainUI=new MainUI("MyGame",400,200);
    }

    public void load(){
        Loader.load(matrix);
        mainUI.display();
    }

    public void run() {


        while (LIFE) {
            matrix.update();
            mainUI.update(matrix);
        }
    }
}