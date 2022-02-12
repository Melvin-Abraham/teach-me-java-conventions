package powerpackage;

public class PowerFinder {
    public static int calcPower(int num, int power) {
        int p = 1;

        for (int i = 0; i < power; i++) {
            p *= num;
        }

        return p;
    }
}
