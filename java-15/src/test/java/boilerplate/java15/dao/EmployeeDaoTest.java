package boilerplate.java15.dao;

import boilerplate.java15.TestEnvironment;
import boilerplate.java15.entity.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.seasar.doma.jdbc.Config;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(TestEnvironment.class)
class EmployeeDaoTest {

  private final EmployeeDao dao;

  EmployeeDaoTest(Config config) {
    Objects.requireNonNull(config);
    dao = new EmployeeDaoImpl(config);
  }

  @Test
  void selectAll() {
    var employees = dao.selectAll();
    assertEquals(3, employees.size());
  }

  @Test
  public void selectById() {
    var employee = dao.selectById(1);
    assertNotNull(employee);
    assertEquals("ALLEN", employee.name);
    assertEquals(30, employee.age);
    assertEquals(0, employee.version);
  }

  @Test
  void insert() {
    var employee = new Employee();
    employee.name = "ABC";
    employee.age = 25;
    dao.insert(employee);
    var employee2 = dao.selectById(employee.id);
    assertNotNull(employee2);
    assertNotNull(employee2.id);
    assertNotNull(employee2.version);
  }

  @Test
  void update() {
    var employee = dao.selectById(1);
    employee.name = "ABC";
    dao.update(employee);
    var employee2 = dao.selectById(1);
    assertEquals("ABC", employee2.name);
  }

  @Test
  void delete() {
    var employee = dao.selectById(1);
    dao.delete(employee);
    var employees = dao.selectAll();
    assertEquals(2, employees.size());
  }
}
