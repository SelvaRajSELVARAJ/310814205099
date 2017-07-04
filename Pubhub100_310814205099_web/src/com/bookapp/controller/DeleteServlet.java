package com.bookapp.controller;

public class DeleteServlet {
	/**
	 * Servlet implementation class DeleteServlet
	 */
	@WebServlet("/DeleteServlet")
	public class DeleteServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
		  public DeleteServlet() {
		        super();
	        // TODO Auto-generated constructor stub
	    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
			String name=request.getParameter("name");
			Book book=new Book();
			book.setName(name);
		
			
			BookDAO dao=new BookDAO();
			dao.Delete(book);
			response.sendRedirect("delete.jsp");
			
			
			
		}


	}}
