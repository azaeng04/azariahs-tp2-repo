<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header/header.jsp" />
<body>
    <h1>Stock Manager CRUD services</h1>
    <a href="index.html" >Go Home</a><br/><br/>
    <a href="addCustomer.html" >Add Customer</a><br/>
    <a href="addStockManager.html" >Add Stock Manager</a><br/>
    <a href="addStoreManager.html" >Add Store Manager</a><br/><br/>
    
    <label style="font-size: x-large">All Store Manager details</label><br/>
    <table>
        <thead>
            <tr>
                <th>User Number</th>
                <th>First Name </th>
                <th>Middle Name </th>
                <th>Last Name </th>
                <th>Date of Birth </th>
                <th>Gender </th>
                <th>View address details </th>
                <th>View contact details </th>
                <th>View Store Manager credentials  </th>
                <th>Update Store Manager</th>
                <th>Delete Store Manager</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="person" items="${persons}">
                <tr>
                    <td>
                        ${person.userNumber}
                    </td>
                    <td>
                        ${person.firstName}
                    </td>
                    <td>
                        ${person.middleName}
                    </td>
                    <td>
                        ${person.lastName}
                    </td>
                    <td>
                        ${person.dateOfBirth}
                    </td>
                    <td>
                        ${person.gender}
                    </td>
                    <td>
                        <a href="person_address_details=${person.id}">View address details</a>
                    </td>
                    <td>
                        <a href="person_contact_details=${person.id}">View contact details</a>
                    </td>
                    <td>
                        <a href="person_user_credentials=${person.id}">View Store Manager credentials</a>
                    </td>
                    <td>
                        <a href="edit_person_id=${person.id}">Edit Store Manager</a>
                    </td>
                    <td>
                        <a href="delete_person_id=${person.id}">Delete Store Manager</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
<jsp:include page="../footer/footer.jsp" />