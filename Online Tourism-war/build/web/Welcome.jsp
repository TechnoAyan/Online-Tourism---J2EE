<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <center>
        <body>
<jsp:include page="UHeader.html"/>        
        <%
        String uid=(String) session.getAttribute("uid");
        if(uid!=null)
                       {
            %>
            <h1>Welcome: <%=uid%></h1>
            <%
        }
        else
                       {
            response.sendRedirect("Login.jsp");
        }
        %>
        <jsp:include page="Footer.html"/>
        </center>
    </body>
</html>
