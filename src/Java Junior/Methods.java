import java.util.Scanner;

public class Methods {

//    Задание:
    static int calculate(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа:");
        Scanner scan =new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        int sum = calculate(a,b,c);
        System.out.println("Среднее арифметическое чисел:"+ sum);
    }
}
