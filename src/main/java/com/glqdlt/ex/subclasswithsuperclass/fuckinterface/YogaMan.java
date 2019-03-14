package com.glqdlt.ex.subclasswithsuperclass.fuckinterface;

/**
 * @author Jhun
 * 2019-03-14
 */
public class YogaMan implements Man,Woman {
    @Override
    public String eat() {
        return null;
    }

    /**
     * MuscluarWoman 과는 달리 아래에서는 default method 를 선택하는 식으로 처리했다.
     * @return
     */
    public String goGym() {
        return Woman.super.goGym();
    }
}
