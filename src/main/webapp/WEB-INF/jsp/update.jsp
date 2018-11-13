<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="updateAddr" method="post">
    <%-- 	<input type="hiden" name="id" id="id" value="${user.id}" />


                Address<input type="textarea" name="address" /><br>

        <input type="submit" value="Save" />
 --%>

    <table width="100%">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Address</th>
            <th>Contact</th>
            <th>Action</th>
        </tr>

        <input type="hidden" name="id" value="${student.id}"/>

        <tr>
            <td><input type="text" name="stud_first_name" value="${student.stud_first_name}"/></td>
            <td><input type="text" name="stud_last_name" value="${student.stud_last_name}"/></td>
            <td><input type="text" name="stud_address" value="${student.stud_address}"/></td>
            <td><input type="text" name="stud_mobile_number"  value="${student.stud_mobile_number}"/></td>
            <td><input type="submit" value="Update"/></td>
        </tr>
    </table>

</form>
</body>
</html>