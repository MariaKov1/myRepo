public class Foreign {
}

class ForeignPassport extends Passport {
    private String vise;
    private String PasNumber;

    public ForeignPassport() {
    }

    public String getVise() {
        return vise;
    }
    public void setVise(String vise) {
        this.vise = vise;
    }

    public String getPasNumber() {
        return PasNumber;
    }
    public void setPasNumber(String PasNumber) {
        this.PasNumber = PasNumber;
    }

    public ForeignPassport(String FIO, String vise, String PasNumber) {
        super(FIO);
        this.vise = vise;
        this.PasNumber = PasNumber;
    }
    }

    class Airport{
        public static void main(String[] args) {
            Passport passport = new Passport("Kovalova M.A.");
            ForeignPassport foreignPassport = new ForeignPassport("Kovalova M.A.","vise kat. D" , "FK123456");
            System.out.println( passport + foreignPassport.getVise() + " " + foreignPassport.getPasNumber());


        }
    }


