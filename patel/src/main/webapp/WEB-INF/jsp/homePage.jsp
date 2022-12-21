<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
    <h2>Home Page</h2>

    <%-- <form:form method="POST"  commandName="loginAttribute">  This is the old way--%>
    
     <form:form  method="POST" action="addEmployee"  modelAttribute="loginAttribute"> <%-- This is the new way--%>
             <table>
                <tr>
                    <td><form:label  path="name">Name </form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input path="id"/></td>
                </tr>
                <tr>
                    <td><form:label path="contactNumber">Contact Number</form:label></td>
                    <td><form:input path="contactNumber"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
                <tr>
	                <td colspan="2">
						<a href="login/shashi/pass@123">Path Variable Example</a>
					</td>
					
                </tr>
                
                <tr>
	               <td colspan="2">
						<a href="requestParamExample?username=thomascook">RequestParam Example</a>
					</td>
					
                </tr>
                <tr>
                	<td colspan="2"> 
						<a href="sessionExampleOne">Click here to learn how to manage session in spring MVC</a>
					</td>
                </tr>
                <tr>
                	<td colspan="2"> 
						<b>Note:- In all the above Example we are using InternalResourceViewResolver</b>
					</td>
                </tr>
                <tr>
                	<td colspan="2"> 
						<a href="VeiwResolverExample.XmlViewResolver">Click here for xmlVeiwResolverExample</a>
					</td>
                </tr>
                 <tr>
                	<td colspan="2"> 
						<a href="ResourceBundleViewResolver.ResourceBundleViewResolver">Click here for ResourceBundleVeiwResolver</a>
					</td>
                </tr>
                
            </table>
            
        </form:form>
</body>
</body>
</html>