public class Main1 {
    public static void main(String[] args) {

//Задание: 2 переменные и вывести на экран результаты всех арифмет.операций над ними
        int a = 4, b = 6;
        System.out.println("a+b = "+ (a+b));
        System.out.println("a-b = "+ (a-b));
        System.out.println("a*b = "+ (a*b));
        System.out.println("a/b = "+ (a/b));
        System.out.println("a%b = "+ (a%b));

// Задание: Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
//Выполните и рассчитайте результат следующих операций для этих переменных:
// x += y - x++ * z;
// z = --x – y * 5;
// y /= x + 5 % z;
// z = x++ + y * 5;
// x = y - x++ * z;
        int x = 10, y = 12, z = 3;

        System.out.println("x = 10, y = 12, z = 3" + x + y + z);
    }
}
