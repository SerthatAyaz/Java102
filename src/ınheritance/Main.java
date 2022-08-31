package ınheritance;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("mustafa ç. ", "555554444333", "ayz@com.tr");
        Academician a1 = new Academician("serhat ayaz ", "3333333333","ser@com.tr", "geo", "prof.");
        Officer o1 = new Officer("ali veli ", "546464665", "sda@com.tr", "cevre","no");
        Lecturer l1 = new Lecturer("mahmut ss ", "4656546", "mah@com.tr", "computer", "doç", "4");
        l1.entry();
    }
}
