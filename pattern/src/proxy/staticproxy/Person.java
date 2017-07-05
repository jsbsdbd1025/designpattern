package proxy.staticproxy;

/**
 * 真实（具体）类
 */
public class Person implements IPerson {

    @Override
    public void handle() {
        System.out.println("本人：提交材料");
    }
}
