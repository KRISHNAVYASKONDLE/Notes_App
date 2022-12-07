<jsp:include page="../../main/java/com/notemu/Filedata.java" flush="true" />

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.notemu.Person" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" charset="ISO-8859-1"/>
 <link rel="stylesheet"  href="<%=request.getContextPath()%>/src/main/webapp/css/Sitelink.css" />

<title>Insert title here</title>				
</head>
<body>

<div class="header">


<a href="default">Note_App</a>


<ul>
<li>Home</li>
<li>About</li>
</ul>	

<input type="text" placeholder="search here" >


</div>

<div class="input_text">
<form action="Storedata" method="post">


<textarea rows="15" cols="100" placeholder="enter here" name="userdata"></textarea>
<br>
<input type="submit" value="Adsdnotew">

</form>


<% List<Person> li=(List<Person>)request.getSession().getAttribute("list") ;

if(!li.isEmpty())
{
for(Person p: li)
{%>

	<input type="text" value="<%=p.getUserdata()%>" >
	<br>
	
<%}}%>




</div>



</body>


</html> 