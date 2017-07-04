package com.bookapp.controller;

public class ViewAllServlet {
	/**
	 * Servlet implementation class ViewAllServlet
	 */
	@WebServlet("/ViewAllServlet")
	public class ViewAllServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public ViewAllServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			BookDAO dao=new BookDAO();
			List<Book> books=dao.ViewAll();
			if (books.size()>0){
				RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");
				request.setAttribute("books", books);
				rd.forward(request, response);
			}else
			{
				response.sendRedirect("failure.jsp");
			
		}}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}


}
