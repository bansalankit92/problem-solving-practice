package collection;

import static model.Employee.getEmployees;
import static model.Employee.getEmployeesTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import model.Employee;

public class EmployeeMain {


  public static void main(String[] args) {
    List<Employee> employees = getEmployees(5);
//    System.out.println(employees);
//    employees.sort(Comparator.comparingInt(Employee::getId));
//    System.out.println(employees);
//    employees.sort(Comparator.comparing(Employee::getName));
//    System.out.println(getEmployeesTree(5));

 //   System.out.println(getEmployeeComparables(5));

  }




}
