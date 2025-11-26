package lottery.model;

public class NumberFrequency {
    private int number;
    private int count;

    public NumberFrequency(int number, int count) {
        this.number = number;
        this.count = count;
    }

    public int getNumber() {
        return number;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Number " + number + " → " + count + " times";
    }
}
