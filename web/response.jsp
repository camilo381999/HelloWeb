<%-- 
    Document   : response
    Created on : 17/03/2020, 08:04:41 PM
    Author     : Camilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        <jsp:setProperty name="mybean" property="born" />
        <jsp:setProperty name="mybean" property="year" />
        <jsp:setProperty name="mybean" property="period" />
        <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1>
        Edad: <jsp:getProperty name="mybean" property="age" /><br>
        Semestre: <jsp:getProperty name="mybean" property="level" />
    </body>
</html>
