package boilerplate;

import org.junit.rules.ExternalResource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;

import boilerplate.dao.AppDao;
import boilerplate.dao.AppDaoImpl;

public class DbResource extends ExternalResource {

    private AppDao dao = new AppDaoImpl();

    @Override
    protected void before() throws Throwable {
        LocalTransactionManager tm = AppConfig.singleton()
                .getLocalTransactionManager();
        tm.required(() -> {
            dao.create();
        });
    }

    @Override
    protected void after() {
        LocalTransactionManager tm = AppConfig.singleton()
                .getLocalTransactionManager();
        tm.required(() -> {
            dao.drop();
        });
    }

}
