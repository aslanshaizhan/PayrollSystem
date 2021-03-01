package iitu.kz.events;

import iitu.kz.service.SalaryCalculatorService;
import org.springframework.context.ApplicationEvent;

public class SalaryChangeEvent extends ApplicationEvent {

    private SalaryCalculatorService salary;

    public SalaryChangeEvent(Object source, SalaryCalculatorService salary) {
        super(source);
        this.salary = salary;
    }

    public SalaryCalculatorService getSalary() {
        return salary;
    }

}
