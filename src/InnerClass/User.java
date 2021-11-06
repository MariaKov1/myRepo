package InnerClass;

import javax.management.Query;

public class User {
    private String login;
    private String password;

    class Query {
        public void printToLog() {
            System.out.println("Пользователь " + login + " с паролем " + password + " отправил запрос ");
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
            }


    public static void main(String[] args) {
        User user = new User();
//        User.createQuery();
        Query query1 = new User().new Query();
        query1.printToLog();
    }
}



