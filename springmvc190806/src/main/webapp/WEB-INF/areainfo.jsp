<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	isELIgnored="false"%>
<%@taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML>
<html>
<head>

<title>My JSP 'areainfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css"
	href="/springmvc190806/dist/css/bootstrap.min.css">

<style type="text/css">
.container {
	padding: 20px;
}
</style>

</head>

<body>
	<div class="container">

		<cc:set var="areainfoes" value="${requestScope.areainfoes}"></cc:set>
		<cc:set var="pagecount" value="${requestScope.pagecount}"></cc:set>
		<cc:set var="currentpagenum" value="${requestScope.currentpagenum}"></cc:set>

		<cc:set var="areact" value="/areainfocontroller/getinfoes"></cc:set>
	
	
		<label class="label label-success">地区信息管理</label>
		
		<a href="/springmvc190806/areainfocontroller/readyinsert" class="pull-right" >添加信息</a>
		
		<br /> <br /><br /> <br />
		<div
			style="margin: auto;width: 900px;height: 400px;background-color: ">

			<table class="table table-hover text-center">
				<thead>
					<tr>
						<td>编号</td>
						<td style="width: 120px">名称</td>
						<td>行政级别</td>
						<td>上级地区编号</td>
						<td>数据维护</td>

					</tr>
				</thead>
				<tbody>
					<cc:forEach items="${areainfoes}" var="area">
						<tr>
							<td>${area.aid}</td>
							
							
							<cc:url var="url_readyupdate" value="/areainfocontroller/readyupdate" >
								<cc:param name="aid" value="${area.aid}" ></cc:param>
								<cc:param name="pagenum" value="${currentpagenum }"></cc:param>
							
							</cc:url>
							
							
							<td>${area.aname}
								 <a href="${url_readyupdate }" class="pull-right"> 
									<i class="glyphicon glyphicon-cog"></i>
								 </a>
							
							
							</td>
							<td><cc:choose>
									<cc:when test="${area.alevel==1}">国家</cc:when>
									<cc:when test="${area.alevel==2}">直辖市/省/州</cc:when>
									<cc:when test="${area.alevel==3}">市</cc:when>
								</cc:choose></td>
							<td>${area.aparentid}</td>
							<td>
								<a class="btn btn-danger btn-sm" href="/springmvc190806/areainfocontroller/dodelete?aid=${area.aid}&pagenum=${currentpagenum}" >delete</a>
							</td>

						</tr>
					</cc:forEach>
				</tbody>
			</table>
		</div>

		<hr />
		
		<cc:url var="url_1" value="${areact}" >
			<cc:param name="pagenum" value="1" ></cc:param>
		</cc:url>
		

		<div class='text-center'>
			
			<a href="${url_1 }">首页</a>
			
			
			<cc:url var="url_1" value="${areact}"  >
				<cc:param name="pagenum" value="${currentpagenum-1<1?1:currentpagenum-1}" ></cc:param>
			</cc:url>
			
			
			<a class="btn btn-link"  href="${url_1 }">上一页</a>

			<cc:forEach begin="1" end="${pagecount }" var="pn">

				<cc:if test="${pn==currentpagenum}">
					<button class="btn btn-primary disabled">${pn }</button>
				</cc:if>
				<cc:if test="${pn!=currentpagenum}">
					<cc:url var="url_1" value="${areact}"  >
						<cc:param name="pagenum" value="${pn}" ></cc:param>
					</cc:url>
				
					<a class="btn btn-link" href="${url_1}" >${pn }</a>
				</cc:if>

			</cc:forEach>
			
			<cc:url var="url_1" value="${areact}"  >
				<cc:param name="pagenum" value="${((currentpagenum+1)>pagecount)? pagecount:(currentpagenum+1)}" ></cc:param>
			
			</cc:url>
			
			<a class="btn btn-link"  href="${url_1}" >下一页</a>
			
			
			<a class="btn btn-link" href="/springmvc190806/areainfocontroller/getinfoes?pagenum=${pagecount}" >尾页</a>
			
		</div>


	</div>

</body>
</html>
