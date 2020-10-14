package com.test;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    @Test
    public void hello() {
        System.out.println("开始~~~");
        Assert.assertEquals(1L, 1L);
        Assert.assertNotNull("对象不能为空", 1);
        System.out.println("结束~~~");
    }
}
