public class Complex {

    private int numA;

    private int numB;

    public Complex() {
        // default constructor
    }

    public Complex(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int add() {
        return numA + numB;
    }

    public int subtract() {
        return Math.abs(numA - numB);
    }

    public long multiply() {
        return numA * numB;
    }
}
