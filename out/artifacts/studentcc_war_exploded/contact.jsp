<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<!-- Basic -->
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<!-- Mobile Metas -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
		<!-- Site Metas -->
		<meta name="keywords" content="" />
		<meta name="description" content="" />
		<meta name="author" content="" />

		<title>Drool</title>

		<!-- bootstrap core css -->
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

		<!-- fonts style -->
		<link href="https://fonts.googleapis.com/css?family=Open+Sans|Poppins:400,700&display=swap" rel="stylesheet">
		<!-- Custom styles for this template -->
		<link href="css/style.css" rel="stylesheet" />
		<!-- responsive style -->
		<link href="css/responsive.css" rel="stylesheet" />
	</head>

	<body class="sub_page">
		<div class="hero_area ">
			<!-- header section strats -->
			<header class="header_section">
				<div class="container-fluid">
					<nav class="navbar navbar-expand-lg custom_nav-container">
						<a class="navbar-brand" href="index.jsp">
							<img src="images/logo.jpg" alt="">
						</a>
						<div class="" id="">
							<div class="User_option">
								<form class="form-inline my-2  mb-3 mb-lg-0">
									<input type="search" placeholder="Search">
									<button class="btn   my-sm-0 nav_search-btn" type="submit"></button>
								</form>
							</div>

							<div class="custom_menu-btn">
								<button onclick="openNav()">
									<span class="s-1">

									</span>
									<span class="s-2">

									</span>
									<span class="s-3">

									</span>
								</button>
							</div>
							<div id="myNav" class="overlay">
								<div class="overlay-content">
									<a href="index.jsp">首页</a>
									<a href="about.jsp">关于我们</a>
									<a href="contact.jsp">联系我们</a>
								</div>
							</div>
						</div>
					</nav>
				</div>
			</header>
			<!-- end header section -->
		</div>

		<!-- contact section -->

		<section class="contact_section layout_padding-top">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-5 offset-md-1">
						<div class="form_container">
							<div class="heading_container">
								<img src="images/heading-img.png" alt="">
								<h2>
									联系我们
								</h2>
								<p>
									请留下您的联系方式及问题
								</p>
							</div>
							<form action="">
								<div>
									<input type="text" placeholder="名字 " />
								</div>
								<div>
									<input type="text" placeholder="联系方式" />
								</div>
								<div>
									<input type="email" placeholder="邮箱" />
								</div>
								<div>
									<input type="text" class="message-box" placeholder="存在的问题" />
								</div>
								<div class="d-flex ">
									<button>
										提交
									</button>
								</div>
							</form>
						</div>
					</div>
					<div class="col-md-6 px-0">
						<div class="map_container">
							<div class="map-responsive">
								<iframe src="https://www.google.com/maps/embed/v1/place?key=AIzaSyA0s1a7phLN0iaD6-UE7m4qP-z21pH0eSc&q=Eiffel+Tower+Paris+France"
								 width="600" height="300" frameborder="0" style="border:0; width: 100%; height:100%" allowfullscreen></iframe>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>

		<!-- end contact section -->


		<!-- info section -->
		<section class="info_section ">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-lg-3">
						<div class="info_contact">
							<h5>
								CONTACT INFO
							</h5>
							<div>
								<img src="images/call.png" alt="" />
								<p>
									XXX
								</p>
							</div>
							<div>
								<img src="images/mail.png" alt="" />
								<p>
									XXX
								</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 col-lg-3">
						<div class="info_time">
							<h5>
								Opening Hours Shop
							</h5>
							<div>
								<p>
									Monday to friday
								</p>
							</div>
							<div>
								<p>
									07:00 am to 04:00 pm
								</p>
							</div>
						</div>
					</div>

					<div class="col-md-6 col-lg-3">
						<div class="info_social">
							<h5>
								social media
							</h5>
							<div class="social_container">
								<div>
									<a href="">
										<img src="images/fb.png" alt="" />
									</a>
								</div>
								<div>
									<a href="">
										<img src="images/twitter.png" alt="" />
									</a>
								</div>
								<div>
									<a href="">
										<img src="images/linkedin.png" alt="" />
									</a>
								</div>
								<div>
									<a href="">
										<img src="images/instagram.png" alt="" />
									</a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-6 col-lg-3">
						<div class="info_form pl-lg-4">
							<h5>
								Newsletter
							</h5>
							<form action="">
								<input type="text" placeholder="Enter Your Email" />
								<button type="submit">
									Subscribe
								</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</section>

		<!-- end info_section -->


		<!-- footer section -->
		<section class="container-fluid footer_section ">
			<p>
				<marquee style="width: 100%;"><span style="font-weight: bolder;font-size: 25px;color: white;">欢迎来到白杨选课系统</span></marquee>
			</p>
		</section>
		<!-- end  footer section -->


		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script>
			function openNav() {
				document.getElementById("myNav").classList.toggle("menu_width")
				document.querySelector(".custom_menu-btn").classList.toggle("menu_btn-style")
			}
		</script>

	</body>

</html>
