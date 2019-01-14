package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/article.do")
public class ArticleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;

		String page = request.getParameter("page");
		if (page == null) {
			page = "main";
		}

		String dir = request.getParameter("dir");
		if (dir == null) {
			dir = request.getServletPath();
			int b = dir.indexOf(".");
			String a = dir.substring(1, b);
			dir = a;

			switch (cmd) {
			case "move":
				System.out.println("액션이 이동");
				Command.move(request, response ,dir ,page);
				break;
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
