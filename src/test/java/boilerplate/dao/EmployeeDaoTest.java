package boilerplate.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.jdbc.tx.TransactionManager;

import boilerplate.AppConfig;
import boilerplate.DbResource;
import boilerplate.entity.Employee;

public class EmployeeDaoTest {

    @Rule
    public final DbResource dbResource = new DbResource();

    private final EmployeeDao dao = new EmployeeDaoImpl();

    @Test
    public void testSelectById() {
        TransactionManager tm = AppConfig.singleton().getTransactionManager();
        tm.required(() -> {
            Employee employee = dao.selectById(1);
            assertNotNull(employee);
            assertEquals("ALLEN", employee.name);
            assertEquals(Integer.valueOf(30), employee.age);
            assertEquals(Integer.valueOf(0), employee.version);
        });
    }

}
