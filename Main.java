import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pass = new Scanner( System.in );

        System.out.println("Угадайте пароль! (1-1000)");

        // пароль 885

        int a = pass.nextInt();

        if (a == 885) {
            System.out.println("Вы угадали пароль!");
        }
        else if (a < 885) {
            System.out.println("Больше");
        }
        else if (a > 885) {
            System.out.println("Меньше");
        }
    }
}

