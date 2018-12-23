<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12 0012
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/a.css">
    <script src="/js/a.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.css">
    <script src="/js/jquery.js"></script>
</head>
<body>
jsp页面
<form action="/page/upload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="files"/>
    <input type="file" name="files"/>
    <input type="file" name="files"/>
    <input type="file" name="files"/>
    <input type="submit" value="提交">
</form>
</body>

</html>
