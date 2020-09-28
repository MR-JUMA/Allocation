<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Create Location</title>
</head>
<body>
<form action="updateLoc" method="post">
    <pre>
    Id:<input type="text" name="id" value="${location.id}" readonly />
    Code:<input type="text" name="code" value="${location.code}" />
    Name:<input type="text" name="name" value="${location.name}" />
    Type:Urban<input type="radio" name="type" value="URBAN" value="${location.type=='URBAN'?'checked':''}" />
         Rural<input type="radio" name="type" value="RURAL" value="${location.type=='RURAL'?'checked':''}"/>

    <input type="submit" value="save"/>
</pre>

</form>

</body>
</html>