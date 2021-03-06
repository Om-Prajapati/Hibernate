package com.bridgeit.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@WebServlet("/LogoutAccount")
public class LogoutAccount extends HttpServlet {

	private static final long serialVersionUID = 1L;
	final static Logger logger = LoggerFactory.getLogger(LogoutAccount.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		req.getRequestDispatcher("login.jsp").include(req, resp);
		HttpSession session = req.getSession();
		session.invalidate();
		out.close();
		logger.info("User logout");
	}

	/**
	 * The serialVersionUID is a universal version identifier for a Serializable
	 * class. Deserialization uses this number to ensure that a loaded class
	 * corresponds exactly to a serialized object. If no match is found, then an
	 * InvalidClassException is thrown.
	 * 
	 */
}
