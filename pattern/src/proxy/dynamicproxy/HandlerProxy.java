package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/4.
 */
public class HandlerProxy implements InvocationHandler {

    private Person person;

    public HandlerProxy(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = null;

        if (method.getName().equals("handle")) {
            System.out.println("代理人：商量价格");
            System.out.println("代理人：付款给代理");
            invoke = method.invoke(person, args);
            System.out.println("代理人：取号排队");
            System.out.println("代理人：业务办理");
        }
        return invoke;
    }
}
