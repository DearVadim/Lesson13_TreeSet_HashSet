
public class Results implements Comparable<Results>{
    private String name;
    private int time;

    public Results(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Results o) {
        if(time > o.getTime()){
            return 1;
        }else if (time < o.getTime()){
            return -1;
        }else if (name.equals(o.getName())){
            return 0;
        }else {
            return 1;
        }
    }
}
