package iitu.kz.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SalaryChangeHandler implements ApplicationListener<SalaryChangeEvent> {

    @Override
    public void onApplicationEvent(SalaryChangeEvent salaryChangeEvent) {
        System.out.println("SalaryChangeHandler.onApplicationEvent");
        System.out.println("Changed salary info: " + salaryChangeEvent.getSalary());
    }
}
