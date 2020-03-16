<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
	<c:when test="${param.pg==null || param.pg=='' }">
		<c:set var="printPage" value="30_main.jsp"/>
	</c:when>
	<c:when test="${param.pg.equals('welcome') }">
		<c:set var="printPage" value="member/welcome.jsp"/>
	</c:when>
</c:choose>

<jsp:include page="00_header.jsp"></jsp:include>
<jsp:include page="10_topbar.jsp"></jsp:include>
<jsp:include page="20_nav.jsp"></jsp:include>
<jsp:include page="${printPage }"></jsp:include>
<jsp:include page="90_footer.jsp"></jsp:include>