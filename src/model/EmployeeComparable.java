package model;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeComparable extends Employee implements Comparable<Employee> {

  @Override
  public int compareTo(Employee o) {
    if (o == null)
      return this.getId();

    return this.getId() - o.getId();
  }



//  public static List<EmployeeComparable> getEmployeeComparables(int count){
//    return getEmployees(count).stream().map(emp-> (EmployeeComparable) emp).collect(Collectors.toList());
//  }
}
