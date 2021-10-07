public class Airport {
        public static void main(String[] args) {
            Passport passport = new Passport("Kovalova M.A.");
            ForeignPassport foreignPassport = new ForeignPassport("Kovalova M.A.","vise kat. D" , "FK123456");
            System.out.println( passport + foreignPassport.getVise() + " " + foreignPassport.getPasNumber());
        }
    }
