package Question2;

public class Employee implements Comparable<Employee> {

    private int emId;
    private String empName;
    private double salary;

    public Employee() {

    }

    public Employee(int emId, String empName, double salary) {
        super();
        this.emId = emId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        Employee e1 = this;
        Employee e2 = (Employee) obj;

        return e1.emId == e2.emId && e1.salary == e2.salary && e1.empName.equals(e2.empName);

    }

    public int getEmId() {
        return emId;
    }

    public void setEmId(int emId) {
        this.emId = emId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Employee Id=" + emId +
                ", Employee Name='" + empName + '\'' +
                ", Employee Salary=" + salary +
                '}';
    }

}