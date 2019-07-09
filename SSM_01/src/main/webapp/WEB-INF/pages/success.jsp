<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/7/9
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>我的遥控器找到啦</h2>

<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
