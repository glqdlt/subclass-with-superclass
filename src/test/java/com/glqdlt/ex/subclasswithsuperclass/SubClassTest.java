package com.glqdlt.ex.subclasswithsuperclass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by glqdlt on 2019-03-04.
 */
public class SubClassTest {

    private SubClass subClass;

    @Before
    public void setUp() throws Exception {
        subClass = new SubClass();
        subClass.setSubNumber(2);
        subClass.setSubString("sub");
        subClass.setSuperString("super");
        subClass.setSuperNumber(1);
    }

    @Test
    public void name() throws Exception {

        Assert.assertEquals(2,subClass.getSubNumber());
        Assert.assertEquals(1,subClass.getSuperNumber());
        Assert.assertEquals("super",subClass.getSuperString());
        Assert.assertEquals("sub",subClass.getSubString());

    }

    /**
     * 다형성을 사용하는 이유에 대한 테스트
     * @throws Exception
     */
    @Test
    public void name2() throws Exception {
        SuperClass superClass = subClass;

        Assert.assertEquals("super",superClass.getSuperString());
        Assert.assertEquals(1,superClass.getSuperNumber());

        SubClass sub2 = (SubClass) superClass;

        Assert.assertEquals(2,sub2.getSubNumber());
        Assert.assertEquals(1,sub2.getSuperNumber());
        Assert.assertEquals("super",sub2.getSuperString());
        Assert.assertEquals("sub",sub2.getSubString());

        Object someObject = sub2;

        Assert.assertTrue(someObject instanceof SuperClass);
        Assert.assertTrue(someObject instanceof SubClass);

        Assert.assertFalse(someObject instanceof  String);

        Assert.assertEquals("com.glqdlt.ex.subclasswithsuperclass.SubClass",someObject.getClass().getName());

        SubClass sub3 = (SubClass) someObject;

        Assert.assertEquals(2,sub3.getSubNumber());
        Assert.assertEquals(1,sub3.getSuperNumber());
        Assert.assertEquals("super",sub3.getSuperString());
        Assert.assertEquals("sub",sub3.getSubString());

    }

    @Test(expected = ClassCastException.class)
    public void name3() throws Exception {

        SuperClass superClass = new SuperClass();
        superClass.setSuperNumber(3);
        superClass.setSuperString("super");

//        throw ClassCastException
        SubClass subClass = (SubClass) superClass;

    }


    @Test(expected = ClassCastException.class)
    public void name4() throws Exception {

        SuperClass superClass = new SuperClass();
        superClass.setSuperNumber(3);
        superClass.setSuperString("super");

        Object object = superClass;

        System.out.println(object.getClass().getName());


//        throw ClassCastException
        SubClass subClass = (SubClass) object;
    }
}