import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел
// от 1 до n), n! (произведение чисел от 1 до n)
public class HomeFirstTask {
    int n;
    int[] size;
    int sumNum;
    int factNum = 1;

    public HomeFirstTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число!");
        n = input.nextInt();
        size = new int [n];
        for (int i = 0; i < size.length; i++) {
            size[i] = i + 1;
        }
        input.close();

    }

    public void sumNumbers() {

        for (int i = 0; i < n; i++) {
            sumNum += size[i];
        }
        System.out.println("N-е треугольное число " + sumNum);
    }
    public void factNumbers() {

        for (int i = 1; i < n; i++) {
            factNum = factNum * size[i];

        }
        System.out.println("Факториал N-го числа " + factNum);
    }
}
