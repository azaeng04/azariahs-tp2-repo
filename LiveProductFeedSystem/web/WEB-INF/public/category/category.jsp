<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header/header.jsp" />
<body>
    <h1>Category CRUD services</h1>
    <a href="index.html" >Go Home</a><br/><br/>
    <a href="addCategory.html" >Add Category</a><br/><br/>
    <table>
        <thead>
            <tr>
                <th>Category Number ${categoryModel.id}</th>
                <th>Category Name </th>
                <th>Update </th>
                <th>Delete</th>
                <th>View Products</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="category" items="${categories}">
                <tr>
                    <td>
                        ${category.categoryNumber}
                    </td>
                    <td>
                        ${category.categoryName}
                    </td>
                    <td>
                        <a href="edit_category_id=${category.id}">Edit</a>
                    </td>
                    <td>
                        <a href="delete_category_id=${category.id}">Delete</a>
                    </td>
                    <td>
                        <a href="products_category_id=${category.id}">View Products</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
<jsp:include page="../footer/footer.jsp" />