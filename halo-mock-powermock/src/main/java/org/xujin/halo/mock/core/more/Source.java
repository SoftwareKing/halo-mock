package org.xujin.halo.mock.core.more;

import java.io.File;

public class Source {

    //测试目标代码：
    public boolean callArgumentInstance(File file) {
        return file.exists();
    }

    //测试目标代码：
    public boolean callInternalInstance(String path) {
        File file = new File(path);
        return file.exists();
    }

    public boolean callFinalMethod(SourceDepend refer) {
        return refer.isAlive();
    }

    //测试目标代码：
    public boolean callPrivateMethod() {
        return isExist();
    }

    private boolean isExist() {
        return false;
    }


    //测试目标代码：
    public boolean callStaticMethod() {
        return SourceDepend.isExist();
    }


    //测试目标代码：
    public boolean callSystemFinalMethod(String str)
    {
        return str.isEmpty();
    }

    public String callSystemStaticMethod(String str)
    {
        return System.getProperty(str);
    }

}
