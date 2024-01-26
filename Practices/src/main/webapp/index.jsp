<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println("Today is:"+java.util.Calendar.getInstance().getTime()); 


out.println("Devendra kumar pal garhikhanpur budaun uttar pradesh india 202523.");%>  
<%   
response.sendRedirect("http://newstime45.herokuapp.com"); 

%> 


</body>
</html>