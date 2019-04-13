package com.actitime.tests;

import com.actitime.pages.ExcelData;

public class Demo {
public static void main(String[] args) {
	
	String data = ExcelData.getData("C:\\Users\\golan\\ProjectManagement\\ActiTime\\data\\input.xlsx", "Sheet1", 0, 0);
	System.out.println(data);
	int rc=ExcelData.geRowCount("C:\\Users\\golan\\ProjectManagement\\ActiTime\\data\\input.xlsx","Sheet1");
	System.out.println(rc);
	int celcount=ExcelData.geCellCount("C:\\\\Users\\\\golan\\\\ProjectManagement\\\\ActiTime\\\\data\\\\input.xlsx", "Sheet1", 0);
	System.out.println(celcount);
}
}
