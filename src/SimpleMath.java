import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число:");
        long firstNumber = in.nextInt();
        System.out.print("Введите второе число:");
        long secondNumber = in.nextInt();

        System.out.println("Сумма двух чисел равна:" + (firstNumber + secondNumber));

        long substractionNumber = Math.subtractExact(firstNumber, secondNumber);
        System.out.println("Вычитание двух чисел: " + substractionNumber);

        long multiplicationNumber = Math.multiplyExact(firstNumber, secondNumber);
        System.out.println("Умножение двух чисел: " + multiplicationNumber);

        long divisionNumber = firstNumber / secondNumber;
        System.out.println("Деление двух чисел: " + divisionNumber);


        // double divisionWithRemainder = Math.floorMod(firstNumber, secondNumber); этот способ не работает, не знаю, почему
        // System.out.println("Остаток от деления двух чисел: " + divisionWithRemainder);

        System.out.println("Остаток от деления двух чисел: " + firstNumber % secondNumber);

    }
}

