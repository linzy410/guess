/* 
 * Created by linzheyan at 2012-1-5 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hisupplier.guess.entity.User;
import com.hisupplier.guess.util.SessionUtil;

/**
 * @author linzheyan
 *
 * 2012-1-5
 */
public class LoginFilter implements Filter {

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {

	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String uri = request.getRequestURI();
		if (uri.equals("/") || uri.equals("/login.action") || uri.equals("/user/user_list.action")) {
			chain.doFilter(req, res);
			return;
		}
		User user = SessionUtil.getSessionUser(request);
		if (user == null) {
			response.sendRedirect("/");
			return;
		}

		chain.doFilter(req, res);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig arg0) throws ServletException {

	}
}
