import java.util.ArrayList;

public class MyFarmArrayList {
    public ArrayList<Plot> row = new ArrayList<Plot>();
    public Plot[] arr = new Plot[10];
    public MyFarmArrayList() {
        System.out.println("My farm using array list");
        //arr[0] = new Plot();
        //arr[0].printPlot();

        for(int p=0; p<10; p++) {
            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();
            for (Plot e: row) {
                System.out.println(e);
            }
        }
        row.add(new Plot());
//        System.out.println(row.get(1));
//        row.size();
    }
}

//hw: go to w3schools.com/java/java_arraylist.app and find some way to change row?
