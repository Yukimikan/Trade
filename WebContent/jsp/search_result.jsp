<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--
	JSTLのタグを利用 libフォルダにtaglibs~*.jarを配置。
 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="model.StockTradeFile, form.SearchResultForm, java.util.ArrayList"%>
<%
	String brandcode = (String) request.getAttribute("brandcode");
	ArrayList<String> cntr_date_lst = new ArrayList<>();
	ArrayList<String> brandname_lst = new ArrayList<>();
	cntr_date_lst = (ArrayList<String>) request.getAttribute("cntr_date_lst");
	brandname_lst = (ArrayList<String>) request.getAttribute("brandname_lst");
	//ArrayList<SearchResultForm> form_out =
	//		(ArrayList<SearchResultForm>) request.getAttribute("SearchResultForm");
	//StockTrade stocktrade = new StockTrade();
	//stocktrade = (StockTrade) request.getAttribute("Brandcode");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>受け渡し</title>
</head>
<body>
	<div id="header">
		<jsp:include page="header.jsp"/>
	</div>
	<div id="contents">
		銘柄コード：<%=brandcode%>
		<table border="1">
			<c:forEach var="cntr_date" items="${cntr_date_lst}">
				<tr>
					<td><c:out value="${cntr_date}" /></td>
				</tr>
			</c:forEach>
		</table>
		<table border="1">
			<c:forEach var="brand_name" items="${brandname_lst}">
				<tr>
					<td><c:out value="${brand_name}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div id="footer">
		<a href="/MyWebApp/ShowMenu">TOPへ戻る</a>
	</div>
</body>
</html>