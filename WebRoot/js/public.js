function goAction(url){
	window.location.href = url;
}

/** show succ or error message  */
function hideMsg(){
	$("#msg_succ").hide();
	$("#msg_err").hide();
}

function showSuccMsg() {
	hideMsg();
	$("#msg_succ").slideDown();
	setInterval("$('#msg_succ').slideUp();",2000);
}
function showErrorMsg(){
	hideMsg();
	$("#msg_err").slideDown();
}
function showErrorMsg(msg){
	hideMsg();
	$("#text_err").html(msg);
	$("#msg_err").slideDown();
}