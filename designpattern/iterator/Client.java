package com.atguigu.designpattern.iterator;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();

        College computerCollege = new ComputerCollege();
        computerCollege.addDepartment("JAVA","JAVA");
        computerCollege.addDepartment("PHP","PHP");
        computerCollege.addDepartment("GOLANG","GOLANG");

        College informationCollege = new InformationCollege();
        informationCollege.addDepartment("BIGDATA","BIGDATA");
        informationCollege.addDepartment("DATA ANALYSE","DATA ANALYSE");

        collegeList.add(computerCollege);
        collegeList.add(informationCollege);

        UniversityOutputImpl universityOutput = new UniversityOutputImpl(collegeList);
        universityOutput.printCollege();
    }
}
