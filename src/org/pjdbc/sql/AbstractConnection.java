package org.pjdbc.sql;

import java.sql.*;
import java.util.*;
import java.util.concurrent.*;

public abstract class AbstractConnection extends AbstractWrapper implements Connection {
    private Driver driver;
    private String url;
    private Properties info;

    protected List<Connection> delegates = new ArrayList<Connection>();

    protected List<Connection> getConnections () {
	return delegates;}

    protected Connection getDel () {
	for (Connection c : delegates) return c;
	return null;}

    protected Statement wrap (Statement stmt) throws SQLException {
	return new AbstractStatement(stmt, this){};}

    protected Statement wrap (Statement[] stmts) throws SQLException {
	return new AbstractStatement(stmts, this){};}

    protected PreparedStatement wrap (PreparedStatement s) throws SQLException {
	return new AbstractPreparedStatement(s, this){};}

    protected CallableStatement wrap (CallableStatement s) throws SQLException {
	return new AbstractCallableStatement(s, this){};}

    protected DatabaseMetaData wrap (DatabaseMetaData d) throws SQLException {
	return new AbstractDatabaseMetaData(this, d){};}

    public AbstractConnection (Connection conn) throws SQLException {
	super(conn);
	delegates.add(conn);}

    public AbstractConnection (Connection[] conns) throws SQLException {
	super(conns);
	delegates = Arrays.asList(conns);}

    public AbstractConnection (Connection conn, Driver driver, String url, Properties info) throws SQLException {
	this(conn);
	this.url = url;
	this.info = info;
	this.driver = driver;}

    public AbstractConnection (Connection[] conns, Driver driver, String url, Properties info) throws SQLException {
	this(conns);
	this.url = url;
	this.info = info;
	this.driver = driver;}

