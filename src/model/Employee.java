package model;

import static util.Util.getRandom;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Employee {

  int id;
  String name;
  long salary;
  int age;

  public static Employee getRandomEmployee() {
    Employee e = new Employee();
    e.setId(getRandom());
    e.setName("name" + e.getId() + getRandom());
    e.setAge(getRandom());
    e.setSalary(getRandom());
    return e;
  }

  public static List<Employee> getEmployees(int count) {
    return IntStream.range(0, count).mapToObj(i -> getRandomEmployee())
        .collect(Collectors.toList());
  }

  public static TreeSet<Employee> getEmployeesTree(int count) {
    return IntStream.range(0, count).mapToObj(i -> getRandomEmployee())
        .collect(Collectors
            .toCollection(() -> new TreeSet<>(Comparator.comparingInt(Employee::getId))));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return id == employee.id &&
        Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", salary=" + salary +
        ", age=" + age +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getSalary() {
    return salary;
  }

  public void setSalary(long salary) {
    this.salary = salary;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
