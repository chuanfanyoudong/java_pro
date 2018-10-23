package java_basis.extendlearn;



public class Fruit{
    public void test(){
        System.out.println("test extend from duixajng");
    }
    public static void testClass(){
        System.out.println("test extend from class");
    }
    static String a = "asdfa";

    public Fruit() {
        System.out.println("父类普通构造器");
    }

    public Fruit(String test) {
        /**
         * 如果B构造器包含了A构造器，那么可以直接用this(参数);方法直接调用构造器；
         */
        this();
        System.out.println("父类重载构造器");
    }
}


