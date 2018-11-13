<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
<h1>${Hello}</h1>
<form action="register.htm" method="post">
    <table style="with: 50%">
        <tr>
            <td>First Name</td>
            <td><input type="text" name="stud_first_name" /></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="stud_last_name" /></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="stud_address" /></td>
        </tr>
        <tr>
            <td>Contact No</td>
            <td><input type="text" name="stud_contact" /></td>
        </tr></table>
    <input type="submit" value="Save" />
</form>
<a href="goto">goto</a>
</body>
</html>
