package Object;

import java.awt.*;
import java.util.ArrayList;

public abstract class GameObject {



    String Title;

    Integer teamtag;

    Animetion anime;

    Integer x,y,w,h,vx,vy;

    Integer life;

    ArrayList<String> sl;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Integer getTeamtag() {
        return teamtag;
    }

    public void setTeamtag(Integer teamtag) {
        this.teamtag = teamtag;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getH() {
        return h;
    }

    public void setL(Integer l) {
        this.h = l;
    }

    public Integer getVx() {
        return vx;
    }

    public void setVx(Integer vx) {
        this.vx = vx;
    }

    public Integer getVy() {
        return vy;
    }

    public void setVy(Integer vy) {
        this.vy = vy;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Image getImage(){
        return anime.getImage();
    }

    public void dmg(){
        this.life--;
    }

    public abstract void load();

    public GameObject(String title, Integer x, Integer y, Integer vx, Integer vy) {
        Title = title;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.teamtag=0;
        life=1;
    }

    @Override
    public String toString() {
        return "GameObject{" +
                "Title='" + Title + '\'' +
                ", teamtag=" + teamtag +
                ", anime=" + anime +
                ", x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                ", vx=" + vx +
                ", vy=" + vy +
                ", life=" + life +
                '}';
    }
}
