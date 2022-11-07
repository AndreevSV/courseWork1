public class Employee {
    String firstname;
    String middlename;
    String surname;
    String fullName;
    int salary;
    int department;
    int id;
    static int counter;

    public Employee(String firstname, String middlename, String surname, int salary, int department) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.surname = surname;
        this.fullName = firstname + " " + middlename + " " + surname;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return fullName + "   " + salary + "   " + department + "   " + id;
    }
}
