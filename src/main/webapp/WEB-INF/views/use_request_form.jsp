<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<form action="request_process.do" method="get">
<label>이름</label>
<input type="text" name="name"/><br/>
<label>나이</label>
<input type="text" name="age"/><br/>
<label>사용가능기술</label>
<input type="checkbox" name="lang" value="Java SE"/>자바
<input type="checkbox" name="lang" value="HTML"/>HTML
<input type="checkbox" name="lang" value="CSS"/>CSS
<input type="checkbox" name="lang" value="Java Script"/>자바스크립트
<input type="checkbox" name="lang" value="Java EE"/>Servlet/JSP<br/>
<input type="submit" value="전송"/>


</form>
</div>
</body>
</html>