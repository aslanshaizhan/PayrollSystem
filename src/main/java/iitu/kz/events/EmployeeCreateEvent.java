package iitu.kz.events;

import iitu.kz.entities.Employee;
import org.springframework.context.ApplicationEvent;

public class EmployeeCreateEvent extends ApplicationEvent {

    private Employee employee;

    public EmployeeCreateEvent(Object source, Employee employee) {
        super(source);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

}
