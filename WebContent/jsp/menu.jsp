<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>トップページ</title>
</head>
<body>
	<div id="header">
		<jsp:include page="header.jsp"/>
	</div>
	<div id="contents">
		<table border="1">
			<tr>
				<td>No</td>
				<td>機能</td>
				<td>詳細説明</td>
			</tr>
			<tr>
				<td>1</td>
				<td><a href="/MyWebApp/ShowSearchInput">StartAnalysis</a></td>
				<td>分析を始める！</td>
			</tr>
			<tr>
				<td>2</td>
				<td><a href="/MyWebApp/UploadServlet">FILEUpload</a></td>
				<td>ファイルをアップロード！</td>
			</tr>
		</table>
	</div>
	<div id="footer">
		<a href="/MyWebApp/ShowMenu">TOPへ戻る</a>
	</div>
</body>
</html>