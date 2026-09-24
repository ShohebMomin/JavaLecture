package day54;

public class Students {
    private int math, physics, chemistry;
    private String name;
    private int totalMarks;
    private double per;
    private String grade;

    public Students(){}

    private static void calculateGrade(int mathMarks, int physicsMarks, int chemistryMarks) {
        int totalMarks = 300;
        int obtainMarks = mathMarks+ physicsMarks+ chemistryMarks;
        double percentage = ((double) obtainMarks / totalMarks) * 100.0;
    }

    public Students(int math, int physics, int chemistry, String name, int totalMarks, double per, String grade){
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.name  = name;
        this.totalMarks = calculateTotalMarks(chemistry, math, physics);
        this.per = calculatePer(this.totalMarks);
        this.grade = calculateGrade(this.per);
    }

    private String calculateGrade(double per) {
        return "";
    }

    private double calculatePer(int totalMarks) {
        return ((double) totalMarks / 300) * 100.0;
    }

    private int calculateTotalMarks(int chemistry, int math, int physics) {
        return chemistry+math+physics;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                ", name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                ", per=" + per +
                ", grade='" + grade + '\'' +
                '}';
    }
}
