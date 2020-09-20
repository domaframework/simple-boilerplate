package boilerplate.java8;

import boilerplate.java8.dao.AppDao;
import boilerplate.java8.dao.AppDaoImpl;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.UtilLoggingJdbcLogger;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.H2Dialect;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;
import org.seasar.doma.jdbc.tx.TransactionManager;

public class TestEnvironment
    implements BeforeAllCallback,
        AfterAllCallback,
        BeforeEachCallback,
        AfterEachCallback,
        ParameterResolver {

  private final LocalTransaction localTransaction;
  private final TransactionManager transactionManager;
  private final Config config;
  private final AppDao appDao;

  public TestEnvironment() {
    Dialect dialect = new H2Dialect();
    LocalTransactionDataSource dataSource =
        new LocalTransactionDataSource("jdbc:h2:mem:tutorial;DB_CLOSE_DELAY=-1", "sa", null);
    JdbcLogger jdbcLogger = new UtilLoggingJdbcLogger();
    localTransaction = dataSource.getLocalTransaction(jdbcLogger);
    transactionManager = new LocalTransactionManager(localTransaction);
    config = new DbConfig(dialect, dataSource, jdbcLogger, transactionManager);
    appDao = new AppDaoImpl(config);
  }

  @Override
  public void beforeAll(ExtensionContext context) {
    transactionManager.required(appDao::create);
  }

  @Override
  public void afterAll(ExtensionContext context) {
    transactionManager.required(appDao::drop);
  }

  @Override
  public void beforeEach(ExtensionContext context) {
    localTransaction.begin();
  }

  @Override
  public void afterEach(ExtensionContext context) {
    localTransaction.rollback();
  }

  @Override
  public boolean supportsParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    Class<?> type = parameterContext.getParameter().getType();
    return type == Config.class;
  }

  @Override
  public Object resolveParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return config;
  }
}
