package com.glqdlt.ex.subclasswithsuperclass.defaultMethod;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jhun
 * 2019-03-14
 */
public class PersonTest {

    @Test
    public void 근육맨은고기를먹는다() {
        Person muscularMan = new MuscularMan();
        Assert.assertEquals("'고기' 는 맛있어, 우걱우걱", muscularMan.eat());
    }

    @Test
    public void 채식주의자는야채를먹는다() {
        Person vegetarian = new Vegetarian();
        Assert.assertEquals("'채소' 는 맛있어, 아삭아삭", vegetarian.eat());
    }

    @Test
    public void 근육맨은헬스장을간다() {
        Person muscularMan = new MuscularMan();
        Assert.assertEquals("헬스는 즐거워", ((MuscularMan) muscularMan).goGym());
    }

    @Test
    public void 채식주의자는헬스장을안간다() {
        Person vegetarian = new Vegetarian();
        Assert.assertEquals("요가는 즐거워", ((Vegetarian) vegetarian).goGym());
    }

    @Test
    public void 요가맨은요가를간다() {
        Person yogaMan = new YogaMan();
        Assert.assertEquals("요가는 즐거워", ((YogaMan) yogaMan).goGym());
    }

    @Test
    public void 일반사람은운동을안한다() {
        Person person = () -> "다 먹어 맛있엉";

        Assert.assertEquals("다 먹어 맛있엉", person.eat());
//        goGym이 없다.
//        person.goGym();
//        Woman 이 Person 을 상속한것이기에, super에서 sub로 거슬러가는 것이 불가능한 것은 맞다.
//        하지만 defaults 메소드는 이미 구현되어있는 메소드인데, 호출 할 수가 없다. 자바는 유연하지 못한 모습이다, MixIn 과는 거리가 좀 멀다.
//        ((YogaMan) person).goGym();
    }
}