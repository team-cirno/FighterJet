package Object;

import java.awt.*;

public class GameObject {



    String Title;

    Integer teamtag;

    ObjectImage image;

    Integer x,y,w,l,vx,vy;

    Integer life;

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
