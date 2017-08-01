package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * @Author: Junze
 * @Date: Create in 15:25 2017/6/1
 * @Description:
 */

@WebFilter(urlPatterns = "/X",initParams = {@WebInitParam(name = "1",value = "a")})
public class My1Filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String initParameter = filterConfig.getInitParameter("1");
        System.out.println(initParameter);
        System.out.println("init1");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("业务处理1");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("回到过滤器1");
    }

    @Override
    public void destroy() {

    }
}
