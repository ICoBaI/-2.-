import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float numbe = MyMassage();
        System.out.println("Вы ввели число: " + numbe);
    }

    public static float MyMassage() {
        Scanner sc = new Scanner(System.in);
        float numbe = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Введите дробное чилсо: ");
            try {
                numbe = sc.nextFloat();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Еще раз");
                sc.next();
            }

        }
        return numbe;
    }
}
