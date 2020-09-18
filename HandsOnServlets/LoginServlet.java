package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
 @WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        String username=request.getParameter("lid");
        String password=request.getParameter("pass");
        Connection con=null;
        ResultSet rs = null;
        Statement stmt = null;
        try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetRegister", "newuser","root");
                        stmt=con.createStatement();
                        rs = stmt.executeQuery("Select * from Login");
            int f = 0;
            while(rs.next() && f==0) {
            	String uname=rs.getString("loginID");
            	String pass=rs.getString("pasword");
                if(uname.equals(username)&&pass.equals(password)) {
                	    f=1;
                        RequestDispatcher rd=request.getRequestDispatcher("/Success.html");
                        rd.forward(request, response);
                }
            }
            if(f==0) {
            	RequestDispatcher rd=request.getRequestDispatcher("/Error.html");
                rd.forward(request, response);
            }
        }
        catch(Exception e){
                        System.out.println(e);
        }
        
      }

}
