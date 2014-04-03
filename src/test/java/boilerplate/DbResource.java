package boilerplate;

import org.junit.rules.ExternalResource;
import org.seasar.doma.jdbc.tx.TransactionManager;

import boilerplate.dao.AppDao;
import boilerplate.dao.AppDaoImpl;

public class DbResource extends ExternalResource {

    private AppDao dao = new AppDaoImpl();

    @Override
    protected void before() throws Throwable {
        TransactionManager tm = AppConfig.singleton().getTransactionManager();
        tm.required(() -> {
            dao.create();
        });
    }

    @Override
    protected void after() {
        TransactionManager tm = AppConfig.singleton().getTransactionManager();
        tm.required(() -> {
            dao.drop();
        });
    }

}
