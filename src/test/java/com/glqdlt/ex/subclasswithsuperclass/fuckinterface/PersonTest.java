package com.glqdlt.ex.subclasswithsuperclass.fuckinterface;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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
}