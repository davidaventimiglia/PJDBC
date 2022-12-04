package org.pjdbc.drivers;

import java.sql.*;
import org.pjdbc.sql.*;

public class FilterDriver extends AbstractProxyDriver {
    static {try {DriverManager.registerDriver(new FilterDriver());} catch (Exception e) {throw new RuntimeException(e);}}

    public static interface Filter {
        public String apply (String sql);}

    public static abstract class AbstractFilter implements Filter {
        public String apply (String sql) {return sql;}}

    protected static Filter fltr  = new AbstractFilter() {};

    protected boolean acceptsSubProtocol (String subprotocol) {
        return "filter".equals(subprotocol);}

    protected Statement proxyStatement (Statement delegate, Connection conn) throws SQLException {
        return new AbstractStatement(delegate, conn) {
            public void addBatch (String sql) throws SQLException {
                super.addBatch(getFilter().apply(sql));}
            public boolean execute (String sql) throws SQLException {
                return super.execute(getFilter().apply(sql));}
            public boolean execute (String sql, int[] columnIndexes) throws SQLException {
                return super.execute(getFilter().apply(sql), columnIndexes);}
            public boolean execute (String sql, String[] columnNames) throws SQLException {
                return super.execute(getFilter().apply(sql), columnNames);}
            public ResultSet executeQuery (String sql) throws SQLException {
                return super.executeQuery(getFilter().apply(sql));}
            public int executeUpdate (String sql) throws SQLException {
                return super.executeUpdate(getFilter().apply(sql));}
            public int executeUpdate (String sql, int autoGeneratedKeys) throws SQLException {
                return super.executeUpdate(getFilter().apply(sql), autoGeneratedKeys);}
            public int executeUpdate (String sql, int[] columnIndexes) throws SQLException {
                return super.executeUpdate(getFilter().apply(sql), columnIndexes);}
            public int executeUpdate (String sql, String[] columnNames) throws SQLException {
                return super.executeUpdate(getFilter().apply(sql), columnNames);}};}

    public Filter getFilter () {
	return fltr;}

    public void setFilter (Filter filter) {
	fltr = filter;}}
