<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="../header/header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<body>
    <h1>Create User</h1>
    <div>
        <a href="index.html" >Go Home</a>
        <a href="customer.html" >Go back</a><br/><br/>
    </div>
    <f:form action="persistPerson" method="POST" modelAttribute="personModel">
        <table>
            <thead>User Details</thead>
            <tr>
                <td>
                    <label>Select Person to add:</label>
                </td>
                <td>
                    <f:select path="typeOfUser">
                        <f:option value="customer">Customer</f:option>
                        <f:option value="stockManager">Stock Manager</f:option>
                        <f:option value="storeManager">Store Manager</f:option>
                    </f:select>
                </td>
            </tr>
            <tr>
                <td>
                    <label>User Number</label>
                </td>
                <td>
                    <f:input path="userNumber" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>First Name</label>
                </td>
                <td>
                    <f:input path="firstName" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Middle Name</label>
                </td>
                <td>
                    <f:input path="middleName" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Last Name</label>
                </td>
                <td>
                    <f:input path="lastName" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Date of Birth</label>
                </td>
                <td>
                    <f:input path="dateOfBirth" type="date"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Gender</label>
                </td>
                <td>                    
                    <f:input path="gender" type="text"/>
                </td>
            </tr>
        </table> <br/><br/>

        <table>
            <thead>User Details</thead>
            <tr>
                <td>
                    <label>Username: </label>
                </td>
                <td>
                    <f:input path="username" type="text"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Password: </label>
                </td>
                <td>
                    <f:password path="password" showPassword="false"/>
                </td>
            </tr>
        </table> <br/><br/>

        <table>
            <thead>Contact Details</thead>
            <tr>
                <td>
                    <label>E-mail address</label>
                </td>
                <td>
                    <f:input path="emailAddress" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Cell phone number</label>
                </td>
                <td>
                    <f:input path="cellPhoneNumber" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Home Number</label>
                </td>
                <td>
                    <f:input path="homeNumber" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Office Number</label>
                </td>
                <td>
                    <f:input path="officeNumber" type="text"/>
                </td>
            </tr>
        </table> <br/><br/>

        <table>
            <thead>Address Details</thead>
            <tr>
                <td>
                    <label>Postal Address</label>
                </td>
                <td>
                    <f:input path="postalAddress" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Physical Address</label>
                </td>
                <td>
                    <f:input path="physicalAddress" type="text"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Postal Code</label>
                </td>
                <td>
                    <f:input path="postalCode" type="text"/>
                </td>
            </tr>
        </table> <br/><br/>

        <table>
            <tr>
                <td>
                    <input type="submit" value="Add Customer"/>
                </td>
                <td>
                    <input type="reset" value="Clear all fields"/>
                </td>
            </tr>
        </table>
    </f:form>
</body>
<jsp:include page="../footer/footer.jsp" />