<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<table border=1 frame="box" rules="none" width=600>
	<%
	String screentitle = (String) request.getAttribute("screentitle");
	%>
	<tr>
		<td><img src=".\img\logo.png"></td>
		<td><h1>取引結果照会</h1></td>
	</tr>
	<tr>
		<td>
			<p><%= screentitle %></p>
		</td>
	<tr>
		<td><h2>ようこそtestさん</h2></td>
	</tr>
	<tr>
		<td>最終ログイン日時：2018/12/12 24:00</td>
	</tr>
</table>