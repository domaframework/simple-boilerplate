package boilerplate.java8.dao;

import boilerplate.java8.TestEnvironment;
import boilerplate.java8.entity.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.seasar.doma.jdbc.Config;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(TestEnvironment.class)
public class EmployeeDaoTest {

  private final EmployeeDao dao;

  EmployeeDaoTest(Config config) {
    Objects.requireNonNull(config);
    this.dao = new EmployeeDaoImpl(config);
  }

  @Test
  void selectAll() {
    List<Employee> employees = dao.selectAll();
    assertEquals(3, employees.size());
  }

  @Test
  public void selectById() {
    Employee employee = dao.selectById(1);
    assertNotNull(employee);
    assertEquals("ALLEN", employee.name);
    assertEquals(30, employee.age);
    assertEquals(0, employee.version);
  }

  @Test
  void insert() {
    Employee employee = new Employee();
    employee.name = "ABC";
    employee.age = 25;
    dao.insert(employee);
    Employee employee2 = dao.selectById(employee.id);
    assertNotNull(employee2);
    assertNotNull(employee2.id);
    assertNotNull(employee2.version);
  }

  @Test
  void update() {
    Employee employee = dao.selectById(1);
    employee.name = "ABC";
    dao.update(employee);
    Employee employee2 = dao.selectById(1);
    assertEquals("ABC", employee2.name);
  }

  @Test
  void delete() {
    Employee employee = dao.selectById(1);
    dao.delete(employee);
    List<Employee> employees = dao.selectAll();
    assertEquals(2, employees.size());
  }
}
