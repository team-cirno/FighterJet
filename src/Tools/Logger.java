package Tools;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.ArrayList;

public class Logger {

    private ArrayList<Line> Lines;

    private class Line{

        private String type;
        private LocalTime time;
        private Object o;
        private String info;

        public Line(String type,Object o, String info){
            this.type=type;
            this.time=java.time.LocalTime.now();
            this.o=o;
            this.info=info;
        }

        @Override
        public String toString() {
            return type+'|'+ time.toString()+'|'+'['+o.getClass().getSimpleName()+']'+" : "+info;
        }
    }

    public Logger(){
        this.Lines = new ArrayList<Line>();
        this.Log(this,"Logger is on");
    }

    public void Log(Object o, String info){
        Line tmp = new Line("Log  ",o,info);
        this.Lines.add(tmp);
        if(Config.LoggerMod){
            System.out.println(tmp);
        }
    }

    public void Debug(Object o, String info){
        Line tmp = new Line("Debug",o,info);
        this.Lines.add(tmp);
        if(Config.DebugMod){
            System.out.println(tmp);
        }
    }

    private boolean Save(){
        if(!Config.LoggerSaveMod){
            return true;
        }
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(java.time.LocalDateTime.now().toString()+"Log.txt"));
            for (Line l : Lines)
                pw.println(l); // call toString() on club, like club.toString()
            pw.close();
        } catch (FileNotFoundException e) {
            this.Log(this,"Can not creat file.");
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean Close(){
        return this.Save();
    }
}
