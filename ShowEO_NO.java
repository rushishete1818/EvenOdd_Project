

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowEO_NO")
public class ShowEO_NO extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<div align='center'><h1>Welcome to Display Page </h1>");
		out.print("<br></br>");
		
		try {
			int n=Integer.parseInt(request.getParameter("eono"));
			if(n%2==0) {
				out.println("<font color=green>"+n+"<h3> is even num </h3><font/>");
			}else {
				out.println("<font color=red>"+n+"<h3> is odd num </h3></font>");
			}
		}catch(Exception e){
			out.println("Error:"+e.getMessage());
			
		}
		out.print("</div>");
		
	}

}
