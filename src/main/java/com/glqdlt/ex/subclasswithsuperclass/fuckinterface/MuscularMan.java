package com.glqdlt.ex.subclasswithsuperclass.fuckinterface;

/**
 * @author Jhun
 * 2019-03-14
 */
public class MuscularMan implements Man {
    @Override
    public String eat() {
        return String.format("'%s' 는 맛있어, 우걱우걱", "고기");
    }

}
