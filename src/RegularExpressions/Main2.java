package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 3
//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8.”  Найти все подстроки "Java X" и распечатать их.
public class Main2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Java\\s+[0-9]");
        Matcher m = p.matcher("Java  5, Java 6, Java   7, Java 8");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
