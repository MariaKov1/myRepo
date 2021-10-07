import java.util.Scanner;

public class Translator {

// Задание:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая погода Вас интересует?");
        System.out.println("Введите слово на русском языке");
        String word = scanner.next();
        switch (word){
            case "облачно":
                System.out.println("cloudy");
                break;
            case "солнечно":
                System.out.println("sunny");
                break;
            case "дождь":
                System.out.println("rain");
                break;
            case "холодно":
                System.out.println("cold");
                break;
            case "тепло":
                System.out.println("warm");
                break;
            case "снег":
                System.out.println("snow");
                break;
            case "жара":
                System.out.println("heat");
                break;
            case "ветер":
                System.out.println("wind");
                break;
            case "гроза":
                System.out.println("thunderstorm");
                break;
            case "град":
                System.out.println("hail");
                break;
            case "шторм":
                System.out.println("storm");
                break;
            default:
                System.out.println("Такого слова нет");
                break;}
        }

    }


