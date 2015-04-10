<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="image1.jpg">
     <jsp:include page="Header.html"/>
     <center>
         <table border="3">
             <tr>
                 <td>User Id</td>
                 <td>Message</td>
                 <td>Date</td>
                 <td>Time</td>
              </tr>
              <%
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:abc");
            Statement smt=con.createStatement();
        ResultSet rs=smt.executeQuery("select * from Feedback");
        while(rs.next())
                       {
            String UID=rs.getString(1);
            String MSG=rs.getString(2);
            String DATE=rs.getString(3);
            String TIME=rs.getString(4);
        %>
        <tr>
            <td><%=UID%></td>
             <td><%=MSG%></td>
              <td><%=DATE%></td>
               <td><%=TIME%></td>
                </tr>
        <%
               }
        con.close();
            %>
     <jsp:include page="Footer.html"/>
    </body>
</html>