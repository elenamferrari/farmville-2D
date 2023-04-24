public class Plot {
    public String plantname;
    public int numberofplants;
    public boolean needswater;
    public int num;

    public Plot() {
//        plantname = "sunflower";
        numberofplants = (int) (Math.random() * 100) + 10;
        needswater = true;

        num = (int) (Math.random() * 5);
        if (num == 0) {
            plantname = "sunflower";
        }
        if (num == 1) {
            plantname = "carrot";
        }
        if (num == 2) {
            plantname = "corn";
        }
        if (num == 3) {
            plantname = "tomato";
        }
        if (num == 4) {
            plantname = "empty";
            numberofplants=0;
        }
    }
        public void printPlot() {
            System.out.println("This plant is a " + plantname + ". There are " + numberofplants + " plants here. That this plant needs water is " + needswater + ".");
        }

}
