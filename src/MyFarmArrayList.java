import java.util.ArrayList;

public class MyFarmArrayList {
    public ArrayList<Plot> row = new ArrayList<Plot>();
    public Plot[] arr = new Plot[10];
    public MyFarmArrayList() {
        System.out.println("My farm using array list");
        //arr[0] = new Plot();
        //arr[0].printPlot();

        for(Plot a : row) {
            System.out.println(row.size());
            row.add(new Plot());
            a.printPlot();
        }

        for(int p=0; p<10; p++) {
            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();
        }
        row.add(new Plot());
        System.out.println(row.size());

        totalPlants();
        printPlantNames();
        addSunflower();
        addCorn();
        printPlantNames();

    }
    public void totalPlants() {
        int total = 0;
        for(Plot a : row) {
            total += a.numberofplants;
        }
        System.out.println("total plants in my farm is " + total + "!");
    }

    public void printPlantNames() {
//        for (Plot k: row) {
//            System.out.print(k.plantname + "\t");
//        }
        for(int k=0; k<row.size(); k++) {
            System.out.print(k + ": " + row.get(k).plantname + "\t");
        }
        System.out.println();
    }

    public void addSunflower() {
        Plot sunflower = new Plot();
        sunflower.plantname = "sunflower";
        sunflower.printPlot();
        sunflower.numberofplants = 42;
        sunflower.needswater = true;

        row.add(sunflower);
    }

    public void addCorn() {
        Plot corn = new Plot();
        corn.plantname = "corn";
        corn.printPlot();
        corn.numberofplants = 70;
        corn.needswater = false;
        corn.printPlot();

        row.add(3, corn);
    }
}

//hw: go to w3schools.com/java/java_arraylist.app and find some way to change row?
