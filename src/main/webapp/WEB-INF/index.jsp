<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setBundle basename="main" />
<!DOCTYPE HTML>
<head>
<title><fmt:message key="indexTitle" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="style.css" rel="stylesheet" type="text/css" media="all" />
<link href="menu.css" rel="stylesheet" type="text/css" media="all" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script src="script.js" type="text/javascript"></script>
<script type="text/javascript" src="jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="nav.js"></script>
<script type="text/javascript" src="move-top.js"></script>
<script type="text/javascript" src="easing.js"></script>
<script type="text/javascript" src="nav-hover.js"></script>
<link href='http://fonts.googleapis.com/css?family=Monda'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Doppio+One'
	rel='stylesheet' type='text/css'>
<script type="text/javascript">
  $(document).ready(function($){
    $('#dc_mega-menu-orange').dcMegaMenu({rowItems:'4',speed:'fast',effect:'fade'});
  });
</script>
</head>
<body>
	<div class="wrap">
		<div class="header">
			<%@ include file="WEB-INF/header.jsp" %>
			<div class="header_bottom">
				<div class="header_bottom_left">
					<div class="section group">
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<a href="preview.jsp"> <img src="pic4.png" alt="" /></a>
							</div>
							<div class="text list_2_of_1">
								<h2><fmt:message key="iphone" /></h2>
								<p><%request.getLocale().toString();%></p>
								<div class="button">
									<span><a href="preview.jsp"><fmt:message key="addToCart" /></a></span>
								</div>
							</div>
						</div>
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<a href="preview-5.jsp"><img src="pic3.png" alt=""/ ></a>
							</div>
							<div class="text list_2_of_1">
								<h2><fmt:message key="samsung" /></h2>
								<p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>
								<div class="button">
									<span><a href="preview-5.jsp"><fmt:message key="addToCart" /></a></span>
								</div>
							</div>
						</div>
					</div>
					<div class="section group">
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<a href="preview-3.jsp"> <img src="pic3.jpg" alt="" /></a>
							</div>
							<div class="text list_2_of_1">
								<h2><fmt:message key="acer" /></h2>
								<p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>
								<div class="button">
									<span><a href="preview-3.jsp">Add to cart</a></span>
								</div>
							</div>
						</div>
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<a href="preview-6.jsp"><img src="pic1.png" alt="" /></a>
							</div>
							<div class="text list_2_of_1">
								<h2><fmt:message key="canon" /></h2>
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
					<!-- FlexSlider -->
					<section class="slider">
						<div class="flexslider">
							<ul class="slides">
								<li><img src="1.jpg" alt="" /></li>
								<li><img src="2.jpg" alt="" /></li>
								<li><img src="3.jpg" alt="" /></li>
								<li><img src="4.jpg" alt="" /></li>
							</ul>
						</div>
					</section>
					<!-- FlexSlider -->
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="main">
			<div class="content">
				<div class="content_top">
					<div class="heading">
						<h3><fmt:message key="featureProducts" /></h3>
					</div>
					<div class="sort">
						<p>
							<fmt:message key="sortBy" />: <select>
								<option>Lowest Price</option>
								<option>Highest Price</option>
								<option>Lowest Price</option>
								<option>Lowest Price</option>
								<option>Lowest Price</option>
								<option>In Stock</option>
							</select>
						</p>
					</div>
					<div class="show">
						<p>
							<fmt:message key="show" />: <select>
								<option>4</option>
								<option>8</option>
								<option>12</option>
								<option>16</option>
								<option>20</option>
								<option>In Stock</option>
							</select>
						</p>
					</div>
					<div class="page-no">
						<p><fmt:message key="resultPages" />:
						<ul>
							<li><a href="#">1</a></li>
							<li class="active"><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li>[<a href="#"> <fmt:message key="next" />>>></a>]
							</li>
						</ul>
						</p>
					</div>
					<div class="clear"></div>
				</div>
				<div class="section group">
					<div class="grid_1_of_4 images_1_of_4">
						<a href="preview-3.jsp"><img src="feature-pic1.png"
							alt="" /></a>
						<h2>Lorem Ipsum is simply</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit</p>
						<p>
							<span class="strike">$528.22</span><span class="price">$505.22</span>
						</p>
						<div class="button">
							<span><img src="cart.jpg" alt="" /><a
								href="preview-3.jsp" class="cart-button"><fmt:message key="addToCart" /></a></span>
						</div>
						<div class="button">
							<span><a href="preview-3.jsp" class="details"><fmt:message key="details" /></a></span>
						</div>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="preview-2.jsp"><img src="feature-pic2.jpg"
							alt="" /></a>
						<h2>Lorem Ipsum is simply</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit</p>
						<p>
							<span class="strike">$640.89</span><span class="price">$620.87</span>
						</p>
						<div class="button">
							<span><img src="cart.jpg" alt="" /><a href="#"
								class="cart-button"><fmt:message key="addToCart" /></a></span>
						</div>
						<div class="button">
							<span><a href="#" class="details"><fmt:message key="details" /></a></span>
						</div>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="preview-4.jsp"><img src="feature-pic3.jpg"
							alt="" /></a>
						<h2>Lorem Ipsum is simply</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit</p>
						<p>
							<span class="strike">$240.66</span><span class="price">$220.97</span>
						</p>
						<div class="button">
							<span><img src="cart.jpg" alt="" /><a
								href="preview-6.jsp" class="cart-button"><fmt:message key="addToCart" /></a></span>
						</div>
						<div class="button">
							<span><a href="#" class="details"><fmt:message key="details" /></a></span>
						</div>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<img src="feature-pic4.png" alt="" />
						<h2>Lorem Ipsum is simply</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit</p>
						<p>
							<span class="strike">$436.22</span><span class="price">$415.54</span>
						</p>
						<div class="button">
							<span><img src="cart.jpg" alt="" /><a href="#"
								class="cart-button">Add to Cart</a></span>
						</div>
						<div class="button">
							<span><a href="#" class="details">Details</a></span>
						</div>
					</div>
				</div>
				<div class="content_bottom">
					<div class="heading">
						<h3>New Products</h3>
					</div>
					<div class="sort">
						<p>
							Sort by: <select>
								<option>Lowest Price</option>
								<option>Highest Price</option>
								<option>Lowest Price</option>
								<option>Lowest Price</option>
								<option>Lowest Price</option>
								<option>In Stock</option>
							</select>
						</p>
					</div>
					<div class="show">
						<p>
							Show: <select>
								<option>4</option>
								<option>8</option>
								<option>12</option>
								<option>16</option>
								<option>20</option>
								<option>In Stock</option>
							</select>
						</p>
					</div>
					<div class="page-no">
						<p>Result Pages:
						<ul>
							<li><a href="#">1</a></li>
							<li class="active"><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li>[<a href="#"> Next>>></a>]
							</li>
						</ul>
						</p>
					</div>
					<div class="clear"></div>
				</div>
				<div class="section group">
					<div class="grid_1_of_4 images_1_of_4">
						<a href="preview-3.jsp"><img src="new-pic1.jpg" alt="" /></a>
						<div class="discount">
							<span class="percentage">40%</span>
						</div>
						<h2>Lorem Ipsum is simply</h2>
						<p>
							<span class="strike">$438.99</span><span class="price">$403.66</span>
						</p>
						<div class="button">
							<span><img src="cart.jpg" alt="" /><a
								href="preview-3.jsp" class="cart-button">Add to Cart</a></span>
						</div>
						<div class="button">
							<span><a href="preview-3.jsp" class="details">Details</a></span>
						</div>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="preview-4.jsp"><img src="new-pic2.jpg" alt="" /></a>
						<div class="discount">
							<span class="percentage">22%</span>
						</div>
						<h2>Lorem Ipsum is simply</h2>
						<p>
							<span class="strike">$667.22</span><span class="price">$621.75</span>
						</p>
						<div class="button">
							<span><img src="cart.jpg" alt="" /><a
								href="preview-4.jsp" class="cart-button">Add to Cart</a></span>
						</div>
						<div class="button">
							<span><a href="preview-4.jsp" class="details">Details</a></span>
						</div>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="preview-2.jsp"><img src="feature-pic2.jpg"
							alt="" /></a>
						<div class="discount">
							<span class="percentage">55%</span>
						</div>
						<h2>Lorem Ipsum is simply</h2>
						<p>
							<span class="strike">$457.22</span><span class="price">$428.02</span>
						</p>
						<div class="button">
							<span><img src="cart.jpg" alt="" /><a
								href="preview-2.jsp" class="cart-button">Add to Cart</a></span>
						</div>
						<div class="button">
							<span><a href="preview-2.jsp" class="details">Details</a></span>
						</div>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<img src="new-pic3.jpg" alt="" />
						<div class="discount">
							<span class="percentage">66%</span>
						</div>
						<h2>Lorem Ipsum is simply</h2>
						<p>
							<span class="strike">$643.22</span><span class="price">$457.88</span>
						</p>
						<div class="button">
							<span><img src="cart.jpg" alt="" /><a href="#"
								class="cart-button">Add to Cart</a></span>
						</div>
						<div class="button">
							<span><a href="#" class="details">Details</a></span>
						</div>
					</div>
				</div>
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
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<a href="#" id="toTop" style="display: block;"><span
		id="toTopHover" style="opacity: 1;"></span></a>
	<link href="flexslider.css" rel='stylesheet' type='text/css' />
	<script defer src="jquery.flexslider.js"></script>
	<script type="text/javascript">
								$(function(){
								  SyntaxHighlighter.all();
								});
								$(window).load(function(){
								  $('.flexslider').flexslider({
									animation: "slide",
									start: function(slider){
									  $('body').removeClass('loading');
									}
								  });
								});
							  </script>
</body>
</html>

