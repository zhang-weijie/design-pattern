package com.atguigu.designpattern.flyweight;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import javax.xml.stream.FactoryConfigurationError;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();

        //offer a website in news form
        Website news = websiteFactory.getWebsiteOfCategory("news");
        news.use(new User("students"));

        //offer a website in blog form
        Website blog = websiteFactory.getWebsiteOfCategory("blog");
        blog.use(new User("employees"));

        //offer another website in blog form
        Website blog1 = websiteFactory.getWebsiteOfCategory("blog");
        blog1.use(new User("rentners"));

        System.out.println(websiteFactory.getWebsiteCount());//2
    }
}
