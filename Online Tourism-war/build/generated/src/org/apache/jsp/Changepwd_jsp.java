package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Changepwd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>\n");
      out.write("            function fun()\n");
      out.write("            {\n");
      out.write("                var x=document.f.t2.value;\n");
      out.write("                var y=document.f.t3.value;\n");
      out.write("                if(x!=y)\n");
      out.write("                    {\n");
      out.write("                        alert(\"Password is mismatched\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    return true;\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"image2.jpg\">\n");
      out.write("        \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "UHeader.html", out, false);
      out.write("\n");
      out.write("        <form action=\"Changepwd\" method=\"post\" onsubmit=\"return fun();\" name=\"f\">\n");
      out.write("            <center>\n");
      out.write("            <table border=\"5\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Enter Old Password:</th><td><input type=\"password\" name=\"t1\">\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Enter New Password:</th><td><input type=\"password\" name=\"t2\">\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Confirm New Password:</th><td><input type=\"password\" name=\"t3\">\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr align=\"center\">\n");
      out.write("                        <td colspan=\"2\"><input type=\"Submit\" value=\"OK\">\n");
      out.write("                            \n");
      out.write("                    <input type=\"Reset\" value=\"RESET\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </center>\n");
      out.write("            </form>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.html", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
