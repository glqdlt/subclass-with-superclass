package com.glqdlt.ex.subclasswithsuperclass.fuckinterface;

/**
 * @author Jhun
 * 2019-03-14
 */
public class MuscluarWoman implements Woman, Man{

    @Override
    public String eat() {
        return "채소는 맛있어";
    }

    /**
     * goGym() 이 Woman 에도 Man에도 존재하는 default method 다 보니 충돌이 난다.
     * 이런 경우 오버라이딩을 해줘야한다.
     * @return
     */
    @Override
    public String goGym() {
        return "헬스와 요가의 충돌";
    }
}
