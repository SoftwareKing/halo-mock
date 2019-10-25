## halo-mock
halo-mock分享mock案例

### Halo Powermock

how to mock final, static or private methods using powermock

https://github.com/powermock/powermock


## powermock

PowerMock基本上cover了所有Mockito不能支持的case（大多数情况也就是静态方法，但其实也可以支持私有方法和构造函数的调用）。PowerMock使用了字节码操作，因此它是自带Junit runner的。在使用PowerMock时，
必须使用@PrepareForTest注释被测类，mock才会被执行：
@RunWith(PowerMockRunner.class)

### 概要说明
    
单体测试工具，优点是能mock静态、final、私有方法等其他mock工具不具备的特点
   
1.重要注解一 @RunWith(PowerMockRunner.class)
    
2.重要注解二 @PrepareForTest({YourClass})
    
3.包括实例有普通Mock，Mock方法内部new出来的对象，Mock普通对象的final方法，Mock普通类的静态方法，Mock 私有方法


## 参考资料

https://www.jianshu.com/p/51930cc5dcf9


https://github.com/hehonghui/mockito-doc-zh

https://blog.csdn.net/luo15242208310/article/details/100098274

http://www.thinkcode.se/blog/2012/02/18/test-coverage-in-a-multi-module-maven-project

https://blog.csdn.net/onepersontz/article/details/58098729

https://blog.csdn.net/hotdust/article/details/53406044

https://www.jianshu.com/p/506a30b57ff7


##命令介绍

https://www.cnblogs.com/qyf404/archive/2015/12/12/5040593.html


* cobertura:check

   根据最新的源码标记(生成的class文件)校验测试用例的覆盖率,如果没有达到要求,则执行失败.

* cobertura:check-integration-test

   这个命令和cobertura:check功能是一样的,区别是二者绑定的maven生命周期不一样.cobertura:check绑定了test, cobertura:check-integration-test绑定了verify.再说的明白些,maven生命周期中有一个是test跑得单元测试,还有一个是integration-test跑的集成测试.而verify前就是integration-test.即cobertura:check-integration-test比cobertura:check涵盖的测试用例更多.

* cobertura:clean

   这个好理解,就是清理掉目录/target/cobertura/中得文件.目前发现里面就一个文件cobertura.ser.

* cobertura:cobertura

   这个插件的关键命令.标记被编译的文件,运行单元测试,生成测试报告.

*  cobertura:cobertura-integration-test

    和cobertura:cobertura做了一样的事情,区别是包含了集成测试用例.

*  cobertura:dump-datafile

    在命令行输出覆盖率数据.数据依据是生成的class文件.这个命令我没搞懂他的意义何在.在后面一个有趣的实验我们会用这个命令来更好的理解cobertura-maven-plugin.

*  cobertura:help

*  cobertura:instrument

    标记被编译的class文件.执行这个命令会在目录/target/generated-classes/cobertura下生成一套class文件.

### Java 各种Mock工具比较，JMockit无敌

https://blog.csdn.net/imi00/article/details/79306028
