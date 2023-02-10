package com.aycelik.designpatterns.singleton;

import org.junit.Test;
import org.junit.Assert;

public class LoggerTest {
    @Test
    public void whenGetDifferentInstances_firstCreatedInstanceWillBeUsed() {
        Logger firstObj = Logger.getInstance("FIRST_OBJ");
        Logger secondLoggerObj = Logger.getInstance("SECOND_OBJ");

        Assert.assertEquals(firstObj.getValue(), "FIRST_OBJ");
        Assert.assertEquals(secondLoggerObj.getValue(), "FIRST_OBJ");
    }
}
