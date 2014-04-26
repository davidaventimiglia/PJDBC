package com.jw.server;

import java.io.*;
import java.util.*;

public class ResultSetChunk implements Serializable{
    private Vector rsRows;
    int curIndex = 0;

    public ResultSetChunk(Vector rows) {
	rsRows = rows;}

    public Object[] getNextRow () {
	Object []row = null;
	if (curIndex < rsRows.size()) {
	    row = (Object[])rsRows.elementAt(curIndex);
	    curIndex++;}
	return row;}}
