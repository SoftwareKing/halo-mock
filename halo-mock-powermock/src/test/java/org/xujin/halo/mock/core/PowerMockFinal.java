package org.xujin.halo.mock.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.xujin.halo.mock.core.more.Source;
import org.xujin.halo.mock.core.more.SourceDepend;

@PrepareForTest(SourceDepend.class)
@RunWith(PowerMockRunner.class)
public class PowerMockFinal {

    /**
     * Mock普通对象的final方法
     */
    @Test
    public void testCallFinalMethod()
    {
        SourceDepend depencency = PowerMockito.mock(SourceDepend.class);
        Source underTest = new Source();
        /**
         * 当执行到depencency.isAlive()时让其返回true
         */
        PowerMockito.when(depencency.isAlive()).thenReturn(true);

        /**
         * 判断是否返回true
         */
        Assert.assertTrue(underTest.callFinalMethod(depencency));
    }


    /**
     * Mock普通类的静态方法
     */
     @Test
    public void testCallStaticMethod() {
        Source underTest = new Source();
        PowerMockito.mockStatic(SourceDepend.class);
        PowerMockito.when(SourceDepend.isExist()).thenReturn(true);
        Assert.assertTrue(underTest.callStaticMethod());
    }

}
