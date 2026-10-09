package com.learning.array;

public class PatientList {
	public static void main(String[] args) {
//		creating object
		PatientList ptl1 = PatientList("kamdev","307");
		PatientList ptl2 =  PatientList("Ramdev","308");
		PatientList ptl3 = PatientList("Samdev","309");
		PatientList ptl4 = PatientList("Aamdev","304");
		PatientList ptl5 = PatientList("namdev","303");
		
		// store user objects in an array.
		
		PatientList patient[] = new PatientList[5];
		
		patient[0] = ptl1;
		patient[1] = ptl2;
		patient[2] = ptl3;
		patient[3] = ptl4;
		patient[4] = ptl5;
		
	}
}
