package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.Student;
@WebServlet("/save")
public class SaveStudentController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int age=Integer.parseInt(req.getParameter("age"));
		String dob=req.getParameter("dateofbirth");
		
		Student student=new Student();
		student.setName(name);
		student.setEmail(email);
		student.setAge(age);
		student.setDob(dob);
		
	
		StudentDao dao = new StudentDao();
		Student dbStudent = dao.saveStudent(student);
		if (dbStudent != null) {
			req.setAttribute("message", "Successfully Signed Up Pleaese proceed for login");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}
	}


}
