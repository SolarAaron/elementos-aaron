<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola k ase</title>
    </head>
    <body>
        <h1>Bienvenido al evento canino</h1>
        <form action="util.php" method="post">
            <input type="submit" value="registrar" />
            <input type="hidden" name="servlet" value="slr.mvn.tsk02.cnt.RegistroSvr" />
        </form>
    </body>
</html>
