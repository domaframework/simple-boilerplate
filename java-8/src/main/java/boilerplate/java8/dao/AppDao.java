package boilerplate.java8.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Script;

@Dao
public interface AppDao {

  @Script
  void create();

  @Script
  void drop();
}
