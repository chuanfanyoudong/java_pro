package java_basis;

public class MethodInfo {
    public String methodExample(){
        /**
         * f方法只能依赖于类或者对象，类中方法之间的调用是因为如果没有static，则为this.这个方法。
         * 如有statis，则默认为类.这个方法
         * 永远不能独立执行方法，要不通过类调用，要么通多对象调用。
         */
        return "test";
    }
    public static void swap(DataWrap dw){
        /**
         * 方法的值传递机制：主要是复制传递，如果是string = 0,
         * 则会复制一份进行传递，如果是a = dw.a, 因为这里是引用地址，类似于指针，所以传递的也是一个指针
         *
         */
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println(dw.a + "" +  dw.b);
    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println(dw.a + "" +  dw.b);
    }

    /**
     * 是可以传递可变个参数的，需要放在最后，String... books
     */


}



class Recursive{
    /**
     * 递归方法
     */
    public static int fn(int n){
        if(n == 0){
            return 1;
        }
        else if (n == 1){
            return 2;
        }
        else {
            return 2*fn(n-1) + fn(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(9));
    }
}

class Overload{
    /**
     * 方法重载，确定一个方法需要三个要素：
     * 1、方法的调用者
     * 2、方法名
     * 3、调用参数
     * 重载的定义要求：同一个类中方法名相同，但参数不同
     */
    public static void test(){
        System.out.println("重载无参数");
    }
    public static void test(int a){
        System.out.println("重载有参数" + toString(a));
    }
    public static String toString(int a ){
        return String.valueOf(a);
    }
    public static void main(String[] args) {
        test();
        test(555);
    }

}
class DataWrap{
    int a = 6;
    int b = 9;
        }

