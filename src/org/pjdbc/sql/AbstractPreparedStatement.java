package org.pjdbc.sql;

import java.io.*;
import java.math.*;
import java.net.*;
import java.sql.*;
import java.util.*;

public abstract class AbstractPreparedStatement extends AbstractStatement implements PreparedStatement {

    // Data

    private PreparedStatement d;

    // Constructors

    AbstractPreparedStatement (Connection conn, PreparedStatement stmt) throws SQLException {
	super(conn, stmt);
	this.d = stmt;}

    // PreparedStatement API

    @Deprecated public void setUnicodeStream (int parameterIndex, InputStream x, int length) throws SQLException {d.setUnicodeStream(parameterIndex, x, length);}
    public ParameterMetaData getParameterMetaData () throws SQLException {return d.getParameterMetaData();}
    public ResultSet executeQuery () throws SQLException {return d.executeQuery();}
    public ResultSetMetaData getMetaData () throws SQLException {return d.getMetaData();}
    public boolean execute () throws SQLException {return d.execute();}
    public int executeUpdate () throws SQLException {return d.executeUpdate();}
    public void addBatch () throws SQLException {d.addBatch();}
    public void clearParameters () throws SQLException {d.clearParameters();}
    public void setArray (int parameterIndex, Array x) throws SQLException {d.setArray(parameterIndex, x);}
    public void setAsciiStream (int parameterIndex, InputStream x) throws SQLException {d.setAsciiStream(parameterIndex, x);}
    public void setAsciiStream (int parameterIndex, InputStream x, int length) throws SQLException {d.setAsciiStream(parameterIndex, x, length);}
    public void setAsciiStream (int parameterIndex, InputStream x, long length) throws SQLException {d.setAsciiStream(parameterIndex, x, length);}
    public void setBigDecimal (int parameterIndex, BigDecimal x) throws SQLException {d.setBigDecimal(parameterIndex, x);}
    public void setBinaryStream (int parameterIndex, InputStream x) throws SQLException {d.setBinaryStream(parameterIndex, x);}
    public void setBinaryStream (int parameterIndex, InputStream x, int length) throws SQLException {d.setBinaryStream(parameterIndex, x, length);}
    public void setBinaryStream (int parameterIndex, InputStream x, long length) throws SQLException {d.setBinaryStream(parameterIndex, x, length);}
    public void setBlob (int parameterIndex, Blob x) throws SQLException {d.setBlob(parameterIndex, x);}
    public void setBlob (int parameterIndex, InputStream inputStream) throws SQLException {d.setBlob(parameterIndex, inputStream);}
    public void setBlob (int parameterIndex, InputStream inputStream, long length) throws SQLException {d.setBlob(parameterIndex, inputStream, length);}
    public void setBoolean (int parameterIndex, boolean x) throws SQLException {d.setBoolean(parameterIndex, x);}
    public void setByte (int parameterIndex, byte x) throws SQLException {d.setByte(parameterIndex, x);}
    public void setBytes (int parameterIndex, byte[] x) throws SQLException {d.setBytes(parameterIndex, x);}
    public void setCharacterStream (int parameterIndex, Reader reader) throws SQLException {d.setCharacterStream(parameterIndex, reader);}
    public void setCharacterStream (int parameterIndex, Reader reader, int length) throws SQLException {d.setCharacterStream(parameterIndex, reader, length);}
    public void setCharacterStream (int parameterIndex, Reader reader, long length) throws SQLException {d.setCharacterStream(parameterIndex, reader, length);}
    public void setClob (int parameterIndex, Clob x) throws SQLException {d.setClob(parameterIndex, x);}
    public void setClob (int parameterIndex, Reader reader) throws SQLException {d.setClob(parameterIndex, reader);}
    public void setClob (int parameterIndex, Reader reader, long length) throws SQLException {d.setClob(parameterIndex, reader, length);}
    public void setDate (int parameterIndex, java.sql.Date x) throws SQLException {d.setDate(parameterIndex, x);}
    public void setDate (int parameterIndex, java.sql.Date x, Calendar cal) throws SQLException {d.setDate(parameterIndex, x, cal);}
    public void setDouble (int parameterIndex, double x) throws SQLException {d.setDouble(parameterIndex, x);}
    public void setFloat (int parameterIndex, float x) throws SQLException {d.setFloat(parameterIndex, x);}
    public void setInt (int parameterIndex, int x) throws SQLException {d.setInt(parameterIndex, x);}
    public void setLong (int parameterIndex, long x) throws SQLException {d.setLong(parameterIndex, x);}
    public void setNCharacterStream (int parameterIndex, Reader value) throws SQLException {d.setNCharacterStream(parameterIndex, value);}
    public void setNCharacterStream (int parameterIndex, Reader value, long length) throws SQLException {d.setNCharacterStream(parameterIndex, value, length);}
    public void setNClob (int parameterIndex, NClob value) throws SQLException {d.setNClob(parameterIndex, value);}
    public void setNClob (int parameterIndex, Reader reader) throws SQLException {d.setNClob(parameterIndex, reader);}
    public void setNClob (int parameterIndex, Reader reader, long length) throws SQLException {d.setNClob(parameterIndex, reader, length);}
    public void setNString (int parameterIndex, String value) throws SQLException {d.setNString(parameterIndex, value);}
    public void setNull (int parameterIndex, int sqlType) throws SQLException {d.setNull(parameterIndex, sqlType);}
    public void setNull (int parameterIndex, int sqlType, String typeName) throws SQLException {d.setNull(parameterIndex, sqlType, typeName);}
    public void setObject (int parameterIndex, Object x) throws SQLException {d.setObject(parameterIndex, x);}
    public void setObject (int parameterIndex, Object x, int targetSqlType) throws SQLException {d.setObject(parameterIndex, x, targetSqlType);}
    public void setObject (int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {d.setObject(parameterIndex, x, targetSqlType, scaleOrLength);}
    public void setRef (int parameterIndex, Ref x) throws SQLException {d.setRef(parameterIndex, x);}
    public void setRowId (int parameterIndex, RowId x) throws SQLException {d.setRowId(parameterIndex, x);}
    public void setSQLXML (int parameterIndex, SQLXML xmlObject) throws SQLException {d.setSQLXML(parameterIndex, xmlObject);}
    public void setShort (int parameterIndex, short x) throws SQLException {d.setShort(parameterIndex, x);}
    public void setString (int parameterIndex, String x) throws SQLException {d.setString(parameterIndex, x);}
    public void setTime (int parameterIndex, Time x) throws SQLException {d.setTime(parameterIndex, x);}
    public void setTime (int parameterIndex, Time x, Calendar cal) throws SQLException {d.setTime(parameterIndex, x, cal);}
    public void setTimestamp (int parameterIndex, Timestamp x) throws SQLException {d.setTimestamp(parameterIndex, x);}
    public void setTimestamp (int parameterIndex, Timestamp x, Calendar cal) throws SQLException {d.setTimestamp(parameterIndex, x, cal);}
    public void setURL (int parameterIndex, URL x) throws SQLException {d.setURL(parameterIndex, x);}}
