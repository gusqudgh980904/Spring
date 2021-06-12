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
<c:forEach var="img" items="${imgList }">
<div>
<img src="http://localhost/sist/common/images/${img}"/>
</div>
<div style="position:absolute; top:200px;left:400px">
<ul>
	<c:if test="${empty noticeList }">
		<li>공지없음</li>
	</c:if>
	<c:forEach var="notice" items="${noticeList }">
		<li><c:out value="${notice}"/></li>
	</c:forEach>
</ul>
</div>
</c:forEach>

</div>
</body>
</html>