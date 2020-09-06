package br.edu.insper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exemplo
 */
@WebServlet("/Exemplo")
public class Exemplo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exemplo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String curso = request.getParameter("curso");
		
		PrintWriter out = response.getWriter();
		
		// Recurso de confirmação dos dados
		if(nome.isEmpty() || email.isEmpty() || curso.isEmpty()) {
			out.println("<html>");
			out.println("<body>");
			out.print("<h4>você não preencheu todos os seus dados!</h4>");			
			out.println("</body>");
			out.println("</html>");
		} else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>Sucesso! Você está inscrito. Confirmando os seus dados</h3>");
			out.println("<h4>O seu nome é " + nome + "</h4>" );
			out.println("<h4>O seu e-mail é " + email + "</h4>");
			out.println("<h4>O seu curso é " + curso + "</h4>");
			out.println("</body>");
			out.println("</html>");
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
