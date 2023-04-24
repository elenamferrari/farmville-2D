public class myFarm {
    public static void main(String[] args) {
        myFarm charlie = new myFarm();
    }
    public myFarm() {
        System.out.println("hello from my farm!");

        Plot ryan = new Plot();
        ryan.printPlot();

        Plot [][] grid = new Plot [10][10];

        for(int x=0; x<grid.length; x++) {
            for (int y=0; y < grid[x].length; y++) {
                grid[x][y] = new Plot();
                grid[x][y].printPlot();
        }
        }
    }
}
