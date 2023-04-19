public class Employee {
    private String fullName;
    private static int counter = 0;
    private int id;
    private int dept;
    private double salary;

    public Employee(String fullName, int dept, double salary) {
        this.fullName = fullName;
        this.id = ++counter;
        this.dept = dept;
        this.salary = salary;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                ", dept=" + dept +
                ", salary=" + salary +
                '}';
    }
}
