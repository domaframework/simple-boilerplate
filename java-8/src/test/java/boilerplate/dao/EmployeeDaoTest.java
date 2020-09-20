package boilerplate.dao;

import boilerplate.AppConfig;
import boilerplate.TestEnvironment;
import boilerplate.entity.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.seasar.doma.jdbc.tx.TransactionManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(TestEnvironment.class)
public class EmployeeDaoTest {

  private final EmployeeDao dao = new EmployeeDaoImpl();

  @Test
  public void testSelectById() {
    TransactionManager tm = AppConfig.singleton().getTransactionManager();
    tm.required(
        () -> {
          Employee employee = dao.selectById(1);
          assertNotNull(employee);
          assertEquals("ALLEN", employee.name);
          assertEquals(Integer.valueOf(30), employee.age);
          assertEquals(Integer.valueOf(0), employee.version);
        });
  }
}
