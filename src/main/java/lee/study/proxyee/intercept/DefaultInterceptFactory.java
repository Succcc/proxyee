package lee.study.proxyee.intercept;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
/**
 *@author monkeyWie {@see https://github.com/monkeyWie/proxyee}
 */
public class DefaultInterceptFactory implements ProxyInterceptFactory {
    @Override
    public HttpProxyIntercept build() {
        return new HttpProxyIntercept();
    }
}
