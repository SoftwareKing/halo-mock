package org.xujin.halo.mock.core.more;

public class SourceDepend {

    public final boolean isAlive() {
        System.out.println("-----return false-----");
        return false;
    }

    //测试目标代码：
    public boolean callStaticMethod() {
        System.out.println("-----callStaticMethod-----");
        return SourceDepend.isExist();
    }
    public static boolean isExist()
    {
        System.out.println("-----Static Method isExist-----");
        return false;
    }


}


