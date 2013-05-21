<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="com.hisupplier.guess.util.IConstants" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>海商网-研发部</title>
		<link rel="shortcut icon" href="http://www.hisupplier.com/images/ico/hisupplier.ico" type="image/x-icon">
		<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
			<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
			<script type="text/javascript" src="/js/bootstrap-modal.js"></script>
			<style type="text/css">
				::-webkit-scrollbar { width: 3px; height: 3px;}   
				::-webkit-scrollbar-track-piece { background-color: #ffffff;}   
				::-webkit-scrollbar-thumb{height: 50px; background-color: #666; -webkit-border-radius: 3px;}  
				.ulist {
					width: 760px;
					margin: 0;
					border-top: 1px solid #cccccc;
					border-left: 1px solid #cccccc;
				}
				
				.ulist li {
					float: left;
					width: 150px;
					height: 270px;
					list-style-type: none;
					border: 1px solid #cccccc;
					position: relative;
				}
				
				.ulist li img {
					padding-top: 7px;
					padding-bottom: 4px;
				}
				
				.msglist {
					width: 350px;
					margin: 0;
					border: 1px solid #cccccc;
				}
				
				.msglist li {
					float: left;
					width: 350px;
					list-style-type: none;
					border: 1px solid #cccccc;
					/*非必须*/
					line-height: 30px;
					font-size: 13px;
				}
				.die_1 {
					background-image:url("/img/people.png");
					background-repeat:no-repeat;
					top:27px;
					left:0px;
					width:120px;
					height:119px;
					position: absolute;
				}
				.die_2 {
					background-image:url("/img/undercover.png");
					background-repeat:no-repeat;
					top:27px;
					left:0px;
					width:120px;
					height:119px;
					position: absolute;
				}
			</style>
			<script>
			$(function(){
				gameMain();
				window.setInterval("gameMain()",1000);
				$('#myModal').modal({backdrop:false,keyboard:false, show:false});
			    $('#myModal').on('show', function () {
			    	if ($("#modal-backdrop").size() == 0) {
				    	$('<div class="modal-backdrop" id="modal-backdrop"/>').appendTo(document.body)
			    	}
			    });
			    $('#myModal').on('hide', function () {
			    	if ($("#modal-backdrop").size() > 0) {
				    	$("#modal-backdrop").remove();
			    	}
			    });
				
			});
			//window.onbeforeunload=stoprefresh;
			
			function stoprefresh(){
				return "好好游戏不准刷新！"
			}
			
			function gameMain(){
				$.ajax({
					url:'/json/main.action',
					cache:false,
					dataType:'json',
					success:function(data){
						showLoginUser(data);
					}
				});
			}

			function showLoginUser(data){
				$("#round").html("第" + data.map.round + "回合");
				
				//等待、准备
				if (data.map.gameState==<%=IConstants.GAME_STATE_WAITING%> || data.map.gameState==<%=IConstants.GAME_STATE_READY%>){
					if ($("#gs").html().indexOf("游戏等待中")<0){
						$("#gs").html('游戏等待中...<button id="bsg" class="btn btn-large btn-success" disabled onclick="startGame();">开始</button>');
					}
					$("#tempgs").val(0);
					
					if(data.map.gameState==<%=IConstants.GAME_STATE_READY%>){//准备
						$("#bsg").removeAttr("disabled");
					}else{
						$("#bsg").attr("disabled", "true");
					}
					var existUser = getExistUser();
					$(data.loginUsers).each(function(user){
						if (existUser.indexOf(","+this.id+",")<0){
							var html = '<li id="'+this.id+'"><img width="120" src="/img/headImg/'+this.headImg+'" title="'+this.name+'"/>'
							if (this.gameState==<%=IConstants.GAME_STATE_READY%>){
								html += '<input type="button" disabled id="btn_ready_'+this.id+'" class="btn btn-primary" onclick="ready(this);" value="已准备"/></li>';
							}else{
								if (this.id==${sessionScope.user.id}){
									html += '<input type="button" id="btn_ready_'+this.id+'" class="btn btn-primary" onclick="ready(this);" value="准备"/></li>';
								}else{
									html += '<input type="button" disabled id="btn_ready_'+this.id+'" class="btn btn-info" value="未准备"/></li>';
								}
							}
							var preId = getMaxIdLiLessThan(this.id);
							if (preId == null){
								$("#userlist").append(html);
							}else{
								$("#"+preId).before(html);
							}
						}else{
							if (this.gameState==<%=IConstants.GAME_STATE_READY%>){
								if ($("#btn_ready_"+this.id).size()>0){
									$("#btn_ready_"+this.id).attr("disabled",true);
									$("#btn_ready_"+this.id).removeClass("btn-info");
									$("#btn_ready_"+this.id).addClass("btn-primary");
									$("#btn_ready_"+this.id).attr("value", "已准备");
								}
							}
						}
					});
				} else if(data.map.gameState==<%=IConstants.GAME_STATE_DOING%>){ // 进行中
					if($("#tempgs").val()==0){
						$("#gs").html('游戏进行中');
						$("#userlist").html("");
						$("#bsg").hide();
						$("#tempgs").val(1);
					}
					if($("#gs").html().indexOf("发言")<0){
						$("#gs").html('游戏进行中 >> 发言');
					}
					var existUser = getExistUser();
					$(data.loginUsers).each(function(user){
						if (this.state!=<%=IConstants.GAME_STATE_OVER%>){
							if (existUser.indexOf(","+this.id+",")<0){
								var html = '<li id="'+this.id+'" rel="'+this.guess.state+'"><img width="120" src="/img/headImg/'+this.headImg+'" title="'+this.id+'"/>'
								if(this.id==${sessionScope.user.id}){
									html+='<div>本轮词：'+this.word+'</div>';
								}
								if (this.guess.state==<%=IConstants.GUESS_SPEAK_ALLOW%>){
									html+='<div id="ds_'+this.id+'">发言<i class="icon-volume-up"></i><span id="stime_'+this.id+'"></span></div>';
									$("#tempvote").val(0);
									if (this.id==${sessionScope.user.id}){
										$("#tmsg, #bspeak").removeAttr("disabled");
									}
								}else{
									html+='<div id="ds_'+this.id+'" class="hide">发言<i class="icon-volume-up"></i><span id="stime_'+this.id+'"></span></div>';
								}
								$("#userlist").append(html);
							}else{
								var oldstate = $("#"+this.id).attr("rel");
								if(this.guess.state==<%=IConstants.GUESS_SPEAK_ALLOW%>){ // 发言
									if(oldstate==<%=IConstants.GUESS_SPEAK_UNALLOW%>){
										$("#ds_"+this.id).show();
										$("#"+this.id).attr("rel","<%=IConstants.GUESS_SPEAK_ALLOW%>")
										$("#tempvote").val(0);
										if (this.id==${sessionScope.user.id}){
											$("#tmsg, #bspeak").removeAttr("disabled");
										}
									}
									$("#stime_"+this.id).html(<%=IConstants.SPEAK_TIME%>-this.guess.time);
								}else{
									if(oldstate==<%=IConstants.GUESS_SPEAK_ALLOW%>){
										$("#"+this.id).attr("rel","<%=IConstants.GUESS_SPEAK_UNALLOW%>")
										$("#ds_"+this.id).hide();
									}
								}
							}
						}
						
						if (data.map.guessState==<%=IConstants.GUESS_VOTE%>){ // 投票信息
							if ($("#l_v_"+this.id).size() > 0) {
								$("#l_v_"+this.id).html(this.name + ": " + this.guess.allVoteUser);
							} else {
								var vhtml = '<li id="l_v_'+this.id+'">'+this.name + ": " + this.guess.allVoteUser+'</li>';
								$("#uvote").append(vhtml);
							}
						}
						if (this.gameState == <%=IConstants.GAME_STATE_OVER%> && $("#sp_die_"+this.id).size()==0) { // 淘汰标志
							$("#"+this.id).append('<span id="sp_die_'+this.id+'" class="die_'+this.identity+'"></span>');
						}
					});
					$("#vdesc").html('');
					$(data.map.desc).each(function(d){
						var html = '<li>'+this+'</li>';
						$("#vdesc").append(html);
					});
					if (data.map.guessState==<%=IConstants.GUESS_VOTE%> && $("#tempvote").val()==0){
						if($("#gs").html().indexOf("投票阶段")<0){
							$("#gs").html('游戏进行中 >> 投票阶段');
						}
						$(data.loginUsers).each(function(user){
							if (this.id==${sessionScope.user.id} && this.gameState==<%=IConstants.GAME_STATE_OVER%>){
								$(".voteBtn").remove();
								return false;
							} else if(this.guess.voteState==<%=IConstants.VOTE_NOT%> && $("#bvote_"+this.id).size()==0 && this.id!=${sessionScope.user.id}){
								var bhtml = '<button id="bvote_'+this.id+'" onclick="vote('+this.id+');" class="btn btn-primary voteBtn">Ta是卧底</button>';
								$("#"+this.id).append(bhtml);
							}
						});
					}
				} else if(data.map.gameState==<%=IConstants.GAME_STATE_OVER%>) {
					$("#gs").html('游戏结束');
					// 弹框显示结果
					$("#ifr_g_rsl").attr("src", "/main/main_game_result.action");
					$('#myModal').modal('show');
				}
			}
			
			function vote(userId){
				$.ajax({
					url:'/json/main_vote.action?selectedId='+userId,
					cache:false,
					dataType:'html',
					success:function(d){
						if (d=='dieVoteErr'){
							alert('死人有选举权吗？');
						} else if (d="voteMore"){
							alert('投那么多次有意思吗？');
						}else{
							$("#tempvote").val(1);
							$("#userlist > li > button").remove();
						}
					}
				});
			}
			
			function getExistUser(){
				var existUser = ",";
				$("#userlist > li").each(function(l){
					existUser += this.id + ",";
				});
				return existUser;
			}

			function getMaxIdLiLessThan(userId){
				var ul = $("#userlist > li");
				if (ul.length==0){
					return null;
				}
				var tId=null;
				ul.each(function(d){
					var liid=Number(this.id);
					if(liid>userId){
						tId=this.id;
						return false;
					}
				});
				return tId
			}

			function ready(btn){
				$.ajax({
					url : '/json/main_user_ready.action',
					cache:false,
					dataType:'html',
					success:function(data){
						btn.disable=true;
						btn.value = '已准备';
					}
				});
			}
			function startGame(){
				$.ajax({
					url:'/json/main_start_game.action',
					cache:false,
					dataType:'html'
				});
			}
			
			function stopGame() {
				$.ajax({
					url:'/json/main_stop_game.action',
					cache:false,
					dataType:'html',
					success:function(d){
						window.location.reload();
					}
				});
			}
			
			function speak() {
				var desc = $("#tmsg").val();
				if (desc != null && desc.length > 0){
					$.ajax({
						url:'/json/main_speak.action?desc='+desc,
						cache:false,
						dataType:'html',
						success:function(d){
							if (d=='false'){
								alert('确定是你说话了吗');
							}
							$("#tmsg, #bspeak").attr("disabled", "true");
						}
					});
				}
			}
			
			function restart() {
				$.ajax({
					url:'/json/main_user_ready.action',
					cache:false,
					dataType:'html',
					success:function(d){
						window.location.reload();
					}
				});
			}
		</script>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span7">
					<div id="dmsg"></div><button class="btn btn-danger" onclick="stopGame();">停</button>
					<input type="hidden" id="tempgs" value="0"/>
					<input type="hidden" id="tempvote" value="0"/>
					<div style="margin:10px;font-size:18px;font-weight: bold;"><span id="round" style="padding-right:20px;"></span><span id="gs"></span></div>
					<div>
						<ul class="ulist" id="userlist"></ul>
					</div>
					<div style="padding-top:570px;display: block;">
						<div class="well form-search">
							<input type="text" class="span8" disabled placeholder="这不该你说话了，你有30秒时间" id="tmsg"/>&nbsp;&nbsp;<button id="bspeak" disabled="disabled" class="btn btn-primary" onclick="speak();">提交</button>
						</div>
					</div>
				</div>
				<div class="span4" style="padding-top:20px;">
					<div class="row">
					<div class="span4">
						<label>投票结果</label>
						<ul class="msglist" id="uvote"></ul>
					</div>
					<div class="span4" style="padding-top:5px;">
						<label>词描述</label>
						<ul class="msglist" id="vdesc"></ul>
					</div>
					</div>
				</div>
			</div>
		</div>
		<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<h3 id="myModalLabel">游戏结果</h3>
			</div>
			<div class="modal-body" style="height:360px;">
				<iframe id="ifr_g_rsl" frameborder="0" width="100%" height="100%"></iframe>
			</div>
			<div class="modal-footer">
				<button class="btn btn-primary" onclick="restart();">重新开始</button>
			</div>
		</div>
	</body>
</html>
