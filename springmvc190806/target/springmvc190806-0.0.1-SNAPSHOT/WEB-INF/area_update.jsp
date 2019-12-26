<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML >
<html>
<head>

<title>My JSP 'area_insert.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="/springmvc190806/dist/css/bootstrap.min.css">

<script type="text/javascript" src="/springmvc190806/sysjs/jquery.js"></script>

	<style type="text/css">
	
		.container{
		
			padding: 30px
		}
		.table tr td:FIRST-CHILD {
			
			text-align: right;
			height: 60px;
			
						
		}
		
		.table tbody tr td{
		
			border-color:#ffffff;
		}
		
	</style>
</head>

<body style="background-color: ">

	
	<cc:set var="area" value="${requestScope.area }" ></cc:set>
	<cc:set var="allareainfoes" value="${requestScope.allareainfoes }" ></cc:set>
	<cc:set var="pagenum" value="${requestScope.pagenum }" ></cc:set>
	

	<div class="container" >
		
		<form action="/springmvc190806/areainfocontroller/doupdate"
			method="post">


			<div class="panel panel-danger" style="width:400px;">
				<div class="panel-heading">地区信息添加</div>
				<div class="panel-body">
						
						<br/>
					<table class="table">
						
						<tr>
							<td  style="width:100px">地区编号：</td>
							<td style="width:250px">
								${area.aid }
							<input type="hidden" name="aid"  value="${area.aid}"></td>
							<input type="hidden" name="pagenum"  value="${pagenum}"></td>
							
							<td></td>
							
						</tr>
					
					
						<tr>
							<td  style="width:100px">地区名称：</td>
							<td style="width:250px">
							<input type="text" name="aname" value="${area.aname}" class="form-control"></td>
							<td></td>
							
						</tr>
						<tr>
							<td>行政级别：</td>
							<td>
							<label>
							
							<input ${area.alevel==1?"checked='checked'":"" }  type="radio"name="alevel" value="1">国家</label>
							
							&nbsp; &nbsp; 
							<label>
							<input  ${area.alevel==2?"checked='checked'":"" }  type="radio" name="alevel" value="2">省/直辖市/州</label>
							
							&nbsp; &nbsp; 
							<label>
								<input  ${area.alevel==3?"checked='checked'":"" }  type="radio" name="alevel" value="3">地级市</label>

							</td>
							<td></td>
							
						</tr>
						<tr>
							<td>上级地区：</td>
							<td>
							
							<select name="aparentid" class="form-control" >
									<cc:forEach items="${requestScope.allareainfoes}" var="area_c" >
									
										
										<option ${area.aparentid==area_c.aid?"selected='selected'":"" } value="${area_c.aid }" >${area_c.aname }</option>
									
									
									</cc:forEach>



							</select></td>
							<td></td>
							
						</tr>

						<tr>
							<td colspan="3" class="text-center">
							
								<br/><br/>
							
								<button class="btn btn-danger">更新</button>
								
								&nbsp; &nbsp; 
								
								<button class="btn btn-default" type="reset">重置</button>

							</td>
						</tr>


					</table>


				</div>
			</div>






		</form>




	</div>


</body>
</html>
