package iitu.kz;

import iitu.kz.config.SpringConfiguration;
import iitu.kz.dao.EmployeeDao;
import iitu.kz.entities.CurrentEmployee;
import iitu.kz.service.SalaryCalculatorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SalaryCalculatorService salaryCalculatorService = new SalaryCalculatorService();
        CurrentEmployee currentEmployee = new CurrentEmployee();
        EmployeeDao employeeDao = new EmployeeDao();

        while (true) {
            System.out.println("-------Main Menu-------");
            System.out.println("-------Payroll System-------");
            System.out.println("1. Add or Create User");
            System.out.println("2. Update or Take salary");
            System.out.println("3. List of employee who takes salary");
            System.out.println("0. Exit");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    currentEmployee.setId(1L);
                    currentEmployee.setName("Aslan");
                    currentEmployee.setRoleDescription("Current Employee");
                    currentEmployee.setSalary(150000);
                    employeeDao.create(currentEmployee);
                    break;
                case 2:
                    System.out.println("Do you have bonuses for these month(yes/no)? ");
                    String answer = in.next();
                    if (answer == "yes"){
                        int salary = 0.1 * salaryCalculatorService.evaluateCurrentEmployeeSalary();
                    }else{
                        System.out.println("Your salary is stayed!");
                        salaryCalculatorService.evaluateCurrentEmployeeSalary();
                    }
                    break;
                case 3:
                    employeeDao.setApplicationEventPublisher(context);
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
