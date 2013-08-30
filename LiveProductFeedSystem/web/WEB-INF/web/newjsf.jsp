<%-- 
    Document   : newjsf
    Created on : Jun 8, 2013, 11:47:13 PM
    Author     : Ronalds
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:p="http://primefaces.org/ui">
        <head>
            <title>Live Product Feed</title>
        </head>
        <body>
            <h:form>
                <h:outputText value="Welcome to the Live Product Feed CRUD operations."/>
                <br/>
                <h:outputText value="Welcome to the Live Product Feed CRUD operations."/>
                <br/>
                <p:commandLink value="Product" action="home/product/productCRUD.xhtml"/>
                <br/>
                <p:commandLink value="Customer" action="home/customer/productCRUD.xhtml"/>
                <br/>
                <p:commandLink value="Stock Manager" action="home/storeManager/storeManagerCRUD.xhtml"/>
            </h:form>
        </body>
    </html>
</f:view>
