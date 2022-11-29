public class Spinner {

    private int sections;
    private int mostRecentSpin;
    private int spinTracker;
    private int spinTotal;
    private double averageSpin;

    public Spinner (int sections)
    {
        this.sections = sections;
        mostRecentSpin = 0;
        spinTracker = 0;
        spinTotal = 0;
        averageSpin = 0.0;
    }

    public void Spin()
    {
        mostRecentSpin = (int) (Math.random() * sections) + 1;
        spinTracker++;
        spinTotal += mostRecentSpin;
        averageSpin = (double) spinTotal/(double) spinTracker;
    }

    public int getMostRecentSpin() {
        return mostRecentSpin;
    }

    public double getAverageSpin() {
        return averageSpin;
    }
}
