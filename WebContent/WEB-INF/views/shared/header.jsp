<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 id="logo">
	<a href="/WSQPrj">
		<p class="hidden">World Square</p> <img
		src="/WSQPrj/content/images/WSQlogo.jpg" alt="WSQ" />
	</a>
</h1>


<section>
<h1 class="hidden">헤더</h1>

<nav id="main-menu">
<h1 class="hidden">메인메뉴</h1>
<ul>
	<security:authentication property="name" var="userid"/>
	<li><a id="mypage" href="/WSQPrj/mypage/mypage?id=${userid}">MyPage</a></li>
	<li><a href="/WSQPrj/partner/findPartners">Find Partner</a>
	<li><a href="/WSQPrj/partner/partnerList?pg=1">PartnerList</a>
	<li><a href="/WSQPrj/partner/myPartnerList">MyPartnerList</a>
	<li><a href="/WSQPrj/wsqdebate/debate">WSQ Debate</a></li>
	<li><a href="">Notice</a></li>
	<li><a href="">Customer Center</a></li>
	<li><a href="/WSQPrj/chat/chat">Chat</a></li>
</ul>
</nav> <nav id="join-menu">
<h1 class="hidden">회원메뉴</h1>
<ul>
	<li><a href="/WSQPrj/joinus/join">회원가입</a></li>
	<li><c:if test="${pageContext.request.userPrincipal==null}">
			<a href="/WSQPrj/joinus/login">로그인</a>
		</c:if> 
		<c:if test="${pageContext.request.userPrincipal!=null}">
			<c:url var="logout" value="/j_spring_security_logout" />
			<a href="${logout}">로그아웃</a>
		</c:if></li>
</ul>
</nav> </section>