package com.designpattern.singleton;

public class UseSingletonMain {
	public static void main(String[] args) {

		DBConn db1 = DBConn.getInstance();
		System.out.println(db1);

		DBConn db2 = DBConn.getInstance();
		System.out.println(db2);

		System.out.println(db1 == db2);


	}

}
