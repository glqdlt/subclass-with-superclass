package com.glqdlt.ex.subclasswithsuperclass.defaultMethod;

/**
 * @author Jhun
 * 2019-03-14
 */
public interface Woman extends Person {
    default String goGym(){return "요가는 즐거워";}
}
