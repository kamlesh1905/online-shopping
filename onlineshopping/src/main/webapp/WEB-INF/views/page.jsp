<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%--  <%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>   --%>

<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<script>
		window.menu = '${title}';

		window.contextRoot = '${contextRoot}'
</script>


<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Add custom CSS here  bootstrap-readable-theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Add custom CSS here  bootstrap-datTable -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="${css}/myapp.css" rel="stylesheet">


</head>

<body>

	<div class="wrapper">

		<!-- Navigation -->
		
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->

		<div class="content">
		
			<!-- Home -->
			<c:if test="${userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Load when user click about -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Load when user click about -->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- Load when user click All Products about -->
			<c:if test="${userClickAllProducts == true or userClickCategoryProducts==true}">
				<%@include file="listproduct.jsp"%>
			</c:if>
			
			
			<!-- Load when user click to view single product -->
			<c:if test="${userClickShowProduct == true }">
				<%@include file="singleProduct.jsp"%>
			</c:if>
			
				
			<!-- Load when user click to Manage products -->
			<c:if test="${userClickManageProducts == true }">
				<%@include file="manageProducts.jsp"%>
			</c:if>
			
		</div>

		<!-- Footer -->
		
		<%@include file="./shared/footer.jsp"%>
		

		<!-- container -->

		<!-- JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<!-- datatable Plugin -->
		<script src="${js}/jquery.dataTables.js"></script>
		
		<!-- datatable bootstrap script -->
		<script src="${js}/dataTables.bootstrap.js"></script>
		
		<!-- self added javscript file -->
		<script src="${js}/myapp.js"></script>

	</div>

</body>

</html>
