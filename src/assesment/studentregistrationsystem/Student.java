package assesment.studentregistrationsystem;

public class Student {
    private int rollNumber;
    private String name;
    private String course;
    private int marks;
    public Student(){}
    public Student(int rollNumber, String name, String course, int marks) {
        this.rollNumber = rollNumber;
        this.name= name;
        this.course = course;
        this.marks = marks;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}
