<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>layout</title>

<link href="${ctx}/content/partner/css/<tiles:getAsString name="css"/>" 
type="text/css" rel="stylesheet" />	

</head>

<body>
	<header id="header">
	<div class="content-container">
		<!-- header 부분 -->
		<tiles:insertAttribute name="header" />
	</div>
	</header>


	<div id="body">
		<div class="content-container clearfix">
			<!-- notice 컨텐츠 들어가는 부분 -->
			<tiles:insertAttribute name="content" />
		</div>
	</div>


	<footer id="footer">
	<div class="content-container">
	<!-- footer 들어가는 부분 -->
	<tiles:insertAttribute name="footer"/>
	</div>
	</footer>

</body>
</html>