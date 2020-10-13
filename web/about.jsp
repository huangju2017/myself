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
						<a class="navbar-brand" href="index.html">
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

		<!-- about section -->

		<section class="about_section layout_padding">
			<div class="container">
				<div class="detail-box">
					<div class="heading_container">
						<img src="images/heading-img.png" alt="">
						<h2>
							关于我们
						</h2>
					</div>
					<p>
						我们从别人的发明中享受了很大的利益<br>我们也应该乐于有机会以我们的任何一种发明为别人服务<br>而这种事我们应该自愿和慷慨的去做
					</p>
					<!-- <div class="btn-box">
						<a href="">
							<span>
								更多
							</span>
							<img src="images/link-arrow.png" alt="">
						</a>
					</div> -->
				</div>
			</div>
		</section>

		<!-- end about section -->

		<!-- animal section -->

		<section class="animal_section layout_padding">
			<div class="container">
				<div class="animal_container">
					<div class="box b1">
						<div class="img-box">
							<img src="images/dog.jpg" alt="">
						</div>
						<div class="detail-box">
							<h5>
								李皓
							</h5>
							<!-- <p>
                It is a long established fact that a reader will be distracted by
              </p> -->
						</div>
					</div>
					<div class="box b2">
						<div class="img-box">
							<img src="images/bird.jpg" alt="">
						</div>
						<div class="detail-box">
							<h5>
								施松松
							</h5>
							<!-- <p>
                It is a long established fact that a reader will be distracted by
              </p> -->
						</div>
					</div>
					<div class="box b1">
						<div class="img-box">
							<img src="images/fish.jpg" alt="">
						</div>
						<div class="detail-box">
							<h5>
								黄榉
							</h5>
							<!-- <p>
                It is a long established fact that a reader will be distracted by
              </p> -->
						</div>
					</div>
					<div class="box b2">
						<div class="img-box">
							<img src="images/cat.jpg" alt="">
						</div>
						<div class="detail-box">
							<h5>
								刘莎莎
							</h5>
							<!-- <p>
                It is a long established fact that a reader will be distracted by
              </p> -->
						</div>
					</div>
					<div class="box b1">
						<div class="img-box">
							<img src="images/koala.jpg" alt="">
						</div>
						<div class="detail-box">
							<h5>
								董玉兵
							</h5>
							<!-- <p>
  		      It is a long established fact that a reader will be distracted by
  		    </p> -->
						</div>
					</div>
				</div>
			</div>
		</section>

		<!-- end animal section -->

		<!-- us section -->

		


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