package h1;

public class Zahl {

    public int num;
    public boolean even;
    public boolean positive;
    public boolean small;

    public void setEven() {
        if (Math.abs(num) % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
    }

    public void setPositive() {
        if (num > 0) {
            positive = true;
        } else {
            positive = false;
        }
    }

    public void setSmall() {
        if (num < 100) {
            small = true;
        } else {
            small = false;
        }
    }
}

