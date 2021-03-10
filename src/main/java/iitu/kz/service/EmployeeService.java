package iitu.kz.service;

import iitu.kz.entities.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    void create(Employee employee);
    Page<Employee> getAll();
    List<Employee> getUsersByName(String name);
    Employee getById(Long id);
    void update(Long id, Employee employee);
    void delete(Long id);
}
