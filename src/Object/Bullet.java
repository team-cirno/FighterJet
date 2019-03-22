package Object;

import java.util.ArrayList;

public class Bullet extends GameObject {

    public Bullet(Integer x, Integer y,Integer teamtag) {
        super("Bullet", x, y, 0, 0);
        this.teamtag=teamtag;
        this.vy=-(teamtag-2)*5;
    }

    @Override
    public void load() {
        ArrayList<String> tmp =new ArrayList<String>();
        tmp.add("red/bullet.png");
        this.anime=new Animetion(tmp);
        anime.load();
    }
}