    public Array createArrayOf (String typeName, Object[] elements) throws SQLException {for (Connection d : getConnections()) return d.createArrayOf(typeName, elements); throw new SQLException();}
    public Blob createBlob () throws SQLException {for (Connection d : getConnections()) return d.createBlob(); throw new SQLException();}
    public CallableStatement prepareCall (String sql) throws SQLException {for (Connection d : getConnections()) return wrap(d.prepareCall(sql)); throw new SQLException();}
    public CallableStatement prepareCall (String sql, int resultSetType, int resultSetConcurrency) throws SQLException {for (Connection d : getConnections()) return wrap(d.prepareCall(sql, resultSetType, resultSetConcurrency)); throw new SQLException();}
    public CallableStatement prepareCall (String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {for (Connection d : getConnections()) return wrap(d.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability)); throw new SQLException();}
    public Clob createClob () throws SQLException {for (Connection d : getConnections()) return d.createClob(); throw new SQLException();}
    public DatabaseMetaData getMetaData () throws SQLException {for (Connection d : getConnections()) return wrap(d.getMetaData()); throw new SQLException();}
    public Map<String,Class<?>> getTypeMap () throws SQLException {for (Connection d : getConnections()) return d.getTypeMap(); throw new SQLException();}
    public NClob createNClob () throws SQLException {for (Connection d : getConnections()) return d.createNClob(); throw new SQLException();}
    public PreparedStatement prepareStatement (String sql) throws SQLException {for (Connection d : getConnections()) return wrap(d.prepareStatement(sql)); throw new SQLException();}
    public PreparedStatement prepareStatement (String sql, String[] columnNames) throws SQLException {for (Connection d : getConnections()) return wrap(d.prepareStatement(sql, columnNames)); throw new SQLException();}
    public PreparedStatement prepareStatement (String sql, int autoGeneratedKeys) throws SQLException {for (Connection d : getConnections()) return wrap(d.prepareStatement(sql, autoGeneratedKeys)); throw new SQLException();}
    public PreparedStatement prepareStatement (String sql, int resultSetType, int resultSetConcurrency) throws SQLException {for (Connection d : getConnections()) return wrap(d.prepareStatement(sql, resultSetType, resultSetConcurrency)); throw new SQLException();}
    public PreparedStatement prepareStatement (String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {for (Connection d : getConnections()) return wrap(d.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability)); throw new SQLException();}
    public PreparedStatement prepareStatement (String sql, int[] columnIndexes) throws SQLException {for (Connection d : getConnections()) return wrap(d.prepareStatement(sql, columnIndexes)); throw new SQLException();}
    public Properties getClientInfo () throws SQLException {for (Connection d : getConnections()) return d.getClientInfo(); throw new SQLException();}
    public SQLWarning getWarnings () throws SQLException {for (Connection d : getConnections()) return d.getWarnings(); throw new SQLException();}
    public SQLXML createSQLXML () throws SQLException {for (Connection d : getConnections()) return d.createSQLXML(); throw new SQLException();}
    public Savepoint setSavepoint () throws SQLException {for (Connection d : getConnections()) return d.setSavepoint(); throw new SQLException();}
    public Savepoint setSavepoint (String name) throws SQLException {for (Connection d : getConnections()) return d.setSavepoint(name); throw new SQLException();}
    public Statement createStatement () throws SQLException {ArrayList<Statement> stmts = new ArrayList<Statement>(); for (Connection d : getConnections()) stmts.add(d.createStatement()); return wrap(stmts.toArray(new Statement[0]));}
    public Statement createStatement (int resultSetType, int resultSetConcurrency) throws SQLException {for (Connection d : getConnections()) return wrap(d.createStatement(resultSetType, resultSetConcurrency)); throw new SQLException();}
    public Statement createStatement (int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {for (Connection d : getConnections()) return wrap(d.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability)); throw new SQLException();}
    public String getCatalog () throws SQLException {for (Connection d : getConnections()) return d.getCatalog(); throw new SQLException();}
    public String getClientInfo (String name) throws SQLException {for (Connection d : getConnections()) return d.getClientInfo(name); throw new SQLException();}
    public String getSchema () throws SQLException {for (Connection d : getConnections()) return d.getSchema(); throw new SQLException();}
    public String nativeSQL (String sql) throws SQLException {for (Connection d : getConnections()) return d.nativeSQL(sql); throw new SQLException();}
    public Struct createStruct (String typeName, Object[] attributes) throws SQLException {for (Connection d : getConnections()) return d.createStruct(typeName, attributes); throw new SQLException();}
    public boolean getAutoCommit () throws SQLException {for (Connection d : getConnections()) if(!d.getAutoCommit()) return false; throw new SQLException();}
    public boolean isClosed () throws SQLException {for (Connection d : getConnections()) if(!d.isClosed()) return false; throw new SQLException();}
    public boolean isReadOnly () throws SQLException {for (Connection d : getConnections()) if (!d.isReadOnly()) return false; throw new SQLException();}
    public boolean isValid (int timeout) throws SQLException {for (Connection d : getConnections()) if (!d.isValid(timeout)) return false; throw new SQLException();}
    public int getHoldability () throws SQLException {for (Connection d : getConnections()) return d.getHoldability(); throw new SQLException();}
    public int getNetworkTimeout () throws SQLException {for (Connection d : getConnections()) return d.getNetworkTimeout(); throw new SQLException();}
    public int getTransactionIsolation () throws SQLException {for (Connection d : getConnections()) return d.getTransactionIsolation(); throw new SQLException();}
    public void abort (Executor executor) throws SQLException {for (Connection d : getConnections()) d.abort(executor);}
    public void clearWarnings () throws SQLException {for (Connection d : getConnections()) d.clearWarnings();}
    public void close () throws SQLException {for (Connection d : getConnections()) d.close();}
    public void commit () throws SQLException {for (Connection d : getConnections()) d.commit();}
    public void releaseSavepoint (Savepoint savepoint) throws SQLException {for (Connection d : getConnections()) d.releaseSavepoint(savepoint);}
    public void rollback () throws SQLException {for (Connection d : getConnections()) d.rollback();}
    public void rollback (Savepoint savepoint) throws SQLException {for (Connection d : getConnections()) d.rollback(savepoint);}
    public void setAutoCommit (boolean autoCommit) throws SQLException {for (Connection d : getConnections()) d.setAutoCommit(autoCommit);}
    public void setCatalog (String catalog) throws SQLException {for (Connection d : getConnections()) d.setCatalog(catalog);}
    public void setClientInfo (Properties properties) throws SQLClientInfoException {for (Connection d : getConnections()) d.setClientInfo(properties);}
    public void setClientInfo (String name, String value) throws SQLClientInfoException {for (Connection d : getConnections()) d.setClientInfo(name, value);}
    public void setHoldability (int holdability) throws SQLException {for (Connection d : getConnections()) d.setHoldability(holdability);}
    public void setNetworkTimeout (Executor executor, int milliseconds) throws SQLException {for (Connection d : getConnections()) d.setNetworkTimeout(executor, milliseconds);}
    public void setReadOnly (boolean readOnly) throws SQLException {for (Connection d : getConnections()) d.setReadOnly( readOnly);}
    public void setSchema (String schema) throws SQLException {for (Connection d : getConnections()) d.setSchema(schema);}
    public void setTransactionIsolation (int level) throws SQLException {for (Connection d : getConnections()) d.setTransactionIsolation(level);}
    public void setTypeMap (Map<String,Class<?>> map) throws SQLException {for (Connection d : getConnections()) d.setTypeMap(map);}}
