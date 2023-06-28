import java.util.Scanner;

public class HomeThirdTask {
    double n;
    double m;
    char operation;
    public HomeThirdTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число!");
        n = input.nextInt();
        System.out.println("Введите второе число!");
        m = input.nextInt();
        System.out.println("Введите вид операции(*,/,-,+)!");
        operation = input.next().charAt(0);
        input.close();
    }

    public void Kolkulator() {
        switch (operation) {
            case '*':
                System.out.println( n + " * " + m + " = " + ( n * m ));
                break;
            case '/':
                System.out.println( n + " / " + m + " = " + ( n / m ));
                break;
            case '+':
                System.out.println( n + " + " + m + " = " + ( n + m ));
                break;
            case '-':
                System.out.println( n + " - " + m + " = " + ( n - m ));
                break;
            default:
                System.err.println("Не верно введены данные!");
                break;
        }
    }
}
