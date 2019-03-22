package Object;

import Core.Core;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.lang.Math;


public class Matrix {

    ArrayList<GameObject> gl;

    public Matrix(){
        Core.getLogger().Log(this,"Building Matrix");
        gl = new ArrayList<GameObject>();
    }

    public void update() {
        for (GameObject x : gl) {
            x.setX(x.getX() + x.getVx() / 2);
            x.setY(x.getY() + x.getVy() / 2);
        }

        calu();
    }

    public void calu(){
        Integer x1,x2,y1,y2;
        for(int i = 0;i<gl.size();i++){
            for(int j = 0;j<gl.size();j++){
                if(i!=j){
                    x1=gl.get(i).getX();
                    x2=gl.get(j).getX();
                    y1=gl.get(i).getY();
                    y2=gl.get(j).getY();

                    double distent = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

                    if(distent<5&&(gl.get(i).getTeamtag()+gl.get(j).getTeamtag())==3){
                        gl.get(i).dmg();
                        gl.get(j).dmg();
                    }
                }
            }
        }

        for(int i = 0;i<gl.size();i++){
            if(gl.get(i).getLife()<=0){
                gl.remove(i);
            }
        }
    }

    public void addObject(GameObject gameObject){
        gl.add(gameObject);
    }

    public void paint(Graphics g, JPanel j){
        for(GameObject x : gl){
            g.drawImage(x.getImage(), x.getX(),x.getY(),x.getW(),x.getH(),j);
        }
    }
}
