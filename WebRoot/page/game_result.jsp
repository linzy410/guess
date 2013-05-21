<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>猜猜谁是卧底</title>
		<link rel="shortcut icon" href="http://www.hisupplier.com/images/ico/hisupplier.ico" type="image/x-icon">
		<link href="/css/bootstrap.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
	</head>
	<body>
		<table class="table table-bordered table-hover table-condenseds">
			<thead>
				<th>玩家</th>
				<th>词</th>
				<th>角色</th>
				<th>状态</th>
			</thead>
			<s:iterator value="loginUsers">
				<tr>
					<td>${name}</td>
					<td>${word}</td>
					<td><s:if test="identity==1">平民</s:if><s:if test="identity==2">卧底</s:if></td>
					<td>
						<s:if test="guess.overState==1">WIN</s:if>
						<s:elseif test="guess.overState==2">冤死</s:elseif>
						<s:elseif test="guess.overState==3">LOSE</s:elseif>
						<s:elseif test="guess.overState==4">WIN</s:elseif>
						<s:elseif test="guess.overState==5">LOSE</s:elseif>
					</td>
				</tr>
			</s:iterator>
		</table>
	</body>
</html>
