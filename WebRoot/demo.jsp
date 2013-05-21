<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="com.hisupplier.guess.util.IConstants" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>海商网-研发部</title>
		<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
		<script type="text/javascript" src="/js/uploadify/swfobject.js"></script>
		<script type="text/javascript" src="/js/uploadify/jquery.uploadify.js"></script>
		<script>
			$(function(){
				$("#uploadify").uploadify({
					'swf'            : '/js/uploadify/uploadify.swf',
					'uploader'       : '/upload.jsp',
					'buttonText'	 : '选择图片',
					'fileTypeExts'	 : '*.*',
					'onUploadSuccess':function(file, data, response){
						
        			}
				});
			});
		</script>
	</head>
	<body>
	
		<div class="thumbnail" style="margin:25px;">
			<legend>图片上传</legend>
			<input type="file" name="uploadify" id="uploadify" />
		</div>	
	</body>
</html>
