package ınheritance;

public class Lecturer extends Academician{
    private String doorno;
    public Lecturer(String nameSurname, String mphone, String email, String department, String title, String doorno) {
        super(nameSurname, mphone, email, department, title);
        this.doorno = doorno;
    }

    public String getDoorno() {
        return doorno;
    }

    public void setDoorno(String doorno) {
        this.doorno = doorno;
    }
}
