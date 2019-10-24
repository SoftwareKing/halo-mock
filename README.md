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
