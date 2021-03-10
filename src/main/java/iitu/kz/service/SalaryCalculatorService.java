package iitu.kz.service;

import java.util.Scanner;

public class SalaryCalculatorService {
    Scanner in = new Scanner(System.in);

    public void evaluateCurrentEmployeeSalary(){
        System.out.println("This is your salary!");
    }

    public void evaluateFixedEmployeeSalary(){
        int pay = 1500;
        System.out.println("Please write your worked hours: ");
        int hours = in.nextInt();
        if (hours > 40){
            double total = (hours - 40) * 1.5 * pay + (40 * pay);
        }else {
            double total = hours * pay;
        }
    }

    public void evaluateHourlyEmployeeSalary(){
        double cost = 100000;
        double pf = 0.15;
        System.out.println("Please write your quantity of sales: ");
        int quantity = in.nextInt();
        double total = quantity * 100000 * pf;
        }

    public void evaluateSaleEmployeeSalary(){
        int base = 120000;
        double pf = 0.1;
        double cost = 80000;
        System.out.println("Please write your quantity of sales: ");
        int quantity = in.nextInt();
        double total = base + quantity * cost * pf;
    }
}
