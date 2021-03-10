package com.designpattern.singleton;

//SingleTon class
public class DBConn {

	// static private member instance to hold its own instance
	private static DBConn instance = null;

	// Private constructor
	private DBConn() {

	}

	// Static function.
	public static DBConn getInstance() {

		
		if (instance == null) {
			instance = new DBConn();
		}
		return instance;
	}

}
