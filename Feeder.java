public class Feeder {
    private int currentFood;
    public int getCurrentFood()
    {
        return currentFood;
    }
    public void simulateOneDay(int numbirds) {
            if (Math.random() < 0.5) {
                currentFood -= numbirds;
            }
            else {
                currentFood += numbirds;
            }
    }

    public static void simulateManyDays(int numBirds, int numDays) {
        while (numDays > 0) {
            Feeder f = new Feeder();
            f.simulateOneDay(numBirds);
            System.out.println(f.getCurrentFood());
            numDays--;
        }
    }
}
