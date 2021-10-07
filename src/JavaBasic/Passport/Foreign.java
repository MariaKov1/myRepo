package JavaBasic.Passport;

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


