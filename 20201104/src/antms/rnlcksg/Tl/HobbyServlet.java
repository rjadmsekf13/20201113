package antms.rnlcksg.Tl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HobbyServlet
 */
@WebServlet("/HobbyServlet")
public class HobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HobbyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String pname = request.getParameter("name");
		String[] phobby = request.getParameterValues("hobby");
		
		System.out.println("pname = " + pname);
		out.println("<html>");
		out.println("<head>");
		out.println("<style> table{border:1px solid black;} </style>");
		out.println("</head>");
		out.println("<body>");
		out.println("이름은 "+pname+" 입니다.");
		out.println("<hr>");
		if (phobby == null) {
			System.out.println("선택 취미 없음");
			out.println("<table>");
		} else {
			out.println("선택 취미<br>");
			for (int i = 0; i < phobby.length; i++) {
				System.out.println("phobby = " + phobby[i]);
				out.println("<tr>");
				out.println("<td>");
				out.println(phobby[i]+"<br>");
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("<table>");
		}
		out.println("<hr>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("get방식 요청");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("post방식 요청");
	}

}
