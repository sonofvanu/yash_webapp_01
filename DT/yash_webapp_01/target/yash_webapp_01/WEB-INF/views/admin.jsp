<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />
<jsp:include page="header.jsp" > <jsp:param name="" value=""/> </jsp:include>

<form:form method="GET" action="/all" modelAttribute="sub">

<table class="table">

<tr>
<td><label path="name">Brand</label></td><td><input path="brand" /><form:errors path="name" cssclass="error"/>
</td>
</tr>
<tr>
<td><label path="name">Model</label></td><td><input path="model" /><form:errors path="model" cssclass="error"/>
</td>
</tr>
<tr>
<td><label path="name">Os</label></td><td><input path="os" /><form:errors path="os" cssclass="error"/>
</td>
</tr>
<tr>
<td><label path="name">Version</label></td><td><input path="version" /><form:errors path="version" cssclass="error"/>
</td>
</tr>
<tr>
<td><label path="name">Price</label></td><td><input path="price" /><form:errors path="price" cssclass="error"/>
</td>
</tr>
<tr>
<td><input type="submit" value="Submit" /></td>
<td><input type="reset" value="Reset" /></td>
</tr>
</table>
</form:form>


<c:forEach items="${products}" var="product">

<table class="table">
<tr>
</tr>
<tr>
<td>${products.id}</td>
<td>${products.brand}</td>
<td>${products.model}</td>
 <td>${products.os}</td>  
<td>${products.version}</td>
<td>${products.price}</td>
<td><a href="${cp}/admin/edit/${products.id}">Edit</a></td>
<td><a href="${cp}/admin/delete/${products.id}">delete</a></td>
</tr>
</table>

</c:forEach>

<jsp:include page="footer.jsp">
	<jsp:param name="" value="" />
</jsp:include>

