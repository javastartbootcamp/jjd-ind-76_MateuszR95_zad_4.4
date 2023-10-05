package pl.javastart.task.bank;

public class Offer {

    private boolean valid;
    private double value;
    private double percentage;

    public Offer() {
    }

    public boolean isValid() {
        return valid;
    }

    protected void setValid(boolean valid) {
        this.valid = valid;
    }

    public double getValue() {
        return value;
    }

    protected void setValue(double value) {
        this.value = value;
    }

    public double getPercentage() {
        return percentage;
    }

    protected void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
