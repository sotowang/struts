<%@ taglib prefix="s" uri="/struts-tags" %>

<html>

<body>

<%--<s:form action="addProduct">--%>

    <%--<s:textfield name="product.name" label="product name" />--%>
    <%--<s:submit value="Submit" />--%>

<%--</s:form>--%>

<form action="addProduct">
    <input type="text" name="product.name" value="${param.name}">
    <br/>
    <input type="submit" value="submit">
</form>

</body>
</html>