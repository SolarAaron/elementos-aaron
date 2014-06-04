<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="slr.mvn.lib.Utility" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola k ase</title>
    </head>
    <body>
        <h1>Bienvenido al evento de mascotas</h1>
        <form action="util.php" method="post">
            Especie: <select name="animal">
                <c:forEach var="i" items="${Utility.getClasses("slr.mvn.tsk02.mdl.impl")}">
                    <option value="<c:out value="${i}" />"><c:out value="${i}" /></option>
                </c:forEach>
            </select><br>
            Nombre: <input type="text" name="nombre"/><br>
            <input type="submit" value="Registrar mascota" />
            <input type="hidden" name="servlet" value="slr.mvn.tsk02.cnt.RegistroSvr" />
        </form>
    </body>
</html>
