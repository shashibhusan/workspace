<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<title>modelAttributeExampleOneHome</title>
</head>
<body> 
<b>${time}</b><br/>
Value that u have entered is :-
${st.studentName} <br/><!--this is the value i am getting from @ModelAttribute st -->
${name.studentName}  <<<=== This is hard code inside controller<br/><!--This value i am adding in model Map --> 
 <table>
 <tr>
 
 </tr>
 </table>
</body>
</html>