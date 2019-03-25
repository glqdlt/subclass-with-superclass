package com.glqdlt.ex.subclasswithsuperclass;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jhun
 * 2019-03-25
 */
public class SomeTest {

    @Test
    public void test() {

        SomeObject someObject = new SomeObject();
        someObject.setField1("one");
        someObject.setFiled2(2);

        Assert.assertEquals("Object : SomeObject{field1='one', filed2=2}", String.format("Object : %s", someObject));

    }


    public static class SomeObject {
        @Override
        public String toString() {
            return "SomeObject{" +
                    "field1='" + field1 + '\'' +
                    ", filed2=" + filed2 +
                    '}';
        }

        public String getField1() {
            return field1;
        }

        public void setField1(String field1) {
            this.field1 = field1;
        }

        public Integer getFiled2() {
            return filed2;
        }

        public void setFiled2(Integer filed2) {
            this.filed2 = filed2;
        }

        private String field1;
        private Integer filed2;
    }
}
