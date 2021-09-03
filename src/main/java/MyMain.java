public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }

    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
        return Math.max(x,Math.max(y,z));
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
    public static boolean flipCoin() {
        return (Math.random()>=0.5);
    }

    // This method simulates the flip of a weighted coin,
    // that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        // REPLACE THIS WITH YOUR CODE
        return (Math.random()>=0.3);
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        // REPLACE THIS WITH YOUR CODE
        return (int) (d+0.5);
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {
        double rand = Math.random()*6;
        int r = (int) rand;
        return r+1;
    }

    // This method carries out the quadratic formula and *prints* out the answers
    /*public static void quadForm(int a, int b, int c) {
        //didnt finish in class
    }*/

    public static void main(String[] args) {
        // Test the add5 method
        int x = 17;
        int y = 22;
        int z = 16;
        System.out.println(findBiggestNumber(x,y,z));
        System.out.println(flipCoin());
        System.out.println(rollDie());

        // YOUR CODE HERE
    }
}