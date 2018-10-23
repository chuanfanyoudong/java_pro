package java_basis.extendlearn;

public class Apple extends Fruit {
    /**
    *java 不支持多继承
     * 可对分类方法重写
     */

    public void test(){
        /**
         * 这里就是重写父类，因为父亲类中也有一个test方法
         */
        System.out.println("重写父类");
    }
    public void testSupper(){
        /**
         * supper不能出现在static修饰的方法中
         * 重写之后依然想要调用父亲的实例变量和 方法，需要用supper
         */
        super.test();
    }
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.test();
        apple.testSupper();
        Fruit.testClass();

    }
}
