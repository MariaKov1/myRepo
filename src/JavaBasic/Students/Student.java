package JavaBasic.Students;

public class Student {

    private String FIO, dateOfBirth;
    private int Phone, NumberOfGroup;

    public String getFIO(){
        return FIO;
    }
    public void setFIO (String FIO){
        this.FIO = FIO;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth (String FIO) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhone(){
        return Phone;
    }
   public void setPhone (int Phone){
        this.Phone = Phone;
   }

    public int getNumberOfGroup(){
        return NumberOfGroup;
    }
    public void setNumberOfGroup (int NumberOfGroup){
        this.Phone = NumberOfGroup;
    }

    Student(){ }

    public Student(String FIO, String dateOfBirth, int Phone, int NumberOfGroup) {
        this.FIO = FIO;
        this.dateOfBirth = dateOfBirth;
        this.Phone = Phone;
        this.NumberOfGroup = NumberOfGroup;
    }




}
