package proxy.dynamicproxy;

/**
 * 真实（具体）类
 */
public class Person implements IPerson {


    @Override
    public void handle(int count) {

        System.out.println("count:"+count);
        System.out.println("本人：提交材料");
    }

    @Override
    public void unProxyHandle() {
        System.out.println("没有被代理的操作");
    }
}
