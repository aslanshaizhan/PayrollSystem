package iitu.kz.events;

import iitu.kz.events.EmployeeCreateEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCreateHandler implements ApplicationListener<EmployeeCreateEvent> {

    @Override
    public void onApplicationEvent(EmployeeCreateEvent employeeCreateEvent) {
        System.out.println("EmployeeCreateHandler.onApplicationEvent");
        System.out.println("Created employee info: " + employeeCreateEvent.getEmployee());
    }
}

