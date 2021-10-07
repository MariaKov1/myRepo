package address;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.index = 12345;
        address.country = "Poland";
        address.city = "Warszaw";
        address.street = "Adama Mickiewicza";
        address.house = 10;
        address.apartment = 9;

        address.ShowAddress();

    }
}
