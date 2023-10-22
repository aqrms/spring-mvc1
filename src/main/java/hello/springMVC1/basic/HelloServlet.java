package hello.springMVC1.basic;

import java.io.IOException;

import org.springframework.boot.web.servlet.ServletComponentScan;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.service(req, resp);
		System.out.println("HelloServlet.service");
		System.out.println("req = " + req);
		System.out.println("resp = " + resp);

		String username = req.getParameter("username");
		System.out.println("username = " + username);

		resp.setContentType("text/plain");
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().write("hello "+username);

	}
}
