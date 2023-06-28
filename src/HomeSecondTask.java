import java.util.Scanner;


//Вывести все простые числа от 1 до 1000
public class HomeSecondTask {
    int count;
    int n;
    int[] num;
    int[] primeNum;

    public HomeSecondTask() {
        Scanner input = new Scanner(System.in);
        num = new int[n];
        n = 1000;
        count = 0;
        input.close();
    }

    public void primeNumbers() {
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1) {
                System.out.print(i + " ");
            }
            count = 0;
//
        }
    }
}
