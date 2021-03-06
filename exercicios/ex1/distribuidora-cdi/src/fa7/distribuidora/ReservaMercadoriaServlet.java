package fa7.distribuidora;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReservaMercadoriaServlet
 */
@WebServlet("/ReservaMercadoriaServlet")
public class ReservaMercadoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject private ControladorEstoque controle;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservaMercadoriaServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String merc = request.getParameter("mercadoria");
		response.getWriter().append("<html><body><h1>CDI ATIVADO</h1><br><h2>").append(controle.avaliarPedido(merc)).append("</h2></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
