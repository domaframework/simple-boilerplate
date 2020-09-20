package boilerplate.java8.repository;

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
class EmployeeRepositoryTest {

  private final EmployeeRepository repository;

  EmployeeRepositoryTest(Config config) {
    Objects.requireNonNull(config);
    this.repository = new EmployeeRepository(config);
  }

  @Test
  void selectAll() {
    List<Employee> employees = repository.selectAll();
    assertEquals(3, employees.size());
  }

  @Test
  void selectById() {
    Employee employee = repository.selectById(1);
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
    repository.insert(employee);
    Employee employee2 = repository.selectById(employee.id);
    assertNotNull(employee2);
    assertNotNull(employee2.id);
    assertNotNull(employee2.version);
  }

  @Test
  void update() {
    Employee employee = repository.selectById(1);
    employee.name = "ABC";
    repository.update(employee);
    Employee employee2 = repository.selectById(1);
    assertEquals("ABC", employee2.name);
  }

  @Test
  void delete() {
    Employee employee = repository.selectById(1);
    repository.delete(employee);
    List<Employee> employees = repository.selectAll();
    assertEquals(2, employees.size());
  }
}
