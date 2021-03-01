package iitu.kz.events;

import iitu.kz.entities.CurrentEmployee;
import org.springframework.context.ApplicationEvent;

public class EmployeeCreateEvent extends ApplicationEvent {

    private CurrentEmployee employee;

    public EmployeeCreateEvent(Object source, CurrentEmployee employee) {
        super(source);
        this.employee = employee;
    }

    public CurrentEmployee getEmployee() {
        return employee;
    }

}
