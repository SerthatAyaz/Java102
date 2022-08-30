package student;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("mustafa", "çetidağ", "123", "istanbul", 85);
        Student st2 = new Student("serhat" , "ayaz", "124", "antalya", 87);
        Student st3 = new Student("patika", "dev", "125", "istanbul", 90);

        Instructer teacher = new Instructer("mahmut", "çetindağ","ceng");

        Course mat = new Course("MAT101", "MAT", teacher);
        System.out.println(mat.getInstructer().getName());

        Student[] stu = {st1, st2, st3};
        System.out.println("Ortalama: " + mat.calcAverage(stu));
    }
}
