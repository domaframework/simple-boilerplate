package boilerplate.java15.entity;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.42.0" }, date = "2020-09-20T21:36:11.326+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _Employee extends org.seasar.doma.jdbc.entity.AbstractEntityType<boilerplate.java15.entity.Employee> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.42.0");
    }

    private static final _Employee __singleton = new _Employee();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("EMPLOYEE_SEQ");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<boilerplate.java15.entity.Employee>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<boilerplate.java15.entity.Employee, ?>> __embeddedPropertyTypeMap;

    private _Employee() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "Employee";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __map = new java.util.LinkedHashMap<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<boilerplate.java15.entity.Employee, ?>> __embeddedMap = new java.util.LinkedHashMap<>(4);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<boilerplate.java15.entity.Employee, ?>> __embeddedMap) {
        __map.put("id", new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<boilerplate.java15.entity.Employee, java.lang.Integer, java.lang.Integer>(boilerplate.java15.entity.Employee.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "id", "", __namingType, false, __idGenerator));
        __map.put("name", new org.seasar.doma.jdbc.entity.DefaultPropertyType<boilerplate.java15.entity.Employee, java.lang.String, java.lang.String>(boilerplate.java15.entity.Employee.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "name", "", __namingType, true, true, false));
        __map.put("age", new org.seasar.doma.jdbc.entity.DefaultPropertyType<boilerplate.java15.entity.Employee, java.lang.Integer, java.lang.Integer>(boilerplate.java15.entity.Employee.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "age", "", __namingType, true, true, false));
        __map.put("version", new org.seasar.doma.jdbc.entity.VersionPropertyType<boilerplate.java15.entity.Employee, java.lang.Integer, java.lang.Integer>(boilerplate.java15.entity.Employee.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "version", "", __namingType, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __idList) {
        __idList.add(__map.get("id"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> __list) {
        __list.addAll(__map.values());
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    @Deprecated
    public String getTableName() {
        return getTableName(org.seasar.doma.internal.jdbc.entity.TableNames.namingFunction);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(boilerplate.java15.entity.Employee entity, org.seasar.doma.jdbc.entity.PreInsertContext<boilerplate.java15.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(boilerplate.java15.entity.Employee entity, org.seasar.doma.jdbc.entity.PreUpdateContext<boilerplate.java15.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(boilerplate.java15.entity.Employee entity, org.seasar.doma.jdbc.entity.PreDeleteContext<boilerplate.java15.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(boilerplate.java15.entity.Employee entity, org.seasar.doma.jdbc.entity.PostInsertContext<boilerplate.java15.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(boilerplate.java15.entity.Employee entity, org.seasar.doma.jdbc.entity.PostUpdateContext<boilerplate.java15.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(boilerplate.java15.entity.Employee entity, org.seasar.doma.jdbc.entity.PostDeleteContext<boilerplate.java15.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.java15.entity.Employee, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<boilerplate.java15.entity.Employee, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<boilerplate.java15.entity.Employee, ?, ?>)__entityPropertyTypeMap.get("id");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<boilerplate.java15.entity.Employee, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<boilerplate.java15.entity.Employee, ?, ?>)__entityPropertyTypeMap.get("version");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<boilerplate.java15.entity.Employee, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<boilerplate.java15.entity.Employee, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public boilerplate.java15.entity.Employee newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<boilerplate.java15.entity.Employee, ?>> __args) {
        boilerplate.java15.entity.Employee entity = new boilerplate.java15.entity.Employee();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("age") != null) __args.get("age").save(entity);
        if (__args.get("version") != null) __args.get("version").save(entity);
        return entity;
    }

    @Override
    public Class<boilerplate.java15.entity.Employee> getEntityClass() {
        return boilerplate.java15.entity.Employee.class;
    }

    @Override
    public boilerplate.java15.entity.Employee getOriginalStates(boilerplate.java15.entity.Employee __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(boilerplate.java15.entity.Employee __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Employee getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Employee newInstance() {
        return new _Employee();
    }

}
