<%@page import="com.qingao.app190806.springmvc190806.pojo.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>



<!DOCTYPE HTML >
<html>
  <head>
    
    <title>My JSP 'session1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  	
  	
  <body>
   
   	session编号 : <%=session.getId() %>
   		
   		
   		
   		<form action="/springmvc190806/systemcontroller1/setatr1">
   			
   			输入值：<input type="text" name="atr1" placeholder="请输入您喜欢的值" >
   		
   			<button>ok</button>
   		
   		</form>
   	
   
   
   
  </body>
</html>
