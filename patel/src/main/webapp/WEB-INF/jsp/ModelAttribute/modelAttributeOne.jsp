<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>modelAttributeExampleOne</title>
</head>
<body> 

<b>${Heading}</b><br/>
<b>${time}</b><br/>
<b>This Example show how you will submit form using simple HTML Tags</b>
 <form method="POST" action="modelAttributeExampleSubmit">
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
                    <td>
                    <select name="skill" multiple="multiple" size="5">
                    <option value="1">C language</option>
                    <option value="2">Java</option>
                    <option value="3">.net</option>
                    <option value="4">python</option>
                    </select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form>
</body>
</html>