package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PetServlet
 */
@WebServlet("/PetServlet")
public class PetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetServlet() {
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
        String fName=request.getParameter("Fname");
        System.out.println("First Name: "+fName);
        String lName=request.getParameter("Lname");
        System.out.println("Last Name: "+lName);
        String address=request.getParameter("address");
        System.out.println("Address: "+address);
        String emaiID=request.getParameter("Email");
        System.out.println("Emai ID: "+emaiID);
        String city=request.getParameter("city");
        System.out.println("City: "+city);
        String state=request.getParameter("state");
        System.out.println("State: "+state);
        String petName=request.getParameter("Pname");
        System.out.println("Pet Name: "+petName);
        long phone=Long.parseLong(request.getParameter("phn"));
        System.out.println("Phone number: "+phone);
        String petType=request.getParameter("Ptype");
        System.out.println("Pet Type: "+petType);
        int petAge=Integer.parseInt(request.getParameter("PAge"));
        System.out.println("Pet Age: "+petAge);
        Connection con=null;
        try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetRegister", "newuser","root");
                        PreparedStatement ps=con.prepareStatement("insert into Pets(fName,lName,address,emaiID,city,state,petName,phone,petType,petAge)values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, fName);
            ps.setString(2, lName);
            ps.setString(3, address);
            ps.setString(4, emaiID);
            ps.setString(5, city);
            ps.setString(6, state);
            ps.setString(7, petName);
            ps.setLong(8, phone);
            ps.setString(9, petType);
            ps.setInt(10, petAge);
            int i = ps.executeUpdate();
            if(i==1){
                        RequestDispatcher rd=request.getRequestDispatcher("/Successful.html");
                        rd.forward(request, response);
            }
        }
        catch(Exception e){
                        System.out.println(e);
        }
}
}

