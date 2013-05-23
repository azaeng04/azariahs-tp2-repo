<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="../header/header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<body>
    <h1>Create Customer</h1>
    <div>
        <a href="index.html" >Go Home</a>
        <a href="customer.html" >Go back</a><br/><br/>
    </div>
    <f:form action="persistCustomer" method="POST" modelAttribute="customerDetailsModel">
        <table>
            <thead>Customer Details</thead>
            <tr>
                <td>
                    <label>Customer Number</label>
                </td>
                <td>
                    <f:input path="customerNumber" type="text"/>
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
        </table>

        <table>
            <thead>User Details</thead>
            <tr>
                <td>
                    <label></label>
                </td>
                <td>
                    <f:input path="username" type="text"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label></label>
                </td>
                <td>
                    <f:password path="password" showPassword="false"/>
                </td>
            </tr>
        </table>

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
        </table>

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
        </table>
    </f:form>
</body>
<jsp:include page="../footer/footer.jsp" />