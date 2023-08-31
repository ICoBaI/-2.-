import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[9];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
            System.out.println(intArray[i]);
        }
        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
