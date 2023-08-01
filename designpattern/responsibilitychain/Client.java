package com.atguigu.designpattern.responsibilitychain;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.util.prefs.AbstractPreferences;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 3000, 1);
        PurchaseRequest purchaseRequest1 = new PurchaseRequest(1, 31000, 2);

        Approver department = new DepartmentApprover("Department");
        Approver college = new CollegeApprover("College");
        Approver viceSchoolMaster = new ViceSchoolMaterApprover("Vice school master");
        Approver schoolMaster = new SchoolMasterApprover("School Master");

        department.setNextApprover(college);
        college.setNextApprover(viceSchoolMaster);
        viceSchoolMaster.setNextApprover(schoolMaster);

        department.processPurchaseRequest(purchaseRequest);
        department.processPurchaseRequest(purchaseRequest1);
    }
}
