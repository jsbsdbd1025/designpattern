package proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2017/7/4.
 */
public class MainDynamicProxy {

    public static void main(String[] args) {
        //创建具体类
        Person xiaomin = new Person();

        HandlerProxy handler = new HandlerProxy(xiaomin);

        IPerson proxy = (IPerson) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(), // 类加载器
                new Class[]{IPerson.class}, // 这里必须是接口,否则会报错
                handler);// 代理类

        proxy.handle(1);

    }

}
