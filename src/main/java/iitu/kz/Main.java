package iitu.kz;

import iitu.kz.config.SpringConfiguration;
import iitu.kz.controller.EmployeeController;
import iitu.kz.dao.EmployeeDao;
import iitu.kz.entities.Employee;
import iitu.kz.service.SalaryCalculatorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SalaryCalculatorService salaryCalculatorService = new SalaryCalculatorService();
        Employee employee = new Employee();
        EmployeeDao employeeDao = new EmployeeDao();

        while (true) {
            System.out.println("-------Main Menu-------");
            System.out.println("-------Payroll System-------");
            System.out.println("1. Add or Create User");
            System.out.println("2. Update or Take salary");
            System.out.println("3. List of employee");
            System.out.println("0. Exit");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    employee.setId(1L);
                    employee.setName("Aslan");
                    employeeDao.create(employee);
                    break;
                case 2:
                    System.out.println("Do you have bonuses for these month(yes/no)? ");
                    String answer = in.next();
                    if (answer == "yes"){
                        int salary = (int) (100000 * 0.1) + 100000;
                    }else{
                        System.out.println("Your salary is stayed!");
                        salaryCalculatorService.evaluateCurrentEmployeeSalary();
                    }
                    break;
                case 3:
                    EmployeeController employeeController = context.getBean("userController", EmployeeController.class);
                    List<Employee> userList = employeeController.getUserByName("Aslan");
                    System.out.println(employeeController.getAll().getContent());
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Incorrect choice");
                    break;
            }
        }
    }
}
