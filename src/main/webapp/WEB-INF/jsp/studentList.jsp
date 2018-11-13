<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <title>Insert title here</title>

    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {background-color: #f2f2f2;}
    </style>

</head>
<body>

<table width="100%">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Address</th>
        <th>Contact</th>
        <th>Action</th>
    </tr>
    <c:forEach var='data' items="${studentList}">
        <tr>
            <td>${data.stud_first_name}</td>
            <td>${data.stud_last_name}</td>
            <td>${data.stud_address}</td>
            <td>${data.stud_mobile_number}</td>
            <td><a href="deleteStudent/${data.id}">Delete</a>&nbsp;<a href="update?id=${data.id}" style="text-decoration:none;">Update</a></td>
        </tr>
    </c:forEach>
</table>

<a href="home" value="create" >Create</a>

<a href="updateUserName" value="Update" >Update</a>
<a href="delete">Delete</a>
<a href="goto">Show</a>

</body>
</html>