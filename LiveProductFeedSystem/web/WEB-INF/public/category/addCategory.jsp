<jsp:include page="../header/header.jsp" />
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>
    <h1>Add Product</h1>
    <div>
        <a href="index.html" >Go Home</a>
        <a href="category.html" >Go back</a><br/><br/>
    </div>
    <f:form action="persistCategory.php" method="POST" modelAttribute="categoryModel">
        <table>
            <tr>
                <td>
                    <label> Category Number: </label>
                </td>
                <td>
                    <f:input id="txtCategoryNumber" path="categoryNumber" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label> Category Name: </label>
                </td>
                <td>
                    <f:input id="txtCategoryName" maxlength="15"  path="categoryName" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <input type="submit" value="Add Products to Category"/>
                </td>
                <td>
                    <input type="reset" value="Clear all fields"/>
                </td>
            </tr>
        </table>
    </f:form>
</body>
<jsp:include page="../footer/footer.jsp" />

