<%--
  User: mrdoggy
  Date: 20.03.13
  Time: 23:40
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header id="tasks"/>

    <c:forEach items="${errors}" var="err">
        <div class="error">${err}</div>
    </c:forEach>

Login page
    <form action="/login/" method="post">
    <table>
        <tr>
            <td>login:</td>
            <td><input type="text" name="login" value=""></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input type="password" name="password" value=""></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td><input type="submit" name="" value="login"></td>
        </tr>
    </table>
    </form>

<tags:footer/>