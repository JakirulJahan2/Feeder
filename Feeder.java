
public class Feeder {
    private int currentFood;

    public Feeder(int food) {
        currentFood = food;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void simulateOneDay(int numBirds) {
        if (Math.random() < 0.05)
            currentFood = 0;
        else {
            int eaten = (int)(Math.random() * 41) + 10;
            eaten *= numBirds;
            currentFood -= eaten;
            if (currentFood < 0)
                currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        int days = 0;

        while (numDays > 0) {
            if (currentFood == 0)
                return days;

            simulateOneDay(numBirds);
            numDays--;
            days++;
        }

        return days;
    }
}
