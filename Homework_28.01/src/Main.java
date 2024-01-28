import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Давайте возведём число в квадрат: ");
        int number = scanner.nextInt();
        int resultOffSquare = square(number);
        System.out.println("Квадрат: " + resultOffSquare);

        System.out.println("Давайте поделим наши числа");
        System.out.println("Первое число: ");
        double number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        double number2 = scanner.nextDouble();
        double resultOffdivision = division(number1 , number2);
        System.out.println(resultOffdivision);

        System.out.println("Давайте добавим наши числа");
        System.out.println("Первое число: ");
        int number3 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number4 = scanner.nextInt();
        int resultOffAddition = addition(number3 , number4);
        System.out.println(resultOffAddition);

        System.out.println("Давайте умножим наши числа");
        System.out.println("Первое число: ");
        int number5 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number6 = scanner.nextInt();
        int multiplicationResult = multiplication(number5 , number6);
        System.out.println(multiplicationResult);


        System.out.println("Давайте поделим наши числа (модуль)");
        System.out.println("Первое число: ");
        int number7 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number8 = scanner.nextInt();
        int modulResult = modul(number7 , number8);
        System.out.println(modulResult);
        

    }
    public static int square(int number){
        int squareResult = number * number;

        return squareResult;
    }
    public static double division(double number1 , double number2){
    double division = number1 / number2;
    double divisionResult = division;

    return divisionResult;
    }
    public static int addition(int number3 , int number4){
        int addition = number3 + number4;
        int addditionResult = addition;

        return addditionResult;

    }
    public static int multiplication(int number5 , int number6){
        int multiplication = number5 * number6;
        int multiplicationResult = multiplication;

        return multiplicationResult;
    }
    public static int modul(int number7 , int number8){
        int modul = number7 % number8;
        int modulResult = modul;

        return modulResult;
    }
}