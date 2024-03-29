<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>

    <!-- bootstrap -->
    <link href="http://localhost/spring_mvc/common/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery CDN(Contents Delivery Network) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <!-- bootstrap -->
<script src="http://localhost/spring_mvc/common/bootstrap/js/bootstrap.min.js"></script>

<style type="text/css">

</style>
<script type="text/javascript">

</script>
</head>
<body>
<div>
<ul>
	<li><strong>입력값</strong></li>
	<li>닉네임:<c:out value="${param.nick}"></c:out></li>
	<li>나이:<c:out value="${param.nick}"></c:out></li>
	<li>
		<c:forEach var="movie" items="${movie}">
			<c:out value="${movie}"></c:out>
		</c:forEach>
		<c:if test="${empty movie}">
		선택한 영화 없음
		</c:if>
	</li>
</ul>
<a href="http://localhost/sist/index.html">메인화면</a>
</div>
</body>
</html>