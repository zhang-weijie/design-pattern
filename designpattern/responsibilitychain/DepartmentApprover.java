package com.atguigu.designpattern.responsibilitychain;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class DepartmentApprover extends Approver{
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processPurchaseRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000)
            System.out.println("Purchase request " + purchaseRequest.getId() + " processed by department approver");
        else
            nextApprover.processPurchaseRequest(purchaseRequest);
    }
}
