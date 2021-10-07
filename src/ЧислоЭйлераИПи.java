public class ЧислоЭйлераИПи {
    public static void main(String[] args) {
//Задание: вывести с помощью char свое имя в юникоде
        char a = '\u041C';
        char b = '\u0430';
        char c = '\u0440';
        char d = '\u0438';
        char e = '\u044F';

        System.out.println("Здравствуйте," + a+b+c+d+e+'!');


//    Задание: значение числa Пи и Эйлера
    double pi = 3.141592653;
    double e1 = 2.7182818284590452;

    System.out.println("Число Пи:"+pi+" Число Эйлера:"+e1+2);

//    Задание: создать 3 строковые переменные и присвоить им значение
        String a1 = "\n моя строка 1";
        String b1 = "\n \tмоя строка 2";
        String c1 = "\n \tмоя строка 3";

        System.out.println(a1+b1+c1);

//        Задание: Casting explicit и Casting implicit
//        Неявный кастинг
        byte f = 10;
        short g = 0;
//        g = f;   Все впорядке, данные сохранились

//        Неявный кастинг
        short h = 256;
        byte j = 0;
        j = (byte)h;

}
    }

