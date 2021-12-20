import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!", name);
        in.close();
    }
}
