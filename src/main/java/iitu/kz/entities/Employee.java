package iitu.kz.entities;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double fixedSalary;
    private double hourRate;
    private int hoursWorked;
    private float commRate;

    @Enumerated(EnumType.STRING)
    private EmployeeType emplType;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public double getHourRate() {
        return hourRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public float getCommRate() {
        return commRate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setCommRate(float commRate) {
        this.commRate = commRate;
    }

    @Override
    public String toString() {
        return "Current Employee{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
