<%@page import="com.qingao.app190806.springmvc190806.pojo.Areainfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML >
<html>
  <head>
   
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
  	
  		<% 
  		
  			 List<Areainfo> areas= (List<Areainfo>)request.getAttribute("allareainfoes") ;
  			 
  			 Areainfo area_old= (Areainfo)request.getAttribute("area") ;
  			 
  			 Integer pagenum=(Integer)request.getAttribute("pagenum");
  			 
  			 %>
  	 	
  	 	
  	 	<form action="/springmvc190806/areainfocontroller/doupdate" method="post">
  	 	
   		<table>
   		
   			<tr>
   				<td>编号：</td>
   				<td>
   					<%=area_old.getAid() %>
   				
   					<input type="hidden"   value="<%=area_old.getAid() %>" name="aid">
   					<input type="hidden"   value="<%=pagenum %>" name="pagenum">
   					
   				</td>
   			</tr>
   		
   			<tr>
   				<td>
   					地区名称：
   				</td>
   				<td>
   					<input type="text" name="aname" value="<%=area_old.getAname()%>">
   				</td>
   			
   			</tr>
   			<tr>
   				<td>
   					行政级别：
   				</td>
   				<td>
   					 <label><input  <%=area_old.getAlevel()==1?"checked='checked'":"" %>   type="radio" name="alevel" value="1">国家</label>
   					 
   					 <label><input <%=area_old.getAlevel()==2?"checked='checked'":"" %>   type="radio" name="alevel" value="2">省/直辖市/州</label>
   					 
   					 <label><input <%=area_old.getAlevel()==3?"checked='checked'":"" %>    type="radio" name="alevel" value="3">地级市</label>
   					
   				</td>
   			
   			</tr>
   			<tr>
   				<td>
   					所属上级地区：
   				</td>
   				<td>
					<select name="aparentid">
						<option value="0">无</option>
					
						<%for(Areainfo area : areas){ %>
					
							<option   <%=area_old.getAparentid()==area.getAid() ?"selected='selected'":"" %>      value="<%=area.getAid() %>" ><%=area.getAname() %></option>
						
						
						<%} %>
					
					</select>
   				</td>
   			
   			</tr>
   		
   			<tr>
   				<td colspan="2">
   					<hr/>
   					<button>更新</button>
   					<button type="reset">重置</button>
   				
   				</td>
   			</tr>
   		
   		
   		</table>
   		
   		
   		</form>
   
   
  </body>
</html>
