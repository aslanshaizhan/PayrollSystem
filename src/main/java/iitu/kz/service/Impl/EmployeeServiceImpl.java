package iitu.kz.service.Impl;

import iitu.kz.entities.Employee;
import iitu.kz.repository.EmployeeRepository;
import iitu.kz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Page<Employee> getAll() {
        Pageable pageable = PageRequest.of(0, 6, Sort.by(Sort.Direction.DESC,"name"));
        return employeeRepository.findAll(pageable);
    }

    @Override
    public List<Employee> getUsersByName(String name) {
        employeeRepository.findByNameAndAgeGreaterThanEqual(name, 40);
        return employeeRepository.findByNameGreaterThan(name, 40);
    }

    @Override
    public Employee getById(Long id) {
        return employeeRepository.findById(id).orElse(new Employee());
    }

    @Override
    public void update(Long id, Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);

        if (employeeOptional.isPresent()) {
            Employee dbEmployee = employeeOptional.get();
            dbEmployee.setName(employee.getName());
            employeeRepository.save(dbEmployee);
        }
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
