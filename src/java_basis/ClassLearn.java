package java_basis;

public class ClassLearn {
    /**
     * 一个类中包含的内容有：
     * 零个到多个的构造器、成员变量和方法
     * 类之前的修饰符可以使public、final、private或者不写
     * 但static修饰的成员不能访问非static修饰的成员
     * 类名规范：要求每个单词的首字母大写，其余字母小写；不使用连接符
     */
    public ClassLearn() {
        /**
         * 这里为构造器、就是一个和类具有相同名字的方法；如果没有该方法，系统会有一个默认的构造器
         * 在生成该类的实例的时候会调用该构造器
         */
    }
    public  String example = "test";
    /**
     * 上面为成员变量的定义方法，其中public为修饰符，该位置可以放public、protected、private、static、final;
     * 其中public、protected、private可以与static或者final组合联用。
     * String为类型，该处可以防止java的基本类型和引用类型
     * example为变量名，变量名要求是：单词之间不使用分隔符、第一个单词全部小写、后面的单词首字母大写、其余小写
     */
    public static void say(String content){
        /**
         * 这是一个方法的例子，其中命名部分和成员变量类似
         */
        System.out.println(new ClassLearn().example);
        System.out.println("这是一个方法的例子");
    }
    /**
     * static 关键字代表的实该成员为类成员，不属于这个类的实例
     * 所以叫做成员变量、成员方法
     * 与之对应，无static修饰的称作实例变量、实例方法
     * 静态成员不能访问非静态成员：这是因为static只能类访问，而调用其他方法是通过this关键字访问的
     * this关键字实际上就是引用了该类的一个对象，谁在调用该方法，this就代表谁，所以this永远代表一个对象，
     * 所以不能被static访问到
     */

    ClassLearn classLearn = new ClassLearn();
    /**
     * 上面是调用一个类从而生成一个对象方法
     * 期间，classlearn存放到栈内存中，真正的对象存放在堆内存中，java不允许直接访问堆内存，所以会通栈内存中的变量
     * 引用到堆内存，如果该内存没有了引用对象，则会启动垃圾回收机制了
     */
}
