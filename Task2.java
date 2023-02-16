public class Task2 {
    public static void main(String[] args) {
        System.out.println("Вывод всех простых чисел от 1 до 1000");
        int N = 1000;
        int temp = 0;
        for (int i = 1; i <= N; i++){
            for(int j = 2; j <= i/2+1; j++){
                if ((i % j == 0) && (i != 2)){
                    temp ++;
                }
            }
            if (temp == 0){
                System.out.printf(" %d", i);
            } else {
                temp = 0;
            }
        }
    }
}
