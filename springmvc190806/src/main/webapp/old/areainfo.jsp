<%@page import="com.qingao.app190806.springmvc190806.pojo.Areainfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML >
<html>
  <head>
   
    <title>My JSP 'areainfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="/springmvc190806/dist/css/bootstrap.min.css">
	
	<script type="text/javascript" src="/springmvc190806/sysjs/jquery.js" ></script>
	
	
	<style type="text/css">
		.container{
			padding: 20px;
		}
		.table thead tr th{
			text-align: center;
		}
		
	</style>
	
  </head>
  
  		<%
  			//信息集合
  			List<Areainfo> infoes=(List<Areainfo>)request.getAttribute("areainfoes");
  			
  			//总页数
  			Integer pageCount=(Integer)request.getAttribute("pagecount");
  			
  			//当前信息显示 的 页码
  			Integer currentPageNum=(Integer)request.getAttribute("currentpagenum");
  			
  		
  					
  			
  		 %>
  
  <body>
   		
   		<div class="container">
   			
   			<div class="label label-success">地区信息管理</div>
   			
   			
   			<a href="/springmvc190806/areainfocontroller/readyinsert" class="pull-right" >添加信息</a>
   			
   			<hr/>
   			
   			
   			<div style="width: 800px;margin:auto;height: 400px">
   				
   				<table class="table table-hover table-condensed table-striped text-center">
   				
   					<thead>
   						<tr >
   							<th>编号</th>
   							<th>名称</th>
   							<th>行政级别</th>
   							<th>上级地区编号</th>
   							<th>数据管理</th>
   							
   						</tr>
   						
   					</thead>
   					
   					<tbody>
   						<%for(Areainfo area : infoes){ %>
   					
   							<tr>
	   							<td>
	   								<%=area.getAid() %>
	   							</td>
	   							<td style="text-align: right;width: 140px">
	   								<%=area.getAname() %>
	   								&nbsp; 
	   							
	   								<a  href="/springmvc190806/areainfocontroller/readyupdate?pagenum=<%=currentPageNum %>&aid=<%=area.getAid() %>"  class="btn btn-link" style="outline: none">
	   									<i class="glyphicon glyphicon-cog text-primary" style="font-size:16px">
		   								</i>
	   								</a>
	   								
	   							</td>
	   							<td>
	   								<%
	   									switch(area.getAlevel()){
											case 1:
												%>
												 国家
												<%
												
												 break;
											
											case 2:
												%>
												 省/直辖市/州
												<%
											
												 break;
											
											case 3:
												%>
												 市
												<%
												 break;
													   									

	   									}

	   								
	   								
	   								 %>
	   							
	   							
	   							</td>
	   							<td>
	   								<%=area.getAparentid()==null ? "":area.getAparentid() %>
	   							</td>
	   							<td>
	   								<button btn_type="delete" aid="<%=area.getAid() %>"  class="btn btn-danger btn-sm"  > delete </button>
	   							
	   							</td>
	   						</tr>
	   					
   					
   					
   					
   						<%} %>
   					
   					
   					</tbody>
   				
   				</table>
   				
   				
   				
   				
   				
   			
   			
   				
   			
   			</div>
   			
   			
   			
   			
   			<hr/>
   				
   					<div class="text-center">
   						 	
   						 	<a class="btn btn-link" href="/springmvc190806/areainfocontroller/getinfoes?pagenum=1" >首页</a>
   						 	
   						 	
   						 	<%
   						 		int previous =currentPageNum-1;
   						 		
   						 		if(previous<1){
   						 			previous=1;
   						 		}
   						 		
   						 	 %>
   						 	
   						 	<a class="btn btn-link" href="/springmvc190806/areainfocontroller/getinfoes?pagenum=<%=previous %>" >上一页</a>
   						 	
   						 	
   						 	
   						 	
   						 	
   						 	<%for(int i=1;i<=pageCount;i++){ %>
   						
   								 <%if(currentPageNum==i){ %>
   									<a class="btn btn-primary disabled"    href="/springmvc190806/areainfocontroller/getinfoes?pagenum=<%=i %>"  ><%=i %></a>
   								
   								<%}else{ %>
   								
   									<a class="btn btn-link" href="/springmvc190806/areainfocontroller/getinfoes?pagenum=<%=i %>"  ><%=i %></a>
   								
   								
   								<%} %>
   								
   								
   								
   							<%} %>
   							
   							<%
   						 		int next =currentPageNum+1;
   						 		
   						 		if(next>pageCount){
   						 			next=pageCount;
   						 		}
   						 		
   						 	 %>
   						 	
   							
   							<a class="btn btn-link" href="/springmvc190806/areainfocontroller/getinfoes?pagenum=<%=next %>" >下一页</a>
   						 	
   							
   							<a class="btn btn-link" href="/springmvc190806/areainfocontroller/getinfoes?pagenum=<%=pageCount %>" >尾页</a>
   						 	
   							
   					</div>
   			
   		
   		
   		</div>
   		
   	
   	
  </body>
  
  
  <script type="text/javascript">
  
  	$("").ready(function(){
  	
  		$("[btn_type=delete]").click(function(){
  		
  			
  			if(window.confirm("是否确认删除")){
  				
  				window.location.href="/springmvc190806/areainfocontroller/dodelete?pagenum=<%=currentPageNum%>&aid="+$(this).attr("aid");
  			
  			
  			}
  			
  			
  			//window.open("http://www.sina.com","_blank","width=200,height=200");
  			
  		});
  	
  	});
  
  
  
  </script>
  
  
  
  
  
  
  
  
  
  
</html>
