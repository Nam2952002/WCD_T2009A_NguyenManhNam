<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 6/15/22
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="row">

    <div class="container">
        <h3 class="text-center">T2009A_NguyenManhNam</h3>
        <hr>
        <div class="container text-center">

            <a href="<%=request.getContextPath()%>/index.jsp" class="btn btn-success">Add New Phone</a>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>Name</th>
                <th>Brand</th>
                <th>Price</th>
                <th>Description</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="phones" items="${phone}">

                <tr>
                    <td>
                        ${phones.name}
                    </td>
                    <td>
                       ${phones.brand}
                    </td>
                    <td>
                        ${phones.price}
                    </td>
                    <td>
                        ${phones.description}
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
