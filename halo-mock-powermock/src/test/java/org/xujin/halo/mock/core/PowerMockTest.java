package org.xujin.halo.mock.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.xujin.halo.mock.core.more.Source;

import java.io.File;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Source.class)
public class PowerMockTest {


    /**
     * 普通Mock：Mock参数传递的对象
     */
    @Test
    public void testCallArgumentInstance() {
        File file = PowerMockito.mock(File.class);
        Source underTest = new Source();
        PowerMockito.when(file.exists()).thenReturn(true);
        Assert.assertTrue(underTest.callArgumentInstance(file));
    }

    /**
     * Mock方法内部new出来的对象
     * @throws Exception
     */
    @Test
    public void testCallInternalInstance() throws Exception
    {
        File file = PowerMockito.mock(File.class);
        Source underTest = new Source();
        PowerMockito.whenNew(File.class).withArguments("/Users/xujin/Desktop/feture/xujintest").thenReturn(file);
        PowerMockito.when(file.exists()).thenReturn(true);
        Assert.assertTrue(underTest.callInternalInstance("/Users/xujin/Desktop/feture/xujintest"));
    }


    /**
     * Mock 私有方法
     * @throws Exception
     */
    @Test
    public void testCallPrivateMethod() throws Exception
    {
        Source underTest = PowerMockito.mock(Source.class);
        PowerMockito.when(underTest.callPrivateMethod()).thenCallRealMethod();
        PowerMockito.when(underTest, "isExist").thenReturn(true);
        Assert.assertTrue(underTest.callPrivateMethod());
    }


    /**
     * Mock系统类的静态和final方法
     */
    @Test
    public void testCallSystemStaticMethod()
    {
        Source underTest = new Source();
        PowerMockito.mockStatic(System.class);
        PowerMockito.when(System.getProperty("aaa")).thenReturn("bbb");
        Assert.assertEquals("bbb", underTest.callSystemStaticMethod("aaa"));
    }





}
