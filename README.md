# Android-Advance

安卓系统以及进阶教程

撰写这个工程，有两个目的。

1. 帮助那些想系统完善Android体系的人，有一个资料
2. 做一个知识库，丰富自己的眼界，提升自己的能力

不断挑战突破自己，即使是咸鱼，也要做最咸的那一条。技术要日有精进，要沿着目标一步一步的走过去。定一个小目标吧，半年内，加入BAT TMD这类的公司。



## 算法

1. [判断单链表是否有环,并且找到相交点](/algorithm/IsHaveCircle.java)
2. [逆转链表](/algorithm/ReverseNode.java)
3. 反转一颗二叉树
4. 单链表输出倒数第 k 个元素
5. 100 万个数据找出 100 个最大的
6. 快排，堆排，归并排序
7. 判断一颗二叉树是完全二叉树
8. [分析一下常见的排序算法的稳定性](https://www.cnblogs.com/tigerson/p/7156648.html)


## JVM基础

1. Java GC简介
2. 操作系统如何管理内存的

## Java基础

1. Java的final关键字的作用
    - [浅析Java中的final关键字](http://www.importnew.com/18586.html)
2. volatile 的作用，为什么会出现变量读取不一致的情况， synchronized 的区别
    - [你真的了解volatile关键字吗？](http://www.importnew.com/24082.html)
3. Java 中的 Error、 Exception 的区别
4. ArrayList 如何删除重复的元素或者指定的元素
5. Java 异常简介
6. Java 中内部类为什么可以访问外部类
7. Java 泛型
8. equals 和 hashcode 的关系
    - [ Java中==和equals的区别](http://blog.csdn.net/tiantiandjava/article/details/46988461)
9. Hashmap 的源码和实现方式
    - [从源码角度认识ArrayList，LinkedList与HashMap](https://www.jianshu.com/p/f174d49b391c)
10. ArrayList 和 LinkedList 的区别？造成区别的原因是什么，为什么删查的复杂度不同
11. Java 反射
12. Java GC 了解过没有，如何判断一个对象是否可以被GC
13. Java 线程同步了解不，同步方法在不同的实例之间是否仍然保持同步，有没有什么隐患
14. Java 类加载机制了解不，双亲委派原理
15. 四种引用类型的概念
    - [四种引用类型的概念](https://www.cnblogs.com/theo/p/6443493.html)
16. [Java内部类详解](https://www.cnblogs.com/dolphin0520/p/3811445.html)


## 常见的设计模式

1. 单利模式
2. [单例的双重检验的实现方式](/algorithm/Singleton.java)
3. 生产者消费者模式

## 计算机网络

1. Tcp 三次握手和四次挥手
2. 浏览器输入地址到返回结果发生了什么
3. Tcp 是如何保证可靠性传输的
4. Tcp/IP 协议几层
5. 如何设计在 UDP 上层保证 UDP 的可靠性传输


## 操作系统

1. 进程间通信有哪些方法
2. 进程和线程的区别


## Android相关

1. 布局优化的过程
    - [Android性能优化之布局优化](https://www.cnblogs.com/hoolay/p/6248514.html)
    - [Android性能优化系列之布局优化](http://blog.csdn.net/u012124438/article/details/54564659)
    - [ Android 性能优化之布局优化](http://blog.csdn.net/u014608640/article/details/52511329)
2. 性能优化有哪方面
    - [Android性能优化的方面](https://www.jianshu.com/p/4d6c38e1f5b8)
3. 什么是MVP模式
4. Activity启动过程
5. Activity生命周期什么时候调用
    - [横竖屏切换对Activity生命周期的影响](http://blog.csdn.net/hzw19920329/article/details/51345971)
6. 热更新技术简介
7. 避免OOM的方法
8. 自行设计一个图片加载库的思路
9. 布局优化的过程，为什么要进行过度绘制的优化
10. APK里面包含哪写东西，打包过程是什么样的
11. Handler 机制描述
12. Android 事件分发过程
13. HashMap 的实现过程
14. 断点上传如何设计
15. 生成的 apk 文件，解压后会有什么目录
    - [apk包解压缩后的文件结构](http://blog.csdn.net/qu213/article/details/9629883)
16. 讲讲 Gradle 语法、生命周期
17. ListView 和 RecycleView 的比较
    - [ViewHolder重用机制理解(解决图片错乱和闪烁问题)](http://blog.csdn.net/xyq046463/article/details/51800095?locationNum=3)
    - [ListView中convertView和viewHolder](https://www.cnblogs.com/yuhanghzsd/p/5595532.html)
18. 网络框架用了哪些，讲讲使用的框架的原理
19. 事件分发机制
20. 注解的优缺点
    - [ 注解机制及其原理](http://blog.csdn.net/wangyangzhizhou/article/details/51698638)
21. Activity和Fragment的生命周期，Home和Back键的生命周期
    - [Fragment 生命周期的详情](https://www.cnblogs.com/fajieyefu/p/6092465.html)
22. 写Service的两种实现方式和生命周期
23. 静态同步方法和非静态同步方法的区别
    - [Synchronized同步静态方法和非静态方法总结](http://blog.csdn.net/u010842515/article/details/65443084)
24. Android 多进程如何实现
25. 子线程更新UI的方式
    - [Android子线程中更新UI的3种方法](http://gqdy365.iteye.com/blog/2112471)
26. Handler 的实现机制，画图讲解
27. 安卓内存泄露检测以及解决方案
28. 讲讲线程池
29. 如果加快 Gradle 的编译速度
30. Android 事件分发机制了解不
31. Android 绘制过程，onMeasure 的原理，解决了什么问题
32. LeakCanary核心原理
    - [LeakCanary核心原理源码浅析](http://blog.csdn.net/cloud_huan/article/details/53081120)
    - [LeakCanary 内存泄露监测原理研究](https://www.jianshu.com/p/5ee6b471970e)
33. 序列化Serializable与Parcelable原理与区别
    - [序列化Serializable与Parcelable原理与区别](https://www.jianshu.com/p/2939e11b5ecb)
