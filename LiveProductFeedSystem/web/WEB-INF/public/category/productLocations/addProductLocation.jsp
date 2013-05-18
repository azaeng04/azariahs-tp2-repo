<jsp:include page="../../header/header.jsp" />
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>
    <h1>Add Location for this Products</h1>
    <f:form action="persistThisCategory.php" method="POST" modelAttribute="productLocationModel">
        <table>
            <tr>
                <td>
                    <label> Product Location Number: </label>
                </td>
                <td>
                    <f:input id="txtProductLocationNumber" path="productLocationNumber" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label> Product Location Name: </label>
                </td>
                <td>
                    <f:input id="txtProductLocationName" path="productLocationName" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label> Quantity: </label>
                </td>
                <td>
                    <f:input id="txtProductLocationQuantity" path="quantity" type="number"/>
                </td>
            </tr>

            <tr>
                <td>
                    <input type="submit" value="Add Category"/>
                </td>
                <td>
                    <input type="reset" value="Reset"/>
                </td>
            </tr>
        </table>
    </f:form>
</body>
<jsp:include page="../../footer/footer.jsp" />