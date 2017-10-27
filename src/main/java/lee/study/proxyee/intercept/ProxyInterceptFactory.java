package lee.study.proxyee.intercept;

/**
 * 拦截器初始化接口
 *@author monkeyWie {@see https://github.com/monkeyWie/proxyee}
 */
public interface ProxyInterceptFactory {
    HttpProxyIntercept build();
}
