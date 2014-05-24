<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="slr.mvn.tsk01.MirrorCoat" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Test</title>
    </head>
    <body>
        <form action="index.jsp">
            <input type="submit" value="Cuenta"> </button><%= MirrorCoat.getCounter() %>
        </form>
    </body>
</html>
