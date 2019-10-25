package org.xujin.halo.springtest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.xujin.halo.springtest.controller.AppController;

public class AppControllerTest extends CommonTest {

    @Autowired
    private AppController appController;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_addApp() {
        Assert.assertEquals(appController.getApp(12L),"Hi,Spring Test");
    }

}
