package org.pjdbc.rmi;

import java.rmi.*;

public interface ParameterMetaDataRemoteProxy extends WrapperRemoteProxy {
    String getParameterClassName (int param) throws RemoteException;
    int getParameterCount () throws RemoteException;
    int getParameterMode (int param) throws RemoteException;
    int getParameterType (int param) throws RemoteException;
    String getParameterTypeName (int param) throws RemoteException;
    int getPrecision (int param) throws RemoteException;
    int getScale (int param) throws RemoteException;
    int isNullable (int param) throws RemoteException;
    boolean isSigned (int param) throws RemoteException;}
