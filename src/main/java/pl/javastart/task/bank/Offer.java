package pl.javastart.task.bank;

public class Offer {

    protected boolean valid;
    protected double value;
    protected double percentage;

    public Offer() {
    }

    public boolean isValid() {
        return valid;
    }

    public double getValue() {
        return value;
    }

    public double getPercentage() {
        return percentage;
    }
}
