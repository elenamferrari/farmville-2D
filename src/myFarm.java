public class myFarm {
    public static void main(String[] args) {
        myFarm charlie = new myFarm();
    }

    Plot[][] grid;

    public myFarm() {
        System.out.println("hello from my farm!");

        Plot ryan = new Plot();
        ryan.printPlot();

        //ryan.numberofplants

        grid = new Plot[10][3];

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                grid[x][y] = new Plot();
                grid[x][y].printPlot();
            }
        }
        totalPlants();
        printPlantNames();
        totalCarrots();
        averagenumberofPlants();
        numberofTomatoPlots();
        numofEmptyPlots();
        everyOtherNeedsWater();
    }

    public void totalPlants() {
        int sumofplants = 0;

        for (int e = 0; e < grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
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

    public void totalCarrots() {
        int sumofcarrots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantname.equals("carrot")) {
                    sumofcarrots += grid[h][k].numberofplants;
                    //or, sumofcarrots=sumofcarrots+1;
                }
            }
        }
        System.out.println("The total carrots are " + sumofcarrots);
    }

    public void averagenumberofPlants() {
        int averagenumofplants = 0;
        int sumofplots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                averagenumofplants += grid[h][k].numberofplants;
                if (grid[h][k].numberofplants > 0) {
                    sumofplots = grid[h].length * grid[h][k].numberofplants;
                }
            }
        }
        System.out.println("the average number of plants per plot is " + averagenumofplants / sumofplots);
    }

    public void numberofTomatoPlots() {
        int tomatoplots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantname.equals("tomato")) {
                    tomatoplots = tomatoplots + 1;
                }
            }
        }
        System.out.println("There are " + tomatoplots + " tomato plots.");
    }

    public void numofEmptyPlots() {
        int emptyplots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantname.equals("empty")) {
                    emptyplots = emptyplots + 1;
                }
            }
        }
        System.out.println("There are " + emptyplots + " empty plots.");
    }

    public void everyOtherNeedsWater(){
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (k%2==1) {
                    grid[h][k].needswater=false;
                }
                System.out.println("Plot (" + h +"," + k + ") needs water is " + grid[h][k].needswater);
            }
        }
    }

    public void plantwithMaxNum() {
        int tomatoplots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantname.equals("tomato")) {
                    tomatoplots = tomatoplots + 1;
                }
            }
        }
        System.out.println("There are " + tomatoplots + " tomato plots.");
    }

}




