<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="../header/header.jsp" />
<body>
    <f:form action="update_category_id=${categoryModel.id}" method="POST" modelAttribute="categoryModel">
        <table>
            <thead>
                <tr>
                    <th>Enter New Category Number</th>
                    <th>Enter New Category Name </th>
                    <th>Update </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <f:input path="categoryNumber" />
                    </td>
                    <td>
                        <f:input path="categoryName" />
                    </td>
                    <td>
                        <input type="submit" value="Update Category"/>
                    </td>
                </tr>
            </tbody>
        </table>
    </f:form>
</body>
<jsp:include page="../footer/footer.jsp" />