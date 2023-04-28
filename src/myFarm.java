public class myFarm {
    public static void main(String[] args) {
        myFarm charlie = new myFarm();
    }

    Plot [][] grid;
    public myFarm() {
        System.out.println("hello from my farm!");

        Plot ryan = new Plot();
        ryan.printPlot();

        //ryan.numberofplants

         grid = new Plot [10][3];

        for(int x=0; x<grid.length; x++) {
            for (int y=0; y < grid[x].length; y++) {
                grid[x][y] = new Plot();
                grid[x][y].printPlot();
            }
        }
        totalPlants();
        printPlantNames();
        }

    public void totalPlants() {
        int sumofplants = 0;

        for(int e=0; e<grid.length; e++) {
            for(int c=0; c<grid[e].length; c++) {
                //System.out.println(grid[e][c].numberofplants);
                sumofplants += grid[e][c].numberofplants;
            }
        }
        System.out.println(sumofplants);
    }

    public void printPlantNames() {

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.println("row: " + r + " col: " + c + " " + grid[r][c].plantname);
            }
        }
    }
}


