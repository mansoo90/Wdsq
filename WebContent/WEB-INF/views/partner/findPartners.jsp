l<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
				<main class="main">
				 <form action="partnerList" method="get" > <!-- 서브밋한거 페이지 이리로 넘어감 -->
					<h2>FInd! your partner</h2>
					<table class="mtable">
						<tbody>
							<tr>
								<td><legend>국적</legend>
									<select name="nationalityCountry">
										<c:forEach var="p" items="${countryList}">
										<option value="${p.country}">"${p.country}"</option>
										</c:forEach>
									</select>
								</td>
								<td><legend>거주국가</legend>
									<select name="habitatCountry"><!-- name으로 넘겨줘 -->
										<c:forEach var="p" items="${countryList}">
										<option value="${p.country}">"${p.country}"</option>
										</c:forEach>
									</select>
								</td>
							</tr>
							<tr>
								<td><legend>모국어</legend>
									<select name="nativeLanguage">
										<c:forEach var="p" items="${languageList}">
										<option value="${p.language}">"${p.language}"</option>
										</c:forEach>
									</select>
								</td>
								<td><legend>레벨</legend>
									<select name="nativeLanguageLV">
										<option value="1"></option>
										<option value="2"></option>
									</select>
								</td>
							</tr>
							<tr>
								<td><legend>배우는 언어</legend>
									<select name="learnLanguage">
										<c:forEach var="p" items="${languageList}">
										<option value="${p.language}">"${p.language}"</option>
										</c:forEach>
									</select>
								</td>
								<td><legend>레벨</legend>
									<select name="earnLanguageLV">
										<option value="1"></option>
										<option value="2"></option>
									</select>
								</td>
							</tr>
							<tr>
<!-- 								<td><legend>성별</legend>
									<select name="gender">
										<option value="male"></option>
										<option value="femle"></option>
									</select>
								</td> -->
<!-- 								<td><legend>나이</legend>
									<select name="age">
										<option value="1"></option>
										<option value="2"></option>
									</select>
								</td> -->
							</tr>
							<input type="submit"  value="검색"> 
							<!-- 서브밋으로 하면 위에 name값들 그대로 컨트롤러로 넘길수잇다 -->
							<!-- <a class="btn-search button" href="partnerList">검색</a> -->
						</tbody>
					</table>
					</form>
				</main>
