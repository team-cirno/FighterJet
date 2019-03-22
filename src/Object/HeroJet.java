package Object;

import java.util.ArrayList;

public class HeroJet extends Fighter {
    public HeroJet() {
        super("Hero", 200, 450, 0, 0, 1);
        load();
    }

    @Override
    public void load() {
        ArrayList<String> tmp =new ArrayList<String>();
        tmp.add("red/hero1.png");
        tmp.add("red/hero1.png");
        this.anime=new Animetion(tmp);
        anime.load();
        this.w=anime.getW();
        this.h=anime.getH();
    }
}
