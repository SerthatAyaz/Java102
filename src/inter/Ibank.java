package inter;

public interface Ibank {
    public String hostIpAdress = "127.4.53";

    boolean connect(String ipaddress);

    boolean payment(double price,String cardNumber, String expiryDate, String cvc);
}
