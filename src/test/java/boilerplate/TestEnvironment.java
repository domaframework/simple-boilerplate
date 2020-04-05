package boilerplate;

import boilerplate.dao.AppDao;
import boilerplate.dao.AppDaoImpl;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.seasar.doma.jdbc.tx.TransactionManager;

public class TestEnvironment implements BeforeAllCallback, AfterAllCallback {

  private AppDao dao = new AppDaoImpl();

  @Override
  public void beforeAll(ExtensionContext context) {
    TransactionManager tm = AppConfig.singleton().getTransactionManager();
    tm.required(
        () -> {
          dao.create();
        });
  }

  @Override
  public void afterAll(ExtensionContext context) {
    TransactionManager tm = AppConfig.singleton().getTransactionManager();
    tm.required(
        () -> {
          dao.drop();
        });
  }
}
