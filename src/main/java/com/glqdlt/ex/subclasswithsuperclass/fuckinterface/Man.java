package com.glqdlt.ex.subclasswithsuperclass.fuckinterface;

/**
 * @author Jhun
 * 2019-03-14
 */
public interface Man extends Person {
    default String goGym(){return "헬스는 즐거워";}
}
