package example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    
    @Id
    private long id;

    private String firstName;

    private String lastName;

    private String department;

    private String designation;

    private Long salary;

    protected Employee() {
    }

    public Employee(Long id, String firstName, String lastName, String department, String designation, Long salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public Long getSalary() {
        return salary;
    }

    public String toString() {
        return String.format("{id: %d, firstName: %s, lastName: %s, department: %s, designation: %s, salary: %d}", id,
                firstName, lastName, department, designation, salary);
    }
}