package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 1
//Дана строка 'ahb acb aeb aeeb adcb axeb'.
//Напишите регулярное выражение, которая найдет строки ahb, acb, aeb по шаблону: буква 'a', любой символ, буква 'b'.
//Выведите строки на консоль
public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a.b");
        Matcher m = p.matcher("ahb acb aeb aeeb adcb axeb");

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}