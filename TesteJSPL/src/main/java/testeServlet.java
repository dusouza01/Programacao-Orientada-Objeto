

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class testeServlet
 */
@WebServlet("/testeServlet")
public class testeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Aluno> lista = new ArrayList<>();
		lista.add(new Aluno(1, "Selmini"));
		lista.add(new Aluno(2, "Dudu"));
		lista.add(new Aluno(3, "Osvaldo"));
		
		request.setAttribute("lista", lista);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("listagem.jsp");
		
		dispatcher.forward(request, response);
		
		
		
		
	}

}
