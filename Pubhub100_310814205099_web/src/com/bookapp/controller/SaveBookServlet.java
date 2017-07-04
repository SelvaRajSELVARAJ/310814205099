package com.bookapp.controller;

public class SaveBookServlet {
	/**
	 * Servlet implementation class SaveBookServlet
	 */
	@WebServlet("/SaveBookServlet")
	public class SaveBookServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public SaveBookServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
		{
			
		}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
			String name=request.getParameter("name");
			String price=request.getParameter("price");
			Book book=new Book();
			book.setName(name);
			book.setPrice(Float.parseFloat(price));
			BookDAO dao=new BookDAO();
			dao.add(book);
			PrintWriter pw=response.getWriter();
			//pw.println("<a href='home.jsp'>Save Successful, now go back to home</a>");
			response.sendRedirect("Save_book.jsp");
			
			
			
			//response.sendRedirect("Save_book.jsp");
		}
		

}
