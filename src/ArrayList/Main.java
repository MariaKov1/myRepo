package ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Князь А.А.");
        teachers.add("Верховцев А.К.");
        teachers.add("Зорянова В.С.");
        teachers.add("Чернова И.Т.");
        teachers.add("Гром В.К.");

        System.out.println(teachers);

        System.out.println("Самый любимый учитель:" + teachers.indexOf("Верховцев А.К."));
        System.out.println("Самый не очень любимый учитель:" + teachers.indexOf("Гром В.К."));


    }
}
