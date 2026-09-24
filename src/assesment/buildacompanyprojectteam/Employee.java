package assesment.buildacompanyprojectteam;

public class Employee {
    private int empId;
    private String name;
    private String role;
    private int experience;

    public Employee(){

    }
    public Employee(int empId, String name, String role, int experience) {
        this.empId = empId;
        this.name = name;
        this.role = role;
        this.experience = experience;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", experience=" + experience ;
    }
}
