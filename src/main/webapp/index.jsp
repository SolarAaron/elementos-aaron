<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola k ase</title>
    </head>
    <body>
        Do want some of that.
        <form action="util.php" method="post">
            <input type="submit" value="crear" />
            <input type="hidden" name="servlet" value="slr.mvn.tsk01.cnt.CuentaSvr" />
        </form>
    </body>
</html>
