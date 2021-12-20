import java.util.Scanner;

public class Number {

   /* public static void main(String args[]) { //самый простой способ, в котором мы сами инициализируем переменную и потом ее выдаем, но здесь нет взаимодействия с пользователем
        int number = 6;
        System.out.println(number);
    }
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int typedNumber = scan.nextInt();
        System.out.println("Вы ввели " + typedNumber);
    }
}






