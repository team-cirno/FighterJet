package Object;

import Core.Core;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Animetion {

    ArrayList<Image> il;
    ArrayList<String> sl;
    Integer index,maxIndex;
    Integer w,h;



    public Animetion(ArrayList<String> sl) {
        this.sl = sl;
        this.il = new ArrayList<Image>();
    }

    public void load(){
        String tmp="";
        try
        {
            for(String x:sl)
            {
                tmp=x;
                il.add(javax.imageio.ImageIO.read(new File(x)));
            }
        }
        catch (Exception e) {  Core.getLogger().Debug(this,"Image failed to load => "+tmp+" : "+e.toString());/*handled in paintComponent()*/ }

        index=0;
        maxIndex=il.size();
        w=il.get(0).getWidth(null);
        h=il.get(0).getHeight(null);
    }

    public Integer getW() {
        return w;
    }

    public Integer getH() {
        return h;
    }

    public Image getImage(){
        if(index==maxIndex)
        {
            index=0;
            return il.get(maxIndex-1);
        }
        index++;
        return il.get(index-1);
    }

}
