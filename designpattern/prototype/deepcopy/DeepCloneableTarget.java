package com.atguigu.designpattern.prototype.deepcopy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.io.Serializable;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //As the class attributes are all of type String, we use the default clone method here
        return super.clone();
    }
}
