package Object;

import java.util.ArrayList;

public class Matrix {

    ArrayList<GameObject> gl;

    public Matrix(){
        gl=new ArrayList<GameObject>();
    }

    public void update() {
        for (GameObject x : gl) {
            x.setX(x.getX() + x.getVx() / 2);
            x.setY(x.getY() + x.getVy() / 2);
        }

        calu();
    }

    public void calu(){

    }

    public void addObject(GameObject gameObject){
        gl.add(gameObject);
    }
}
