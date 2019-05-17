package pl.sda.czwa;

public class Polygon {

    private int count;

    public Polygon(int count) {
        if (count < 3) {
            throw new IllegalArgumentException("count should be at least 3");
        }

        this.count = count;
    }
}
