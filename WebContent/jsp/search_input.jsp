<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>銘柄コード入力</title>
</head>
<body>
	<div id="header">
		<jsp:include page="header.jsp"/>
	</div>
	<div id="contents">
		<form action="/MyWebApp/ShowSearchResult" method="post">
			<table>
				<tr>
					<td>銘柄コード： <input type="text" name="brandcode" maxlength="4">
					</td>
				<tr>
					<td>銘柄名：</td>
				</tr>
				<tr>
					<td><input type="submit" value="「ボタンです」"></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="footer">
		<a href="/MyWebApp/ShowMenu">TOPへ戻る</a>
	</div>
</body>
</html>