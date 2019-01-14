<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css" />
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2">
				<%@ include file="../home/header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<%@ include file="../home/navi-bar.jsp" %>
			</td>
		</tr>
		<tr style="height: 600px">
			<td>
				<%@ include file="side-menu.jsp"%>		
			</td>
			<td>
				<%
					String dest = String.valueOf(request.getAttribute("dest"));
					switch(dest){
					case "open-form": 
						%>
						<%@ include file="open-form.jsp"%>
						<% 
						break;
					case "open-result": 
						%>
						<%@ include file="open-result.jsp"%>
						<% 
						break;
					}
				%>
			</td>
		</tr>
	</table>
</body>
</html>