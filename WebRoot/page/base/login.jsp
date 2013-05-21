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
		<script type="text/javascript" src="/js/jquery.easing.js"></script>
		<script type="text/javascript" src="/js/scroller.js"></script>
		<style type="text/css">
			.demo1{float:left;clear:both;width:100%;height:273px;overflow:hidden;position:relative;}
			.demo1 .inside{position:absolute;margin-left:525px;;height:150px;margin-top: 90px;}
			.demo1 a{
				display:block;position:absolute;width:150px;height:150px;overflow:hidden;border:5px solid #fff;
				-moz-border-radius:150px;
				-webkit-border-radius:150px;
				border-radius:150px;
			}
			.scroller .active{z-index:5!important;}
		</style>
		<script>
			$(function(){
			     if($.browser.msie) {
			    	// $("table").hide();
			    	// alert("不是吧，你用IE！！！");
			     };
	    		$(".demo1").scroller();
			});
		</script>
	</head>
	<body>
		<s:iterator value="users" status="st">
		<s:if test="#st.index%7==0"><div class="scroller demo1">
			<div class="inside"></s:if>
					<a href="/login.action?selectedId=${id}" style="left: 0px; top: 0px; background-image: url(/img/headImg/${headImg}); background-position: 50% 50%; background-repeat: no-repeat no-repeat;">
						<img alt="${name}" title="${name}" width="100" src="/img/headImg/${headImg}"/>
					</a>
			<s:if test="#st.index%7==6||#st.last"></div>
		</div></s:if>
		</s:iterator>
	</body>
</html>
