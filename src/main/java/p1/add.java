package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public add() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x=Integer.parseInt(request.getParameter("1num"));
		int y=Integer.parseInt(request.getParameter("2num"));
		A a1=new A();
		int z=a1.add(x, y);
		System.out.println(z);
		request.setAttribute("d", z);
		RequestDispatcher re = request.getRequestDispatcher("add.jsp");
		re.forward(request, response);
	}

}
