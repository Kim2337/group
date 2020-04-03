<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<c:if test="${i==0 }">
	회원 가입 안됨!!
</c:if>
<c:if test="${ i >0}">
회원 가입 정보<br>
${mem.memberid }<br>
${mem.password }<br>
${mem.name }<br>
${mem.email}
</c:if>
</body>




</html>