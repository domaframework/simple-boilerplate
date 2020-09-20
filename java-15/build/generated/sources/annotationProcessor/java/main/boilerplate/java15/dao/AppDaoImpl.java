package boilerplate.java15.dao;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.42.0" }, date = "2020-09-20T21:36:11.384+0900")
@org.seasar.doma.DaoImplementation
public class AppDaoImpl implements boilerplate.java15.dao.AppDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.42.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(boilerplate.java15.dao.AppDao.class, "create");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(boilerplate.java15.dao.AppDao.class, "drop");

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    public AppDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public void create() {
        __support.entering("boilerplate.java15.dao.AppDaoImpl", "create");
        try {
            org.seasar.doma.jdbc.query.SqlFileScriptQuery __query = __support.getQueryImplementors().createSqlFileScriptQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setScriptFilePath("boilerplate.java15.dao.AppDao#create");
            __query.setCallerClassName("boilerplate.java15.dao.AppDaoImpl");
            __query.setCallerMethodName("create");
            __query.setBlockDelimiter("");
            __query.setHaltOnError(true);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.ScriptCommand __command = __support.getCommandImplementors().createScriptCommand(__method0, __query);
            __command.execute();
            __query.complete();
            __support.exiting("boilerplate.java15.dao.AppDaoImpl", "create", null);
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("boilerplate.java15.dao.AppDaoImpl", "create", __e);
            throw __e;
        }
    }

    @Override
    public void drop() {
        __support.entering("boilerplate.java15.dao.AppDaoImpl", "drop");
        try {
            org.seasar.doma.jdbc.query.SqlFileScriptQuery __query = __support.getQueryImplementors().createSqlFileScriptQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__support.getConfig());
            __query.setScriptFilePath("boilerplate.java15.dao.AppDao#drop");
            __query.setCallerClassName("boilerplate.java15.dao.AppDaoImpl");
            __query.setCallerMethodName("drop");
            __query.setBlockDelimiter("");
            __query.setHaltOnError(true);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.ScriptCommand __command = __support.getCommandImplementors().createScriptCommand(__method1, __query);
            __command.execute();
            __query.complete();
            __support.exiting("boilerplate.java15.dao.AppDaoImpl", "drop", null);
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("boilerplate.java15.dao.AppDaoImpl", "drop", __e);
            throw __e;
        }
    }

}
