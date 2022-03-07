package tools;

public class Chrono {
    private long start, end, total;
    private String name;
    
    public Chrono(String name){
        this.name = name;
        start = System.nanoTime();
    }

    public void stop(){
        end = System.nanoTime();
        total = (long) ((end- start)/1000.0);
    }

    public String toString(){
        String s = name;
        s += " : \t";
        s += total;
        s += " uS";
        return s;
    }
}
