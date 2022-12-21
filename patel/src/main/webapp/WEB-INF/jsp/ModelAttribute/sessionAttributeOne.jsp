<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body> 
Session Attribute Example

 <form method="POST" action="sessionAttributeExampleSubmit">
             <table>
                <tr>
                    <td>Student Name</td>
                    <td><input type="text" name="studentName"/></td>
                </tr>
                <tr>
                    <td>Student Hobby</td>
                    <td><input type="text" name="studentHobby"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
                 <tr>
                    <td>
                    <select name="skill" multiple="multiple" size="5">
                    <option value="1">C language</option>
                    <option value="2">Java</option>
                    <option value="3">.net</option>
                    <option value="4">python</option>
                    </select>
                    </td>
                </tr>
            </table>
        </form>
</body>
</html>