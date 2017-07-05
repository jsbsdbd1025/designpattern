package proxy.staticproxy;

/**
 * Created by lenovo on 2017/7/4.
 */
public class MainStaticProxy {


    public static void main(String[] args) {

        Person xiaomin = new Person();

        PersonProxy proxy = new PersonProxy(xiaomin);

//        xiaomin.handle();

        proxy.handle();
    }

}
