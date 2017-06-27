package com.bizideal.mn.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * @author liulq:
 * @data 2017年4月27日 下午11:20:19
 * @version 1.0
 * @Description:TODO
 */
public class MyAccessDeniedHandlerImpl implements AccessDeniedHandler {

	public MyAccessDeniedHandlerImpl() {

	}

	public String getAccessDeniedUrl() {
		return accessDeniedUrl;
	}

	public void setAccessDeniedUrl(String accessDeniedUrl) {
		this.accessDeniedUrl = accessDeniedUrl; 
	}

	public MyAccessDeniedHandlerImpl(String accessDeniedUrl) {
		this.accessDeniedUrl = accessDeniedUrl;
	}

	private String accessDeniedUrl;

	@Override
	public void handle(HttpServletRequest req, HttpServletResponse resp, AccessDeniedException reason) throws ServletException, IOException {
		boolean isAjax = "XMLHttpRequest".equals(req.getHeader("X-Requested-With"));

		// 如果是ajax请求（跨域之后无法判断是否是ajax请求）
		if (isAjax) {

			resp.setCharacterEncoding("utf-8");
			resp.setContentType("application/json");
			Map<String, String> map = new HashMap<String, String>();
			map.put("status", "0");
			map.put("msg", "access denied");
			PrintWriter out = resp.getWriter();
			out.print(map.toString());
			out.flush();
			out.close();
			return;
		} else {
			String path = req.getContextPath();
			String basePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + path + "/";
			resp.sendRedirect(basePath + accessDeniedUrl);
		}

	}
}
