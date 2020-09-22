package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
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
        int empId = Integer.parseInt(request.getParameter("EmpId"));
        String name=request.getParameter("Name");
        int age=Integer.parseInt(request.getParameter("Age"));
        String gender=request.getParameter("Gender");
        String deptName=request.getParameter("Deptname");
        int basic=Integer.parseInt(request.getParameter("Basic"));
        String grade=request.getParameter("Grade");
        Connection con=null;
        try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetRegister", "newuser","root");
                        PreparedStatement ps=con.prepareStatement("insert into Employee(EmpId,Name,Age,Gender,Deptname,Basic,Grade)values(?,?,?,?,?,?,?)");
            ps.setInt(1, empId);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, gender);
            ps.setString(5, deptName);
            ps.setInt(6, basic);
            ps.setString(7, grade);
            int i = ps.executeUpdate();
            if(i==1){
                        Statement st=con.createStatement();
                        ResultSet rs=st.executeQuery("select * from Employee");
                        List<Employee1> l=new ArrayList<>();
                        while(rs.next()){
                                        Employee1 e1=new Employee1();
                                        e1.setEmpId(rs.getInt(1));
                                        e1.setName(rs.getString(2));
                                        e1.setAge(rs.getInt(3));
                                        e1.setGender(rs.getString(4));
                                        e1.setDeptName(rs.getString(5));
                                        e1.setBasic(rs.getInt(6));
                                        e1.setGrade(rs.getString(7));
                                        l.add(e1);
                        }
                        if(l!=null){
                                        request.setAttribute("Empdetail", l);
                                        RequestDispatcher rd=request.getRequestDispatcher("Edetails.jsp");
                                        rd.forward(request, response); 
                        }
                        
            }
        }
        catch(Exception e){
                        System.out.println(e);
        }
	}

}
