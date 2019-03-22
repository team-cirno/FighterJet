package Object;

import java.awt.*;

public class GameObject {



    String Title;

    Integer teamtag;

    ObjectImage image;

    Integer x,y,w,l,vx,vy;

    Integer life;

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

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
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

    public GameObject(String title, Integer teamtag, Object.ObjectImage image, Integer x, Integer y, Integer w, Integer l, Integer vx, Integer vy, Integer life) {
        Title = title;
        this.teamtag = teamtag;
        this.image = image;
        this.x = x;
        this.y = y;
        this.w = w;
        this.l = l;
        this.vx = vx;
        this.vy = vy;
        this.life = life;
    }

    @Override
    public String toString() {
        return "GameObject{" +
                "Title='" + Title + '\'' +
                ", teamtag=" + teamtag +
                ", image=" + image +
                ", x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", l=" + l +
                ", vx=" + vx +
                ", vy=" + vy +
                ", life=" + life +
                '}';
    }
}
