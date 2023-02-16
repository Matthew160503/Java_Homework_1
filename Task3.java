import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = sc.nextInt();System.out.print("Введите одну из операций (+,-,/,*): ");
            String operation = sc.next();
            switch (operation) {
                case "+":
                    int sum = num1 + num2;
                    System.out.printf("Сумма равна %d", sum);
                    break;
                case "-":
                    int dif = num1 - num2;
                    System.out.printf("Разница равна %d", dif);
                    break;
                case "*":
                    int mult = num1 * num2;
                    System.out.printf("Произведение равно %d", mult);
                    break;
                case "/":
                    int div = num1 / num2;
                    System.out.printf("Целочисленное деление равно %d", div);
                    break;
                default:
                System.out.println("Такой операции нет, попробуйте еще раз!");
                    break;
            }
        } 
        catch (Exception ex) {
            System.out.println("Введены неправильно числа");
        }
        sc.close();
    }
}
