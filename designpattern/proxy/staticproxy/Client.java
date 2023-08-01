package com.atguigu.designpattern.proxy.staticproxy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        TeacherDAO teacherDAO = new TeacherDAO();

        teacherDAO.teach();

        TeacherDAOProxy teacherDAOProxy = new TeacherDAOProxy(teacherDAO);

        teacherDAOProxy.teach();
    }
}
