package br.com.pascoa.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RequestFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// do nothing.
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		try {
			MDC.put("requestId", getCorrelationId());
			log.info("Request IP address is {}", servletRequest.getRemoteAddr());
			log.info("Request content type is {}", servletRequest.getContentType());
			filterChain.doFilter(servletRequest, servletResponse);
		} finally {
			MDC.remove("requestId");
		}

	}

	private String getCorrelationId() {
		return UUID.randomUUID().toString();
	}

	@Override
	public void destroy() {
		// do nothing.
	}

}
