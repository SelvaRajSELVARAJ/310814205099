package com.bookapp.controller;

public class EditServlet {
	/**
	 * Servlet implementation class EditServlet
	 */
	@WebServlet("/EditServlet")
	public class EditServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public EditServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
			String name=request.getParameter("name");
		String price=request.getParameter("price")	;
		Book book=new Book();
		book.setName(name);
		book.setPrice(Float.parseFloat(price));
		BookDAO dao=new BookDAO();
		dao.UpdatePrice(book);
		response.sendRedirect("ModifyByPrice.jsp");
		
		
		
		
		}

}
