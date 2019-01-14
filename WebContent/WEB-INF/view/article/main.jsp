<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet"
	href="<%=application.getContextPath()%>/resources/css/style.css" />
<body>
</head>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2"><%@ include file="../home/header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2"><%@ include file="../home/navi-bar.jsp"%>
			</td>
		</tr>
		<tr style="height: 600px">
			<td><%@ include file="side-menu.jsp"%>
			</td>
		</tr>
	</table>
</body>
</html>