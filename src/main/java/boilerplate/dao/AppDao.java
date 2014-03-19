package boilerplate.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Script;

import boilerplate.AppConfig;

@Dao(config = AppConfig.class)
public interface AppDao {

    @Script
    void create();

    @Script
    void drop();

}
