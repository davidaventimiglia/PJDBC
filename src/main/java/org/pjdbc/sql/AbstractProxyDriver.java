package org.pjdbc.sql;

import java.sql.*;
import java.util.*;

public abstract class AbstractProxyDriver extends AbstractDriver {
    protected boolean acceptsSubName (String subname) {
	try {return DriverManager.getDriver(subname)!=null;}
	catch (Exception e) {};
	return false;}

    protected Connection proxyConnection (Connection conn, String url, Properties info, Driver driver) throws SQLException {
	return new AbstractConnection(conn, this, url, info) {
	    @Override
	    public Statement createStatement () throws SQLException {
		return proxyStatement(getDelegate().createStatement(), this);}
	    @Override
	    public Statement createStatement (int resultSetType, int resultSetConcurrency) throws SQLException {
		return proxyStatement(getDelegate().createStatement(resultSetType, resultSetConcurrency), this);}
	    @Override
	    public Statement createStatement (int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return proxyStatement(getDelegate().createStatement(resultSetType, resultSetConcurrency, resultSetHoldability), this);}
	    @Override
	    public CallableStatement prepareCall (String sql) throws SQLException {
		return proxyCallableStatement(getDelegate().prepareCall(sql), this);}
	    @Override
	    public CallableStatement prepareCall (String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return proxyCallableStatement(getDelegate().prepareCall(sql, resultSetType, resultSetConcurrency), this);}
	    @Override
	    public CallableStatement prepareCall (String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return proxyCallableStatement(getDelegate().prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability), this);}
	    @Override
	    public PreparedStatement prepareStatement (String sql) throws SQLException {
		return proxyPreparedStatement(getDelegate().prepareStatement(sql), this);}
	    @Override
	    public PreparedStatement prepareStatement (String sql, int autoGeneratedKeys) throws SQLException {
		return proxyPreparedStatement(getDelegate().prepareStatement(sql, autoGeneratedKeys), this);}
	    @Override
	    public PreparedStatement prepareStatement (String sql, int[] columnIndexes) throws SQLException {
		return proxyPreparedStatement(getDelegate().prepareStatement(sql, columnIndexes), this);}
	    @Override
	    public PreparedStatement prepareStatement (String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return proxyPreparedStatement(getDelegate().prepareStatement(sql, resultSetType, resultSetConcurrency), this);}
	    @Override
	    public PreparedStatement prepareStatement (String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return proxyPreparedStatement(getDelegate().prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability), this);}
	    @Override
	    public PreparedStatement prepareStatement (String sql, String[] columnNames) throws SQLException {
		return proxyPreparedStatement(getDelegate().prepareStatement(sql, columnNames), this);}};}

    protected Connection proxyConnection (Connection delegate, String url, Properties info, List<Connection> delegates) throws SQLException {
	return new AbstractConnection(delegate, this, url, info){};}

    protected Connection proxyConnection (String url, Properties info, Connection[] delegates) throws SQLException {
	return new AbstractConnection(delegates, this, url, info){};}

    protected Statement proxyStatement (Statement delegate, Connection conn) throws SQLException {
	return new AbstractStatement(delegate, conn) {};}

    protected CallableStatement proxyCallableStatement (CallableStatement delegate, Connection conn) throws SQLException {
	return new AbstractCallableStatement(delegate, conn) {};}

    protected PreparedStatement proxyPreparedStatement (PreparedStatement delegate, Connection conn) throws SQLException {
	return new AbstractPreparedStatement(delegate, conn) {};}

    protected ResultSet proxyResultSet (Statement stmt, ResultSet delegate) throws SQLException {
	return delegate;}

    @Override
    public Connection connect (String url, Properties info) throws SQLException {
	if (!acceptsURL(url)) return null;
	return proxyConnection(DriverManager.getConnection(subname(url)), subname(url), info, this);}

    @Override
    public DriverPropertyInfo[] getPropertyInfo (String url, Properties info) throws SQLException {
	if (!acceptsURL(url)) throw new SQLException("Invalid url:  " + url);
	Driver driver = DriverManager.getDriver(subname(url));
	if (driver==null) throw new SQLException("No valid target driver registered for:  " + subname(url));
	return driver.getPropertyInfo(subname(url), info);}}
