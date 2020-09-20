package boilerplate.java15.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Script;
import org.seasar.doma.Sql;

@Dao
public interface AppDao {

    @Sql("""
        create sequence employee_seq start with 100 increment by 1;
        
        create table employee (
         id integer not null primary key,
         name varchar(255) not null,
         age integer not null,\s
         version integer not null);
        
        insert into employee values(1,'ALLEN',30, 0);
        insert into employee values(2,'WARD',32, 0);
        insert into employee values(3,'JONES',38, 0);
        """)
    @Script
    void create();

    @Sql("""
        drop sequence employee_seq;
        drop table employee;
        
        """)
    @Script
    void drop();

}
