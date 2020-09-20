package boilerplate.java15.repository;

import boilerplate.java15.entity.Employee;
import boilerplate.java15.entity.Employee_;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.criteria.Entityql;

import java.util.List;
import java.util.Objects;

public class EmployeeRepository {

  private final Entityql entityql;

  public EmployeeRepository(Config config) {
    Objects.requireNonNull(config);
    this.entityql = new Entityql(config);
  }

  public List<Employee> selectAll() {
    var e = new Employee_();
    return entityql.from(e).fetch();
  }

  public Employee selectById(Integer id) {
    var e = new Employee_();
    return entityql.from(e).where(c -> c.eq(e.id, id)).fetchOne();
  }

  public void insert(Employee employee) {
    var e = new Employee_();
    entityql.insert(e, employee).execute();
  }

  public void update(Employee employee) {
    var e = new Employee_();
    entityql.update(e, employee).execute();
  }

  public void delete(Employee employee) {
    var e = new Employee_();
    entityql.delete(e, employee).execute();
  }
}
