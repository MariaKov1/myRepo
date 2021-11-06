package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 2
//Дана строка 'aa aba abba abbba abca abea'. Напишите регулярное выражение, которая найдет строки aa, aba, abba, abbba по
//шаблону: буква 'a', буква 'b' любое количество раз (в том числе ниодного раза), буква 'a'.
//Выведите строки на консоль
public class Main1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab*a");
        Matcher m = p.matcher("aa aba abba abbba abca abea");

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
