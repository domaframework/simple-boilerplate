package boilerplate.java15.dao;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.42.0" }, date = "2020-09-20T21:36:11.407+0900")
@org.seasar.doma.DaoImplementation
public class EmployeeDaoImpl implements boilerplate.java15.dao.EmployeeDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.42.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(boilerplate.java15.dao.EmployeeDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(boilerplate.java15.dao.EmployeeDao.class, "selectById", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(boilerplate.java15.dao.EmployeeDao.class, "insert", boilerplate.java15.entity.Employee.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(boilerplate.java15.dao.EmployeeDao.class, "update", boilerplate.java15.entity.Employee.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(boilerplate.java15.dao.EmployeeDao.class, "delete", boilerplate.java15.entity.Employee.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    public EmployeeDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public java.util.List<boilerplate.java15.entity.Employee> selectAll() {
        __support.entering("boilerplate.java15.dao.EmployeeDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("boilerplate.java15.dao.EmployeeDao#selectAll");
            __query.setEntityType(boilerplate.java15.entity._Employee.getSingletonInternal());
            __query.setCallerClassName("boilerplate.java15.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<boilerplate.java15.entity.Employee>> __command = __support.getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<boilerplate.java15.entity.Employee>(boilerplate.java15.entity._Employee.getSingletonInternal()));
            java.util.List<boilerplate.java15.entity.Employee> __result = __command.execute();
            __query.complete();
            __support.exiting("boilerplate.java15.dao.EmployeeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("boilerplate.java15.dao.EmployeeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public boilerplate.java15.entity.Employee selectById(java.lang.Integer id) {
        __support.entering("boilerplate.java15.dao.EmployeeDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("boilerplate.java15.dao.EmployeeDao#selectById");
            __query.setEntityType(boilerplate.java15.entity._Employee.getSingletonInternal());
            __query.addParameter("id", java.lang.Integer.class, id);
            __query.setCallerClassName("boilerplate.java15.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<boilerplate.java15.entity.Employee> __command = __support.getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<boilerplate.java15.entity.Employee>(boilerplate.java15.entity._Employee.getSingletonInternal()));
            boilerplate.java15.entity.Employee __result = __command.execute();
            __query.complete();
            __support.exiting("boilerplate.java15.dao.EmployeeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("boilerplate.java15.dao.EmployeeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int insert(boilerplate.java15.entity.Employee employee) {
        __support.entering("boilerplate.java15.dao.EmployeeDaoImpl", "insert", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<boilerplate.java15.entity.Employee> __query = __support.getQueryImplementors().createAutoInsertQuery(__method2, boilerplate.java15.entity._Employee.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__support.getConfig());
            __query.setEntity(employee);
            __query.setCallerClassName("boilerplate.java15.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = __support.getCommandImplementors().createInsertCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("boilerplate.java15.dao.EmployeeDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("boilerplate.java15.dao.EmployeeDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(boilerplate.java15.entity.Employee employee) {
        __support.entering("boilerplate.java15.dao.EmployeeDaoImpl", "update", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<boilerplate.java15.entity.Employee> __query = __support.getQueryImplementors().createAutoUpdateQuery(__method3, boilerplate.java15.entity._Employee.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__support.getConfig());
            __query.setEntity(employee);
            __query.setCallerClassName("boilerplate.java15.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = __support.getCommandImplementors().createUpdateCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("boilerplate.java15.dao.EmployeeDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("boilerplate.java15.dao.EmployeeDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(boilerplate.java15.entity.Employee employee) {
        __support.entering("boilerplate.java15.dao.EmployeeDaoImpl", "delete", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<boilerplate.java15.entity.Employee> __query = __support.getQueryImplementors().createAutoDeleteQuery(__method4, boilerplate.java15.entity._Employee.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__support.getConfig());
            __query.setEntity(employee);
            __query.setCallerClassName("boilerplate.java15.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = __support.getCommandImplementors().createDeleteCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("boilerplate.java15.dao.EmployeeDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("boilerplate.java15.dao.EmployeeDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
