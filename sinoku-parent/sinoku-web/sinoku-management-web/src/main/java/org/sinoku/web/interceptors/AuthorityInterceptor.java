package org.sinoku.web.interceptors;


import org.apache.log4j.NDC;
import org.sinoku.common.utils.common.IpUtils;
import org.sinoku.web.controller.base.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 拦截器
 *
 * @author ao.shen
 *         <p>
 *         Created by shenao
 */
public class AuthorityInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorityInterceptor.class);
    // 允许通过的访问地址，定义不在权限管理之内的特殊访问
    private static final List<String> ALLOW_ACCESS_URL = new ArrayList<String>();

    {
        // ALLOW_ACCESS_URL.add("");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 允许访问的Controller类
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            if (handlerMethod.getBean() instanceof LoginController) {
                log(String.format("Allow access to %s", handlerMethod.getBean().getClass().getName()), request);
                return true;
            }
        }
        String uri = request.getRequestURI();
        // 允许访问的地址
        for (String _url : ALLOW_ACCESS_URL) {
            if (uri.equals(_url)) {
                log(String.format("Allow access to %s", uri), request);
                return true;
            }
        }
        // 验证用户权限
        Object userId = request.getSession().getAttribute("userId");
        if (null != userId && AuthorityUtil.hasUserUrlAuth(Integer.valueOf(userId.toString()), uri)) {
            log(String.format("Allow access to %s", uri), request);
            return true;
        }
        // 无权限
        response.setContentType("text/html;charset=utf-8");
        //response.getWriter().write(JSONObject.toJSON(ResultEntity.getResult(-1, "")).toString());
        log(String.format("No Access to %s", uri), request);
        return false;
    }

    /**
     * 打印日志
     *
     * @param msg     消息
     * @param request HttpServletRequest
     */
    private void log(String msg, HttpServletRequest request) {
        NDC.push(String.format("host=%s", IpUtils.getIpAddress(request)));
        LOGGER.info(msg);
        NDC.pop();
    }

}
