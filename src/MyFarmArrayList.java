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
        tomatoLocations();
        totalCarrots();
        averagePlants();
        carrotPlantsNum();

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

    public void tomatoLocations() {
        for(int m=0; m<row.size(); m++) {
            if(row.get(m).plantname.equals("tomato")) {
                System.out.println(m);
            }
        }
    }

    public void totalCarrots() {
        int numberofcarrots = 0;
        for(Plot b:row) {
            if(b.plantname.equals("carrot"))
            numberofcarrots += b.numberofplants;
        }
        System.out.println("There are " + numberofcarrots + " carrots!");
    }

    public void averagePlants() {
        int totalnumofplants = 0;
        for(Plot a : row) {
            totalnumofplants += a.numberofplants;
        }
        int totalplots = 0;
        for(int p=0; p<row.size(); p++) {
            if(row.get(p).numberofplants>0) {
                totalplots=totalplots+1;
            }
        }
        System.out.println("Avg num of plants is " + (totalnumofplants/totalplots));
    }

    public void carrotPlantsNum() {
        int carrotplants = 0;
        for(int c=0; c<row.size(); c++) {
            if(row.get(c).plantname.equals("carrot")) {
                carrotplants+=row.get(c).numberofplants;
            }
        }
        System.out.println(carrotplants);
    }
}