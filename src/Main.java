import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Results> results = new TreeSet<Results>();
        long StartTime, ElapsedTime;

        LinkedList<Integer> LLI = new LinkedList<>();
        StartTime = System.currentTimeMillis();
        for(int i = 500000; i >= 1; i--){
            LLI.add(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Add 500 000 elements to LinkedList<Integer> (without ensureCapacity)",(int) ElapsedTime));

        ArrayList<Integer> ALI = new ArrayList<>();
        StartTime = System.currentTimeMillis();
        for(int i = 500000; i >= 1; i--){
            ALI.add(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Add 500 000 elements to ArrayList<Integer> without ensureCapacity",(int) ElapsedTime));

        ArrayList<Integer> ALIC = new ArrayList<>();
        ALIC.ensureCapacity(500000);
        StartTime = System.currentTimeMillis();
        for(int i = 500000; i >= 1; i--){
            ALIC.add(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Add 500 000 elements to ArrayList<Integer> with ensureCapacity",(int) ElapsedTime));

        HashSet<Integer> HSI = new HashSet<>();
        StartTime = System.currentTimeMillis();
        for(int i = 500000; i >= 1; i--){
            HSI.add(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Add 500 000 elements to HashSet<Integer> (without ensureCapacity)",(int) ElapsedTime));

        TreeSet<Integer> TSI = new TreeSet<>();
        StartTime = System.currentTimeMillis();
        for(int i = 500000; i >= 1; i--){
            TSI.add(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Add 500 000 elements to TreeSet<Integer> (without ensureCapacity)",(int) ElapsedTime));


        for(Results result:results){
            System.out.println(result.getName() + ": " + result.getTime());
        }

        System.out.println("---------------------------------");

        results = new TreeSet<Results>();

        StartTime = System.currentTimeMillis();
        System.out.printf("Find element 250000 in LinkedList<Integer>: %b\n", LLI.contains(250000));
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Find element in LinkedList<Integer> (without ensureCapacity)",(int) ElapsedTime));

        StartTime = System.currentTimeMillis();
        System.out.printf("Find element 250000 in ArrayList<Integer> without ensureCapacity: %b\n", ALI.contains(250000));
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Find element in ArrayList<Integer> without ensureCapacity",(int) ElapsedTime));

        StartTime = System.currentTimeMillis();
        System.out.printf("Find element 250000 in ArrayList<Integer> with ensureCapacity %b\n", ALIC.contains(250000));
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Find element in ArrayList<Integer> with ensureCapacity",(int) ElapsedTime));

        StartTime = System.currentTimeMillis();
        System.out.printf("Find element 250000 in HashSet<Integer>: %b\n", HSI.contains(250000));
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Find element in HashSet<Integer> (without ensureCapacity)",(int) ElapsedTime));

        StartTime = System.currentTimeMillis();
        System.out.printf("Find element 250000 in TreeSet<Integer>: %b\n", TSI.contains(250000));
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Find element in TreeSet<Integer> (without ensureCapacity)",(int) ElapsedTime));

        System.out.println("");

        for(Results result:results){
            System.out.println(result.getName() + ": " + result.getTime());
        }

        System.out.println("---------------------------------");

        results = new TreeSet<Results>();

        StartTime = System.currentTimeMillis();
        for(int i = 499999; i >= 0; i--){
            LLI.remove(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Removing 500 000 elements in LinkedList<Integer> (without ensureCapacity)",(int) ElapsedTime));

        StartTime = System.currentTimeMillis();
        for(int i = 499999; i >= 0; i--){
            ALI.remove(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Removing 500 000 elements in ArrayList<Integer> without ensureCapacity",(int) ElapsedTime));

        StartTime = System.currentTimeMillis();
        for(int i = 499999; i >= 0; i--){
            ALIC.remove(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Removing 500 000 elements in ArrayList<Integer> with ensureCapacity",(int) ElapsedTime));

        StartTime = System.currentTimeMillis();
        for(int i = 500000; i >= 1; i--){
            HSI.remove(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Removing 500 000 elements in HashSet<Integer> (without ensureCapacity)",(int) ElapsedTime));

        StartTime = System.currentTimeMillis();
        for(int i = 500000; i >= 1; i--){
            TSI.remove(i);
        }
        ElapsedTime = System.currentTimeMillis() - StartTime;
        results.add(new Results("Removing 500 000 elements in TreeSet<Integer> (without ensureCapacity)",(int) ElapsedTime));


        for(Results result:results){
            System.out.println(result.getName() + ": " + result.getTime());
        }

    }
}