package boilerplate.java8;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.TransactionManager;

import javax.sql.DataSource;
import java.util.Objects;

public class DbConfig implements Config {

  private final Dialect dialect;
  private final LocalTransactionDataSource dataSource;
  private final JdbcLogger jdbcLogger;
  private final TransactionManager transactionManager;

  public DbConfig(
      Dialect dialect,
      LocalTransactionDataSource dataSource,
      JdbcLogger jdbcLogger,
      TransactionManager transactionManager) {
    this.dialect = Objects.requireNonNull(dialect);
    this.dataSource = Objects.requireNonNull(dataSource);
    this.jdbcLogger = Objects.requireNonNull(jdbcLogger);
    this.transactionManager = Objects.requireNonNull(transactionManager);
  }

  @Override
  public Dialect getDialect() {
    return dialect;
  }

  @Override
  public DataSource getDataSource() {
    return dataSource;
  }

  @Override
  public JdbcLogger getJdbcLogger() {
    return jdbcLogger;
  }

  @Override
  public TransactionManager getTransactionManager() {
    return transactionManager;
  }
}
