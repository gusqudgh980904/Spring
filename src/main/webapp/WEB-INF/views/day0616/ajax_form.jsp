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
    <link href="http://localhost/spring/common/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery CDN(Contents Delivery Network) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <!-- bootstrap -->
<script src="http://localhost/spring/common/bootstrap/js/bootstrap.min.js"></script>

<style type="text/css">

</style>
<script type="text/javascript">
$(function(){
	$("#req").click(function(){
		$.ajax({
			url:"use_jsp.do",
			data:"name="+$("#name").val(),
			dataType:"json",
			type:"post",
			error:function(xhr){
				console.log(xhr.status);
				console.log(xhr.statusText);
			},
			success:function(json){
				$("#reqDiv").html("서버에서 처리된 메시지:"+json.msg);
			}
		});//ajax	
	});//click
	
	$("#req1").click(function(){
		$.ajax({
			url:"use_jsp1.do",
			data:"name1="+$("#name1").val(),
			dataType:"json",
			type:"post",
			error:function(xhr){
				console.log(xhr.status);
				console.log(xhr.statusText);
			},
			success:function(json){
				$("#reqDiv1").html("서버에서 처리된 메시지:"+json.msg);
			}
		});//ajax	
	
	});//click
});//ready
</script>
</head>
<body>
<div>
<strong>기존의 동작방식으로 응답받기</strong><br/>
<label>이름:</label><input type="text" name="name" id="name"/>
	<input type="button" value="요청" id="req"/>
	<div id="reqDiv"></div>
</div>

<div>
<strong>@ResponseBody 응답받기</strong><br/>
<label>이름:</label><input type="text" name="name1" id="name1"/>
	<input type="button" value="요청" id="req1"/>
	<div id="reqDiv1"></div>
</div>

</body>
</html>