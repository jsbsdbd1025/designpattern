package proxy.staticproxy;

/**
 * Created by lenovo on 2017/7/4.
 */
public class PersonProxy implements IPerson {

    private Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public void handle() {
        System.out.println("代理人：商量价格");
        System.out.println("代理人：付款给代理");
        person.handle();
        System.out.println("代理人：取号排队");
        System.out.println("代理人：业务办理");
    }
}
