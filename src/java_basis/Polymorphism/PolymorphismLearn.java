package java_basis.Polymorphism;


class BaseClass{

    public String book = "父类中的实例变量";
    public void base(){
        System.out.println("父类的普通方法");
    }
    public void test(){
        System.out.println("父类的被覆盖的方法");
    }
}
public class PolymorphismLearn extends BaseClass{
    /**
     * 如果该变量在编译和运行时类型不一样，就出现了多态现象
     */
    public String book = "子类中的实例变量";
    public void test(){
        System.out.println("子类覆盖父类的方法");
    }
    public void sub(){
        System.out.println("子类的普通方法");
    }
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        /**
         * 这类正常调用不会产生问题
         */
        System.out.println(baseClass.book);
        baseClass.base();
        baseClass.test();
        BaseClass baseClass1 = new PolymorphismLearn();
        /**
         * 这是属于多态问题
         *相同的类型（BaseClasss）变量baseClass1 在调用相同方法时有多种不同的表达
         * 运行子类中也有的方法时，会表现出子类的方法特征，而不是父类的方法特征
         * 运行子类中也有的变量时，会表现出父类的特征，与方法的多态不一样
         */
        System.out.println("多态问题");
        System.out.println(baseClass1.book);
        baseClass1.test();
        baseClass1.base();
        ((PolymorphismLearn) baseClass1).sub();
    }
}
