package UI;

import javax.swing.*;
import java.awt.*;
import Object.Matrix;

public class MainUI extends JFrame {

    String Title;
    Integer l,w;

    public MainUI(String title, Integer l, Integer w) throws HeadlessException {
        Title = title;
        this.l = l;
        this.w = w;

        this.setSize(new Dimension(l,w));
        this.setResizable(false);
    }

    public void load(){

    }

    public void display(){
        this.setVisible(true);
    }

    public void update(Matrix matrix) {

    }
}
