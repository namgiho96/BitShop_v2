package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command {
	public static void move(HttpServletRequest request, HttpServletResponse response, String dir, String page)
			throws ServletException, IOException {
		String dispatcher = "";

		dispatcher = (page.equals("index")) ? "index" + pool.Constant.JSP
				: pool.Constant.VIEW + dir + "/" + page + pool.Constant.JSP;
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}
}
