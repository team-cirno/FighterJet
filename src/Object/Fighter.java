package Object;

public abstract class Fighter extends GameObject{


    public Fighter(String title, Integer x, Integer y, Integer vx, Integer vy,Integer teamtag) {
        super(title, x, y, vx, vy);
        this.teamtag=teamtag;
    }

    public Bullet shoot(){
        return new Bullet(this.x,this.y,this.teamtag);
    }
}