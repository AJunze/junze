package filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: Junze
 * @Date: Create in 15:18 2017/5/31
 * @Description:
 */
@WebFilter(urlPatterns = "/X")
public class My2Filter implements Filter {

    public My2Filter(){

        System.out.println("创建实例");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init2");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("业务处理2");
        //进入servlet
        filterChain.doFilter(servletRequest,servletResponse);

        //servlet处理完成回到filter
        System.out.println("回到过滤器2");


    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
