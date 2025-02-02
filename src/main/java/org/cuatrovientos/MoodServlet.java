package org.cuatrovientos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class MoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MoodServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
		 
		 PrintWriter out = response.getWriter();
		 
		 out.println("<html>");
	         out.println("<head>");
	         	out.println("<title>Servlet MoodServlet "+request.getContextPath()+"</title>");
	         out.println("</head>");
         out.println("<body>");
         
         out.println("<h1>Servlet MoodServlet at "+ request.getContextPath() + "</h1>");
         
         String mood = (String) request.getParameter("mood");
         
         switch (mood) {
	         case "sleepy":
	             out.println("<img src=\"resources/images/duke.snooze.gif\" alt=\"Duke sleeping\"/><br/>");
	             break;
	         case "alert":
	             out.println("<img src=\"resources/images/duke.waving.gif\" alt=\"Duke waving\"/><br/>");
	             break;
	         case "hungry":
	             out.println("<img src=\"resources/images/duke.cookies.gif\" alt=\"Duke with cookies\"/><br/>");
	             break;
	         case "lethargic":
	             out.println("<img src=\"resources/images/duke.handsOnHips.gif\" alt=\"Duke with hands on hips\"/><br/>");
	             break;
	         case "thoughtful":
	             out.println("<img src=\"resources/images/duke.pensive.gif\" alt=\"Duke thinking\"/><br/>");
	             break;
	         default:
	             out.println("<img src=\"resources/images/duke.thumbsup.gif\" alt=\"Duke with thumbs-up gesture\"/><br/>");
	             break;
	     }

         
         out.println("</body>");
         out.println("</html>");	
	}

}
