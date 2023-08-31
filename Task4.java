import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        MyLineEmty();
    }

    public static void MyLineEmty() {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String input;
        try {
            EmptyLine(input = sc.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void EmptyLine(String input) throws Exception {
        if (input.isEmpty()){
            throw new Exception("Пустые строки вводить нельзя");
        }else{
            System.out.println("Вы ввели: " + input);
        }
    }

}
