<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setBundle basename="main" />
<!DOCTYPE HTML>
<html>
<head>
<title><fmt:message key="loginTitle" /></title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" media="all" />
<link href="slider.css" rel="stylesheet" type="text/css" media="all" />
<link href="menu.css" rel="stylesheet" type="text/css" media="all" />
<link href='http://fonts.googleapis.com/css?family=Doppio+One'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Monda'
	rel='stylesheet' type='text/css'>
<script type="text/javascript" src="jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="move-top.js"></script>
<script type="text/javascript" src="easing.js"></script>
<script type="text/javascript" src="nav.js"></script>
<script type="text/javascript" src="nav-hover.js"></script>
<script type="text/javascript" src="jqueryRegistration.js"></script>
<script type="text/javascript">
	$(document).ready(function($) {
		$('#dc_mega-menu-orange').dcMegaMenu({
			rowItems : '4',
			speed : 'fast',
			effect : 'fade'
		});
	});
</script>
</head>
<body>
	<div class="wrap">
		<div class="header">
			<%@ include file="header.jsp"%>
			<div class="header_bottom">
				<div class="header_bottom_left">
					<div class="section group">
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<a href="preview.jsp"> <img src="pic4.png" alt=""></a>
							</div>
							<div class="text list_2_of_1">
								<h2>Iphone</h2>
								<p>Lorem ipsum dolor sit amet sed do eiusmod.</p>
								<div class="button">
									<span><a href="preview.jsp">Add to cart</a></span>
								</div>
							</div>
						</div>
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<a href="preview-5.jsp"><img src="pic3.png" alt=""></a>
							</div>
							<div class="text list_2_of_1">
								<h2>Sansung</h2>
								<p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>
								<div class="button">
									<span><a href="preview-5.jsp">Add to cart</a></span>
								</div>
							</div>
						</div>
					</div>
					<div class="section group">
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<a href="preview-3.jsp"> <img src="pic3.jpg" alt=""></a>
							</div>
							<div class="text list_2_of_1">
								<h2>Acer</h2>
								<p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>
								<div class="button">
									<span><a href="preview-3.jsp">Add to cart</a></span>
								</div>
							</div>
						</div>
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<a href="preview-6.jsp"><img src="pic1.png" alt=""></a>
							</div>
							<div class="text list_2_of_1">
								<h2>Canon</h2>
								<p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>
								<div class="button">
									<span><a href="preview-6.jsp">Add to cart</a></span>
								</div>
							</div>
						</div>
					</div>
					<div class="clear"></div>
				</div>
				<div class="header_bottom_right_images">
					<div id="slideshow">
						<ul class="slides">
							<li><a href="preview.jsp"><canvas width="605"
										height="342"></canvas> <img src="1.jpg"
									alt="Marsa Alam underawter close up" height="342px"></a></li>
							<li><a href="preview-2.jsp"><canvas width="605"
										height="342"></canvas> <img src="2.jpg"
									alt="Turrimetta Beach - Dawn" height="342px"></a></li>
							<li><a href="preview-6.jsp"><canvas width="605"
										height="342"></canvas> <img src="3.jpg"
									alt="Power Station" height="342px"></a></li>
							<li><a href="preview-3.jsp"><canvas width="605"
										height="342"></canvas> <img src="4.jpg"
									alt="Colors of Nature" height="342px"></a></li>
						</ul>
						<span class="arrow previous"></span> <span class="arrow next"></span>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="main">
			<div class="content">
				<tags:signin />
				<div class="register_account">
					<h3><fmt:message key="registerNewAccount" /></h3>
					<form id="registrationForm" action="login" method="post">
						<table>
							<tbody>
								<tr>
									<td>
										<div>
											<input type="text" id="name" name="name" required
												value="<fmt:message key="name" />" onfocus="this.value = '';"
												onblur="if (this.value == '') {this.value = '<fmt:message key="name" />';}"
												regex="[A-Z][a-z]{1,20}" />
										</div>
										<div>
											<input type="text" id="companyName" name="companyName"
												value="<fmt:message key="companyName" />" onfocus="this.value = '';"
												onblur="if (this.value == '') {this.value = '<fmt:message key="companyName" />';}"
												regex="[A-Z][a-z]{1,20}" />
										</div>
										<div>
											<input type="text" id="email" name="email" required
												value="<fmt:message key="email" />" onfocus="this.value = '';"
												onblur="if (this.value == '') {this.value = '<fmt:message key="email" />';}"
												regex="\w{1,20}@[a-z]+\.(com|ua|ru)" />
										</div>
										<div>
											<input type="text" id="password" name="password" required
												value="<fmt:message key="password" />" onfocus="this.value = '';"
												onblur="if (this.value == '') {this.value = '<fmt:message key="password" />';}"
												regex="\w{12,}" />
										</div>
									</td>
									<td>
										<div>
											<input type="text" id="address" name="address"
												value="<fmt:message key="address" />" onfocus="this.value = '';"
												onblur="if (this.value == '') {this.value = '<fmt:message key="address" />';}"
												regex="[A-Z][a-z]{1,20}" />
										</div>
										<div>
											<select id="country" name="country" required
												onchange="change_country(this.value)"
												class="frm-field required">
												<option value="null"><fmt:message key="selectCountry" /></option>
												<option value="AX"><fmt:message key="russia" /></option>
												<option value="AF"><fmt:message key="ukraine" /></option>
												<option value="AL"><fmt:message key="usa" /></option>
												<option value="DZ"><fmt:message key="australia" /></option>
											</select>
										</div>
										<div>
											<input type="text" id="city" name="city" value="<fmt:message key="city" />"
												onfocus="this.value = '';"
												onblur="if (this.value == '') {this.value = '<fmt:message key="city" />';}"
												regex="\w{2,20}" />
										</div>
										<div>
											<input type="text" id="numCode" name="numCode" value=""
												class="code" regex="[0-9]+" /> - <input type="text"
												id="phoneNumber" name="phoneNumber" value="" regex="[0-9]+"
												class="number" />
											<p><fmt:message key="countryCodePlusPhoneNumber" /></p>
										</div>
										<div>
											<tags:captcha />
										</div>
										<div>
											<input type="file" name="image" accept="image/jpeg,image/png">
										</div>
									</td>
								</tr>
							</tbody>
						</table>
						<div>
							<input type="submit" value="Create Account" class="grey"></input>
						</div>
						<p class="terms">
							By clicking 'Create Account' you agree to the <a href="#">Terms
								&amp; Conditions</a>.
						</p>
						<div class="clear"></div>
					</form>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<div class="footer">
		<div class="wrapper">
			<div class="section group">
				<div class="col_1_of_4 span_1_of_4">
					<h4>Information</h4>
					<ul>
						<li><a href="#">About Us</a></li>
						<li><a href="#">Customer Service</a></li>
						<li><a href="#"><span>Advanced Search</span></a></li>
						<li><a href="#">Orders and Returns</a></li>
						<li><a href="#"><span>Contact Us</span></a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h4>Why buy from us</h4>
					<ul>
						<li><a href="about.jsp">About Us</a></li>
						<li><a href="faq.jsp">Customer Service</a></li>
						<li><a href="#">Privacy Policy</a></li>
						<li><a href="contact.jsp"><span>Site Map</span></a></li>
						<li><a href="preview-2.jsp"><span>Search Terms</span></a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h4>My account</h4>
					<ul>
						<li><a href="contact.jsp">Sign In</a></li>
						<li><a href="index.jsp">View Cart</a></li>
						<li><a href="#">My Wishlist</a></li>
						<li><a href="#">Track My Order</a></li>
						<li><a href="faq.jsp">Help</a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h4>Contact</h4>
					<ul>
						<li><span>+91-123-456789</span></li>
						<li><span>+00-123-000000</span></li>
					</ul>
					<div class="social-icons">
						<h4>Follow Us</h4>
						<ul>
							<li class="facebook"><a href="#" target="_blank"> </a></li>
							<li class="twitter"><a href="#" target="_blank"> </a></li>
							<li class="googleplus"><a href="#" target="_blank"> </a></li>
							<li class="contact"><a href="#" target="_blank"> </a></li>
							<div class="clear"></div>
						</ul>
					</div>
				</div>
			</div>
			<div class="copy_right">
				<p>
					Compant Name © All rights Reseverd | Design by <a
						href="http://w3layouts.com">W3Layouts</a>
				</p>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
					containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			 */

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<a href="#" id="toTop" style="display: block;"><span
		id="toTopHover" style="opacity: 1;"></span></a>
</body>
</html>

