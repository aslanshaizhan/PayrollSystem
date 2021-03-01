package iitu.kz.entities;

public class SaleEmployee {

    private Long id;
    private String name;
    private String roleDescription;
    private int salary;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Sale Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + roleDescription +
                '}';
    }
}
