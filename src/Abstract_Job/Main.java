package Abstract_Job;

public class Main {
    public static void main(String[] args) {
        Employer president = new President();
        Employer manager = new Manager();
        Employer worker = new Worker();

        Employer[] employers = new Employer[3];
        employers[0] = president;
        employers[1] = manager;
        employers[2] = worker;
        for (int i = 0; i < employers.length; i++) {
            employers[i].Print();
        }
    }
}