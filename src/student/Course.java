package student;

public class Course {
    private String courseName;
    private String code;
    private Instructer instructer;

    public Course(String courseName, String code, Instructer instructer) {
        this.courseName = courseName;
        this.code = code;
        this.instructer = instructer;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double calcAverage(Student[] students) {
        Student st4 = new Student("", "","","", 123);
        double average = 0.0;
        for (int i = 0; i < students.length; i++) {
            average += students[i].getNote();
        }
        return average / students.length;
    }

    public Instructer getInstructer() {
        return instructer;
    }

    public void setInstructer(Instructer instructer) {
        this.instructer = instructer;
    }
}
