package servlet;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="helloServlet", urlPatterns={"/servlet/helloServlet"})
public class helloServlet extends HttpServlet 
{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException 
  {
    ServletOutputStream out = resp.getOutputStream();
    out.write("<h2 align=\"center\">helloServlet!</h2>".getBytes());
    out.flush(); out.close();
  }  
}