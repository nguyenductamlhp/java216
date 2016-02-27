

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumServlet
 */
@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String txtAx = request.getParameter("txtAx");
		String txtAy = request.getParameter("txtAy");
		String txtBx = request.getParameter("txtBx");
		String txtBy = request.getParameter("txtBy");
		
		double Ax, Ay, Bx, By;
		try {
			Ax = Double.parseDouble(txtAx);
			Ay = Double.parseDouble(txtAy);
			Bx = Double.parseDouble(txtBx);
			By = Double.parseDouble(txtBy);
			
			double dis = Math.sqrt((Ax - Bx)*(Ax - Bx) - (Ay - By)*(Ay - By));
			String result = "Khoang cach giua A va B: " + Double.toString(Math.round(dis));
			response.getWriter().write(result);
			
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			response.getWriter().write("Error!");
			e.printStackTrace();
		}
		
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
