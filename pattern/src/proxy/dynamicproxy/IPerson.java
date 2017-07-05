package proxy.dynamicproxy;

/**
 * 抽象类
 */
public interface IPerson {
    void handle(int count);

    void unProxyHandle();
}
