package org.pjdbc.rmi;

import java.rmi.*;
import java.sql.*;

public interface DatabaseMetaDataRemoteProxy extends WrapperRemoteProxy {
    boolean allProceduresAreCallable () throws RemoteException;
    boolean allTablesAreSelectable () throws RemoteException;
    boolean autoCommitFailureClosesAllResultSets () throws RemoteException;
    boolean dataDefinitionCausesTransactionCommit () throws RemoteException;
    boolean dataDefinitionIgnoredInTransactions () throws RemoteException;
    boolean deletesAreDetected (int type) throws RemoteException;
    boolean doesMaxRowSizeIncludeBlobs () throws RemoteException;
    boolean generatedKeyAlwaysReturned () throws RemoteException;
    ResultSet getAttributes (String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern) throws RemoteException;
    ResultSet getBestRowIdentifier (String catalog, String schema, String table, int scope, boolean nullable) throws RemoteException;
    ResultSet getCatalogs () throws RemoteException;
    String getCatalogSeparator () throws RemoteException;
    String getCatalogTerm () throws RemoteException;
    ResultSet getClientInfoProperties () throws RemoteException;
    ResultSet getColumnPrivileges (String catalog, String schema, String table, String columnNamePattern) throws RemoteException;
    ResultSet getColumns (String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws RemoteException;
    Connection getConnection () throws RemoteException;
    ResultSet getCrossReference (String parentCatalog, String parentSchema, String parentTable, String foreignCatalog, String foreignSchema, String foreignTable) throws RemoteException;
    int getDatabaseMajorVersion () throws RemoteException;
    int getDatabaseMinorVersion () throws RemoteException;
    String getDatabaseProductName () throws RemoteException;
    String getDatabaseProductVersion () throws RemoteException;
    int getDefaultTransactionIsolation () throws RemoteException;
    int getDriverMajorVersion () throws RemoteException;
    int getDriverMinorVersion () throws RemoteException;
    String getDriverName () throws RemoteException;
    String getDriverVersion () throws RemoteException;
    ResultSet getExportedKeys (String catalog, String schema, String table) throws RemoteException;
    String getExtraNameCharacters () throws RemoteException;
    ResultSet getFunctionColumns (String catalog, String schemaPattern, String functionNamePattern, String columnNamePattern) throws RemoteException;
    ResultSet getFunctions (String catalog, String schemaPattern, String functionNamePattern) throws RemoteException;
    String getIdentifierQuoteString () throws RemoteException;
    ResultSet getImportedKeys (String catalog, String schema, String table) throws RemoteException;
    ResultSet getIndexInfo (String catalog, String schema, String table, boolean unique, boolean approximate) throws RemoteException;
    int getJDBCMajorVersion () throws RemoteException;
    int getJDBCMinorVersion () throws RemoteException;
    int getMaxBinaryLiteralLength () throws RemoteException;
    int getMaxCatalogNameLength () throws RemoteException;
    int getMaxCharLiteralLength () throws RemoteException;
    int getMaxColumnNameLength () throws RemoteException;
    int getMaxColumnsInGroupBy () throws RemoteException;
    int getMaxColumnsInIndex () throws RemoteException;
    int getMaxColumnsInOrderBy () throws RemoteException;
    int getMaxColumnsInSelect () throws RemoteException;
    int getMaxColumnsInTable () throws RemoteException;
    int getMaxConnections () throws RemoteException;
    int getMaxCursorNameLength () throws RemoteException;
    int getMaxIndexLength () throws RemoteException;
    int getMaxProcedureNameLength () throws RemoteException;
    int getMaxRowSize () throws RemoteException;
    int getMaxSchemaNameLength () throws RemoteException;
    int getMaxStatementLength () throws RemoteException;
    int getMaxStatements () throws RemoteException;
    int getMaxTableNameLength () throws RemoteException;
    int getMaxTablesInSelect () throws RemoteException;
    int getMaxUserNameLength () throws RemoteException;
    String getNumericFunctions () throws RemoteException;
    ResultSet getPrimaryKeys (String catalog, String schema, String table) throws RemoteException;
    ResultSet getProcedureColumns (String catalog, String schemaPattern, String procedureNamePattern, String columnNamePattern) throws RemoteException;
    ResultSet getProcedures (String catalog, String schemaPattern, String procedureNamePattern) throws RemoteException;
    String getProcedureTerm () throws RemoteException;
    ResultSet getPseudoColumns (String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws RemoteException;
    int getResultSetHoldability () throws RemoteException;
    RowIdLifetime getRowIdLifetime () throws RemoteException;
    ResultSet getSchemas () throws RemoteException;
    ResultSet getSchemas (String catalog, String schemaPattern) throws RemoteException;
    String getSchemaTerm () throws RemoteException;
    String getSearchStringEscape () throws RemoteException;
    String getSQLKeywords () throws RemoteException;
    int getSQLStateType () throws RemoteException;
    String getStringFunctions () throws RemoteException;
    ResultSet getSuperTables (String catalog, String schemaPattern, String tableNamePattern) throws RemoteException;
    ResultSet getSuperTypes (String catalog, String schemaPattern, String typeNamePattern) throws RemoteException;
    String getSystemFunctions () throws RemoteException;
    ResultSet getTablePrivileges (String catalog, String schemaPattern, String tableNamePattern) throws RemoteException;
    ResultSet getTables (String catalog, String schemaPattern, String tableNamePattern, String[] types) throws RemoteException;
    ResultSet getTableTypes () throws RemoteException;
    String getTimeDateFunctions () throws RemoteException;
    ResultSet getTypeInfo () throws RemoteException;
    ResultSet getUDTs (String catalog, String schemaPattern, String typeNamePattern, int[] types) throws RemoteException;
    String getURL () throws RemoteException;
    String getUserName () throws RemoteException;
    ResultSet getVersionColumns (String catalog, String schema, String table) throws RemoteException;
    boolean insertsAreDetected (int type) throws RemoteException;
    boolean isCatalogAtStart () throws RemoteException;
    boolean isReadOnly () throws RemoteException;
    boolean locatorsUpdateCopy () throws RemoteException;
    boolean nullPlusNonNullIsNull () throws RemoteException;
    boolean nullsAreSortedAtEnd () throws RemoteException;
    boolean nullsAreSortedAtStart () throws RemoteException;
    boolean nullsAreSortedHigh () throws RemoteException;
    boolean nullsAreSortedLow () throws RemoteException;
    boolean othersDeletesAreVisible (int type) throws RemoteException;
    boolean othersInsertsAreVisible (int type) throws RemoteException;
    boolean othersUpdatesAreVisible (int type) throws RemoteException;
    boolean ownDeletesAreVisible (int type) throws RemoteException;
    boolean ownInsertsAreVisible (int type) throws RemoteException;
    boolean ownUpdatesAreVisible (int type) throws RemoteException;
    boolean storesLowerCaseIdentifiers () throws RemoteException;
    boolean storesLowerCaseQuotedIdentifiers () throws RemoteException;
    boolean storesMixedCaseIdentifiers () throws RemoteException;
    boolean storesMixedCaseQuotedIdentifiers () throws RemoteException;
    boolean storesUpperCaseIdentifiers () throws RemoteException;
    boolean storesUpperCaseQuotedIdentifiers () throws RemoteException;
    boolean supportsAlterTableWithAddColumn () throws RemoteException;
    boolean supportsAlterTableWithDropColumn () throws RemoteException;
    boolean supportsANSI92EntryLevelSQL () throws RemoteException;
    boolean supportsANSI92FullSQL () throws RemoteException;
    boolean supportsANSI92IntermediateSQL () throws RemoteException;
    boolean supportsBatchUpdates () throws RemoteException;
    boolean supportsCatalogsInDataManipulation () throws RemoteException;
    boolean supportsCatalogsInIndexDefinitions () throws RemoteException;
    boolean supportsCatalogsInPrivilegeDefinitions () throws RemoteException;
    boolean supportsCatalogsInProcedureCalls () throws RemoteException;
    boolean supportsCatalogsInTableDefinitions () throws RemoteException;
    boolean supportsColumnAliasing () throws RemoteException;
    boolean supportsConvert () throws RemoteException;
    boolean supportsConvert (int fromType, int toType) throws RemoteException;
    boolean supportsCoreSQLGrammar () throws RemoteException;
    boolean supportsCorrelatedSubqueries () throws RemoteException;
    boolean supportsDataDefinitionAndDataManipulationTransactions () throws RemoteException;
    boolean supportsDataManipulationTransactionsOnly () throws RemoteException;
    boolean supportsDifferentTableCorrelationNames () throws RemoteException;
    boolean supportsExpressionsInOrderBy () throws RemoteException;
    boolean supportsExtendedSQLGrammar () throws RemoteException;
    boolean supportsFullOuterJoins () throws RemoteException;
    boolean supportsGetGeneratedKeys () throws RemoteException;
    boolean supportsGroupBy () throws RemoteException;
    boolean supportsGroupByBeyondSelect () throws RemoteException;
    boolean supportsGroupByUnrelated () throws RemoteException;
    boolean supportsIntegrityEnhancementFacility () throws RemoteException;
    boolean supportsLikeEscapeClause () throws RemoteException;
    boolean supportsLimitedOuterJoins () throws RemoteException;
    boolean supportsMinimumSQLGrammar () throws RemoteException;
    boolean supportsMixedCaseIdentifiers () throws RemoteException;
    boolean supportsMixedCaseQuotedIdentifiers () throws RemoteException;
    boolean supportsMultipleOpenResults () throws RemoteException;
    boolean supportsMultipleResultSets () throws RemoteException;
    boolean supportsMultipleTransactions () throws RemoteException;
    boolean supportsNamedParameters () throws RemoteException;
    boolean supportsNonNullableColumns () throws RemoteException;
    boolean supportsOpenCursorsAcrossCommit () throws RemoteException;
    boolean supportsOpenCursorsAcrossRollback () throws RemoteException;
    boolean supportsOpenStatementsAcrossCommit () throws RemoteException;
    boolean supportsOpenStatementsAcrossRollback () throws RemoteException;
    boolean supportsOrderByUnrelated () throws RemoteException;
    boolean supportsOuterJoins () throws RemoteException;
    boolean supportsPositionedDelete () throws RemoteException;
    boolean supportsPositionedUpdate () throws RemoteException;
    boolean supportsResultSetConcurrency (int type, int concurrency) throws RemoteException;
    boolean supportsResultSetHoldability (int holdability) throws RemoteException;
    boolean supportsResultSetType (int type) throws RemoteException;
    boolean supportsSavepoints () throws RemoteException;
    boolean supportsSchemasInDataManipulation () throws RemoteException;
    boolean supportsSchemasInIndexDefinitions () throws RemoteException;
    boolean supportsSchemasInPrivilegeDefinitions () throws RemoteException;
    boolean supportsSchemasInProcedureCalls () throws RemoteException;
    boolean supportsSchemasInTableDefinitions () throws RemoteException;
    boolean supportsSelectForUpdate () throws RemoteException;
    boolean supportsStatementPooling () throws RemoteException;
    boolean supportsStoredFunctionsUsingCallSyntax () throws RemoteException;
    boolean supportsStoredProcedures () throws RemoteException;
    boolean supportsSubqueriesInComparisons () throws RemoteException;
    boolean supportsSubqueriesInExists () throws RemoteException;
    boolean supportsSubqueriesInIns () throws RemoteException;
    boolean supportsSubqueriesInQuantifieds () throws RemoteException;
    boolean supportsTableCorrelationNames () throws RemoteException;
    boolean supportsTransactionIsolationLevel (int level) throws RemoteException;
    boolean supportsTransactions () throws RemoteException;
    boolean supportsUnion () throws RemoteException;
    boolean supportsUnionAll () throws RemoteException;
    boolean updatesAreDetected (int type) throws RemoteException;
    boolean usesLocalFilePerTable () throws RemoteException;
    boolean usesLocalFiles () throws RemoteException;}
