<%@page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<main class="main">
<h2>Partner List</h2>
	<table class="mtable">
		<tr>
			<th>MID</th>
			<th>EMAIL</th>
			<th>원어</th>
			<th>배우는언어</th>
			<!-- <th>가입일</th> -->
		</tr>
		<c:forEach var="p" items="${list}">
			<tr>
				<td><a href="../mypage/mypage?id=${p.mypartners_mid}">${p.mypartners_mid}</a></td>
				<td>${p.email}</td>
				<td>${p.native_language}</td>
				<td>${p.learning_language}</td>
				<%-- <td><fmt:formatDate pattern="yyyy-MM-dd" value="${p.regdate}" /></td> --%>
			</tr>
		</c:forEach>
	</table>

</main>