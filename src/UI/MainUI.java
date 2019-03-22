package UI;

import javax.swing.*;
import java.awt.*;
import java.io.File;

import Core.Core;
import Object.GameObject;
import java.util.ArrayList;

import Object.Matrix;

public class MainUI extends JFrame {

    String Title;
    Integer l,w;
    Image background;
    ArrayList<GameObject>gl;
    Core core;
    JPanel jp;


    public MainUI(String title, Integer l, Integer w,Core core) throws HeadlessException {
        Core.getLogger().Log(this,"Building MainUI");
        Title = title;
        this.l = l;
        this.w = w;
        this.jp = new JPanel();
        this.setSize(new Dimension(l,w));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(jp);
        this.core=core;
    }

    public void load(){
            try
            {
                background = javax.imageio.ImageIO.read(new File("red/background.png"));
            }
            catch (Exception e) { Core.getLogger().Debug(this,"Image failed to load => "+"red/background.png"); /*handled in paintComponent()*/ }
    }

    public void display(){
        this.setVisible(true);
    }

    public void update(Matrix matrix) {

    }

    public void paint(Graphics g){
        if (background != null)
            g.drawImage(background, 0,0,this.getWidth(),this.getHeight(),jp);
        core.paintMartix(g,jp);
        g.drawString("amazing!",100,100);

    }
}
