<jsp:include page="../../header/header.jsp" />
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>
    <h1>Add Product</h1>

<f:form action="persistProduct.php" method="POST" modelAttribute="productModel">
    <table>
        <tr>
            <td>
                <label> Product Number: </label>
            </td>
            <td>
                <f:input id="txtProductNumber" path="productNumber" type="text"/>
            </td>
        </tr>

        <tr>
            <td>
                <label> Product Name: </label>
            </td>
            <td>
                <f:input id="txtProductName" path="productName" type="text"/>
            </td>
        </tr>

        <tr>
            <td>
                <label> Product Price: </label>
            </td>
            <td>
                <f:input id="txtProductPrice" path="productPrice" type="text"/>
            </td>
        </tr>

        <tr>
            <td>
                <label> Product Best Before Date </label>
            </td>
            <td>
                <f:input id="txtProductBestBeforeDate" path="productBestBeforeDate" type="date"/>
            </td>
        </tr>

        <tr>
            <td>
                <label> Product Expiration Date </label>
            </td>
            <td>
                <f:input id="txtProductExpirationDate" path="productExpirationDate" type="date"/>
            </td>
        </tr>

        <tr>
            <td>
                <label> Product Status </label>
            </td>
            <td>
                <f:input id="txtProductStatus" path="productStatus" type="textarea"/>
            </td>
        </tr>
        
        <tr>
            <td>
                <label> Product Delivery Date </label>
            </td>
            <td>
                <f:input id="txtProductExpirationDate" path="productDeliveryDate" type="date"/>
            </td>
        </tr>
        
        <tr>
            <td>
                <label> Quantity: </label>
            </td>
            <td>
                <f:input id="txtProductQuantity" path="productQuantity" type="number"/>
            </td>
        </tr>

        <tr>
            <td>
                <input type="submit" value="Add Product Location"/>
            </td>
            <td>
                <input type="reset" value="Reset"/>
            </td>
        </tr>
    </table>
</f:form>
</body>
<jsp:include page="../../footer/footer.jsp" />
