<%-- 
    Document   : add
    Created on : May 2, 2013, 4:49:25 PM
    Author     : Ronalds
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Management</title>
    </head>
    <body>
        <h1>Add Category</h1>
        <f:form action="persist.php" method="POST" modelAttribute="categoryModel">
            <label> Category Name: </label> <br/>
            <f:input path="categoryName" /> <br/>
            <input type="submit" value="Add category"/>
            <input type="reset" value="Reset"/>
        </f:form>
    </body>
</html>
