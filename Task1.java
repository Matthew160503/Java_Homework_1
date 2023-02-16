import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите число: ");
        int N = sc.nextInt();
        int sum = N * (N + 1)/2;
        int multiply = 1;
        for (int i = 1; i <= N; i++) multiply *= i;
        System.out.printf("Сумма чисел от 1 до N равна %d, а произведение = %d", sum, multiply);
        sc.close();
    }
}
