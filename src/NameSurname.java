import java.util.Scanner;

public class NameSurname {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите свое имя:");
        String name = in.nextLine();
        System.out.print("Введите свою фамилию:");
        String surname = in.nextLine();
        System.out.println("Ваше ФИО:" + name + surname);
    }
}