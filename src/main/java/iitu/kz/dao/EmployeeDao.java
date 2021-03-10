package iitu.kz.dao;

import iitu.kz.entities.Employee;
import iitu.kz.events.EmployeeCreateEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao implements ApplicationEventPublisherAware{

        private ApplicationEventPublisher eventPublisher;

        public void create(Employee employee) {
            System.out.println("EmployeeDao.create");
            System.out.println("employee = " + employee);

            this.eventPublisher.publishEvent(new EmployeeCreateEvent(this, employee));
        }

        public void update(Long id, Employee employee) {
            System.out.println("EmployeeDao.update");
        }

        public void delete(Long id) {
            System.out.println("EmployeeDao.delete id: " + id);
        }

        @Override
        public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
            this.eventPublisher = applicationEventPublisher;
        }
}
