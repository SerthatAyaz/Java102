package inter;

public class Abank implements Ibank {
    private String bankName;
    private String terminal_id;
    private String password;

    public Abank(String bankName, String terminal_id, String password) {
        this.bankName = bankName;
        this.terminal_id = terminal_id;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAdress) {
        System.out.println("user Ip" + ipAdress);
        System.out.println("Mach ip" + this.hostIpAdress);

        System.out.println(this.bankName + "connected ");
        return true;
    }

    @Override
    public boolean payment(double price,String cardNumber, String expiryDate, String cvc) {
        System.out.print("\n" + "Waiting for response from bank");
        System.out.print("System successful");
        return true;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    public String getPassword() {
        return bankName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
