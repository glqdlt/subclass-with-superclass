package com.glqdlt.ex.subclasswithsuperclass.fuckinterface;

/**
 * @author Jhun
 * 2019-03-14
 */
public class Vegetarian implements Woman {
    @Override
    public String eat() {
        return String.format("'%s' 는 맛있어, 아삭아삭", "채소");
    }

}
