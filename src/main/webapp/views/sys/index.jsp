<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
// 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是 http://localhost:8080/MyApp/）:
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>后台管理</title>
	<script type="text/javascript" charset="UTF-8" src=" <%=basePath%>views/sys/js/prefixfree.min.js"></script>
	<link rel="stylesheet" type="text/css" href=" <%=basePath%>views/sys/css/base.css" media="all" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>views/sys/css/style.css" />
</head>
<body>
	<div class="page">
		<section class="demo">
			<div class="admin-panel clearfix">
				<div class="slidebar">
					<div class="logo">
						<a href=""></a>
					</div>
					<ul>
						<li><a href="#dashboard" id="targeted">dashboard</a></li>
						<li><a href="#posts">posts</a></li>
						<li><a href="#media">media</a></li>
						<li><a href="#pages">pages</a></li>
						<li><a href="#links">links</a></li>
						<li><a href="#comments">comments</a></li>
						<li><a href="#widgets">widgets</a></li>
						<li><a href="#plugins">plugins</a></li>
						<li><a href="#users">users</a></li>
						<li><a href="#tools">tools</a></li>
						<li><a href="#settings">settings</a></li>
					</ul>
				</div>
				<div class="main">
					<ul class="topbar clearfix">
						<li><a href="#">q</a></li>
						<li><a href="#">p</a></li>
						<li><a href="#">o</a></li>
						<li><a href="#">f</a></li>
						<li><a href="#">n</a></li>
					</ul>
					<div class="mainContent clearfix">
						<div id="dashboard">
							<h2 class="header"><span class="icon"></span>Dashboard</h2>
							<div class="monitor">
								<h4>Right Now</h4>
								<div class="clearfix">
									<ul class="content">
										<li>content</li>
										<li class="posts"><span class="count">179</span><a href="">posts</a></li>
										<li class="pages"><span class="count">13</span><a href="">pages</a></li>
										<li class="categories"><span class="count">21</span><a href="">categories</a></li>
										<li class="tags"><span class="count">305</span><a href="">tags</a></li>
									</ul>
									<ul class="discussions">
										<li>discussions</li>
										<li class="comments"><span class="count">353</span><a href="">comments</a></li>
										<li class="approved"><span class="count">319</span><a href="">approved</a></li>
										<li class="pending"><span class="count">0</span><a href="">pending</a></li>
										<li class="spam"><span class="count">34</span><a href="">spam</a></li>
									</ul>
								</div>
								<p>Theme <a href="">Twenty Eleven</a> with <a href="">3 widgets</a></p>
							</div>
							<div class="quick-press">
								<h4>Quick Press</h4>
								<form action="" method="post">
									<input type="text" name="title" placeholder="Title"/>
									<input type="text" name="content" placeholder="Content"/>
									<input type="text" name="tags" placeholder="Tags"/>
									<button type="button" class="save">l</button>
									<button type="button" class="delet">m</button>
									<button type="submit" class="submit" name="submit">Publish</button>
								</form>
							</div>
						</div>
						<div id="posts">
							<h2 class="header">posts</h2>
						</div>
						<div id="media">
							<h2 class="header">media</h2>
						</div>
						<div id="pages">
							<h2 class="header">pages</h2>
						</div>
						<div id="links">
							<h2 class="header">links</h2>
						</div>
						<div id="comments">
							<h2 class="header">comments</h2>
						</div>
						<div id="widgets">
							<h2 class="header">widgets</h2>
						</div>
						<div id="plugins">
							<h2 class="header">plugins</h2>
						</div>
						<div id="users">
							<h2 class="header">users</h2>
							<div class="quick-press">
								<h4>Quick Register</h4>
								<form action="register_add" method="post">
									<input type="text" name="user.username" placeholder="username"/>
									<input type="text" name="user.password" placeholder="password"/>
									<input type="text" name="confirm"	placeholder="confirm"/>
									<button type="button" class="save">l</button>
									<button type="button" class="delet">m</button>
									<button type="submit" class="submit" name="submit">Submit</button>
								</form>
							</div>							
						</div>
						<div id="tools">
							<h2 class="header">tools</h2>
						</div>
						<div id="settings">
							<h2 class="header">settings</h2>
						</div>
					</div>
					<ul class="statusbar">
						<li><a href=""></a></li>
						<li><a href=""></a></li>
						<li class="profiles-setting"><a href="">s</a></li>
						<li class="logout"><a href="">k</a></li>
					</ul>
				</div>
			</div>
			<script type="text/javascript">
				(function() {
					var initTarget = document.getElementById("targeted");
					initTarget.click();
				})();
			</script>
		</section>

	</div>
<div style="text-align:center;clear:both">
<p></p>
<p><a href="#"  target="_blank">Try Everything</a></p>
</div>	
</body>
</html>