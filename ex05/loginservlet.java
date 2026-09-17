import java.io.*;
import javarta.servlet.*;
import javarta.servlet.http.*;

public class LoginServlet extends Httpservlet {
    // Handle GET request - Display login page
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        printWriter out = response.getWriter();
        out.println("<h2>login page</h2>");
        out.println("<form method='post' action ='loginServlet'>");
        out.println("Username:<input type='text' name='username'><br><br>");
        out.println("password:<input type='password' name='password'><br><br>");
        out.println("input type='submit' value='login'>");
        out.println("</form>");
    }
    //handle POST request-authentication 
    public void doPost(HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");
        printWriter out = response.getWriter();
        string uname = request.getParameter("username");
        string pwd=request.getParameter("password");
        if("admin".equals(uname) && "12345".equals(pwd)){
            out.println("<h3>login successfull Welcome, "+uname+"</h3>");
        }else{
            out.println("<h3>Login Failed! Invalid username or password.</h3>");
            out.println("<a href='login.html'>Try Again</a>");
        }
    }
}