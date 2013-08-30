<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../header/login_header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<body>
    <div class="form">
        <form method="POST" action='j_spring_security_check'>
            <table>
                <thead>
                    <tr>
                        <td colspan="2">
                            <label>Live Product Feed Login</label>
                        </td>
                    </tr>
                </thead>

                <tr>
                    <td colspan="2">
                        <c:if test="${not empty error}">
                            <div class="errorblock">
                                Your login attempt was not successful, try again.<br /> Caused by:
                                ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                            </div>
                        </c:if>
                    </td>
                </tr>

                <tr>
                    <td>
                        <label for='j_username'>Username: </label>
                    </td>
                    <td>
                        <input id="j_username" name='j_username' type="text" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <label for='j_password'>Password: </label>
                    </td>
                    <td>
                        <input id="j_password" name='j_password' type="password" />
                    </td>
                </tr>

                <tr>
                    <td colspan="2" >
                        <input type="checkbox" type="_spring_security_remember_me" /> Remember me
                    </td>
                </tr>

                <tr>
                    <td colspan="2" >
                        <input type="submit" value="Login" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
<jsp:include page="../footer/footer.jsp" />
