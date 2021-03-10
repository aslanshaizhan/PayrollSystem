package iitu.kz.repository;

import iitu.kz.entities.Employee;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
    List<Employee> findByNameAndAgeGreaterThanEqual(String name, int i);

    @Query(value = "select u from Employee u where u.name=:name")
    List<Employee> findByNameGreaterThan(@Param("name") String name, int i);
}
