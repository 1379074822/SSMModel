<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/7/9
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/account/test" style="align-content: center">点我！</a><br/>
    <form action="account/save" method="post">
        输入名字：<input type="text" name="name">
        输入工资：<input type="text" name="money">
        <input type="submit" name="提交">
    </form>
</body>
</html>
