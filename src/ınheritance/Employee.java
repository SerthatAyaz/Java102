package ınheritance;

public class Employee {
    private String nameSurname;
    private String mphone;
    private String email;


    public Employee(String nameSurname, String mphone, String email) {
        this.nameSurname = nameSurname;
        this.mphone = mphone;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void entry() {
        System.out.println(this.nameSurname + "Entry to University");
    }

    public void exit()  {
        System.out.println(this.nameSurname + "Exit to University");
    }

    public void diningroom() {
        System.out.println(this.nameSurname + "yemehaneye girdi");
    }
}
