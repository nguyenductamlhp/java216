

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Round
 */
@WebServlet("/Round")
public class Round extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Round() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String txtOx = request.getParameter("txtOx");
		String txtOy = request.getParameter("txtOy");
		String txtR = request.getParameter("txtR");
		double Ox, Oy, R;
		try {
			Ox = Double.parseDouble(txtOx);
			Oy = Double.parseDouble(txtOy);
			R = Double.parseDouble(txtR);
			double C = R * 2 * 3.14;
			double S = R * R * 3.14;
			String result = "Chu vi: " + Double.toString(Math.round(C)) + " va dien tich : " + Double.toString(Math.round(S));
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
