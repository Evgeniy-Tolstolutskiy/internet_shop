<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<head>
<title>Free Smart Store Website Template | Contact :: w3layouts</title>
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
<script type="text/javascript">
  $(document).ready(function($){
    $('#dc_mega-menu-orange').dcMegaMenu({rowItems:'4',speed:'fast',effect:'fade'});
  });
</script>
</head>
<body>
	<div class="wrap">
		<div class="header">
			<div class="header_top">
				<div class="logo">
					<a href="index.jsp"><img src="logo.png" alt="" /></a>
				</div>
				<div class="header_top_right">
					<div class="search_box">
						<form>
							<input type="text" value="Search for Products"
								onfocus="this.value = '';"
								onblur="if (this.value == '') {this.value = 'Search for Products';}"><input
								type="submit" value="SEARCH">
						</form>
					</div>
					<div class="shopping_cart">
						<div class="cart">
							<a href="#" title="View my shopping cart" rel="nofollow"> <strong
								class="opencart"> </strong> <span class="cart_title">Cart</span>
								<span class="no_product">(empty)</span>
							</a>
						</div>
					</div>
					<div class="languages">
						<div id="language" class="wrapper-dropdown" tabindex="1">
							EN <strong class="opencart"> </strong>
							<ul class="dropdown languges">
								<li><a href="#" title="Français"> <span><img
											src="gb.png" alt="en" width="26" height="26"></span><span
										class="lang">English</span>
								</a></li>
								<li><a href="#" title="Français"> <span><img
											src="au.png" alt="fr" width="26" height="26"></span><span
										class="lang">Français</span>
								</a></li>
								<li><a href="#" title="Español"> <span><img
											src="bm.png" alt="es" width="26" height="26"></span><span
										class="lang">Español</span>
								</a></li>
								<li><a href="#" title="Deutsch"> <span><img
											src="ck.png" alt="de" width="26" height="26"></span><span
										class="lang">Deutsch</span>
								</a></li>
								<li><a href="$" title="Russian"> <span><img
											src="cu.png" alt="ru" width="26" height="26"></span><span
										class="lang">Russian</span>
								</a></li>
							</ul>
						</div>
						<script type="text/javascript">
			function DropDown(el) {
				this.dd = el;
				this.initEvents();
			}
			DropDown.prototype = {
				initEvents : function() {
					var obj = this;

					obj.dd.on('click', function(event){
						$(this).toggleClass('active');
						event.stopPropagation();
					});	
				}
			}

			$(function() {

				var dd = new DropDown( $('#language') );

				$(document).click(function() {
					// all dropdowns
					$('.wrapper-dropdown').removeClass('active');
				});

			});

		</script>
					</div>
					<div class="currency">
						<div id="currency" class="wrapper-dropdown" tabindex="1">
							$ <strong class="opencart"> </strong>
							<ul class="dropdown">
								<li><a href="#"><span>$</span>Dollar</a></li>
								<li><a href="#"><span>€</span>Euro</a></li>
							</ul>
						</div>
						<script type="text/javascript">
			function DropDown(el) {
				this.dd = el;
				this.initEvents();
			}
			DropDown.prototype = {
				initEvents : function() {
					var obj = this;

					obj.dd.on('click', function(event){
						$(this).toggleClass('active');
						event.stopPropagation();
					});	
				}
			}

			$(function() {

				var dd = new DropDown( $('#currency') );

				$(document).click(function() {
					// all dropdowns
					$('.wrapper-dropdown').removeClass('active');
				});

			});

		</script>
					</div>
					<div class="login">
						<span><a href="login.jsp"><img src="login.png"
								alt="" title="login" /></a></span>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
			<div class="menu">
				<ul id="dc_mega-menu-orange" class="dc_mm-orange">
					<li><a href="index.jsp">Home</a></li>
					<li><a href="products.jsp">Products</a>
						<ul>
							<li><a href="products.jsp">Mobile Phones</a>
								<ul>
									<li><a href="preview-2.jsp">Product 1</a></li>
									<li><a href="preview-3.jsp">Product 2</a></li>
									<li><a href="#">Product 3</a></li>
									<li><a href="#">Product 4</a></li>
									<li><a href="preview-6.jsp">Product 5</a></li>
									<li><a href="#">Product 6</a></li>
								</ul></li>
							<li><a href="products.jsp">Desktop</a>
								<ul>
									<li><a href="preview.jsp">Product 1</a></li>
									<li><a href="preview-5.jsp">Product 2</a></li>
									<li><a href="preview-3.jsp">Product 3</a></li>
									<li><a href="#">Product 4</a></li>
									<li><a href="#">Product 5</a></li>
									<li><a href="#">Product 6</a></li>
								</ul></li>
							<li><a href="products.jsp">Laptop</a>
								<ul>
									<li><a href="preview-2.jsp">Product 10</a></li>
									<li><a href="preview-5.jsp">Product 11</a></li>
									<li><a href="#">Product 12</a></li>
									<li><a href="#">Product 13</a></li>
								</ul></li>
							<li><a href="#">Accessories</a>
								<ul>
									<li><a href="#">Product 14</a></li>
									<li><a href="#">Product 15</a></li>
								</ul></li>
							<li><a href="#">Software</a>
								<ul>
									<li><a href="#">Product 16</a></li>
									<li><a href="#">Product 17</a></li>
									<li><a href="#">Product 18</a></li>
									<li><a href="#">Product 19</a></li>
								</ul></li>
							<li><a href="#">Sports & Fitness</a>
								<ul>
									<li><a href="#">Product 16</a></li>
									<li><a href="#">Product 17</a></li>
									<li><a href="#">Product 18</a></li>
									<li><a href="#">Product 19</a></li>
								</ul></li>
							<li><a href="#">Footwear</a>
								<ul>
									<li><a href="#">Product 16</a></li>
									<li><a href="#">Product 17</a></li>
									<li><a href="#">Product 18</a></li>
									<li><a href="#">Product 19</a></li>
								</ul></li>
							<li><a href="#">Jewellery</a>
								<ul>
									<li><a href="#">Product 16</a></li>
									<li><a href="#">Product 17</a></li>
									<li><a href="#">Product 18</a></li>
									<li><a href="#">Product 19</a></li>
								</ul></li>
							<li><a href="#">Clothing</a>
								<ul>
									<li><a href="#">Product 16</a></li>
									<li><a href="#">Product 17</a></li>
									<li><a href="#">Product 18</a></li>
									<li><a href="#">Product 19</a></li>
								</ul></li>
							<li><a href="#">Home Decor & Kitchen</a>
								<ul>
									<li><a href="#">Product 16</a></li>
									<li><a href="#">Product 17</a></li>
									<li><a href="#">Product 18</a></li>
									<li><a href="#">Product 19</a></li>
								</ul></li>
							<li><a href="#">Beauty & Healthcare</a>
								<ul>
									<li><a href="#">Product 16</a></li>
									<li><a href="#">Product 17</a></li>
									<li><a href="#">Product 18</a></li>
									<li><a href="#">Product 19</a></li>
								</ul></li>
							<li><a href="#">Toys, Kids & Babies</a>
								<ul>
									<li><a href="#">Product 16</a></li>
									<li><a href="#">Product 17</a></li>
									<li><a href="#">Product 18</a></li>
									<li><a href="#">Product 19</a></li>
								</ul></li>
						</ul></li>
					<li><a href="products.jsp">Top Brands</a>
						<ul>
							<li><a href="products.jsp">Brand Name 1</a></li>
							<li><a href="products.jsp">Brand Name 2</a></li>
							<li><a href="products.jsp">Brand Name 3</a></li>
							<li><a href="#">Brand Name 4</a></li>
							<li><a href="#">Brand Name 5</a></li>
							<li><a href="#">Brand Name 6</a></li>
							<li><a href="#">Brand Name 7</a></li>
							<li><a href="#">Brand Name 8</a></li>
							<li><a href="#">Brand Name 9</a></li>
							<li><a href="#">Brand Name 10</a></li>
						</ul></li>
					<li><a href="faq.jsp">Services</a>
						<ul>
							<li><a href="#">Service 1</a>
								<ul>
									<li><a href="#">Service Detail A</a></li>
									<li><a href="#">Service Detail B</a></li>
								</ul></li>
							<li><a href="#">Service 2</a>
								<ul>
									<li><a href="#">Service Detail C</a></li>
								</ul></li>
							<li><a href="#">Service 3</a>
								<ul>
									<li><a href="#">Service Detail D</a></li>
									<li><a href="#">Service Detail E</a></li>
									<li><a href="#">Service Detail F</a></li>
								</ul></li>
							<li><a href="#">Service 4</a></li>
						</ul></li>
					<li><a href="about.jsp">About</a></li>
					<li><a href="#">Delivery</a></li>
					<li><a href="faq.jsp">FAQS</a></li>
					<li><a href="contact.jsp">Contact</a></li>
					<div class="clear"></div>
				</ul>
			</div>
		</div>
		<div class="main">
			<div class="content">
				<div class="support">
					<div class="support_desc">
						<h3>Live Support</h3>
						<p>
							<span>24 hours | 7 days a week | 365 days a year
								&nbsp;&nbsp; Live Technical Support</span>
						</p>
						<p>It is a long established fact that a reader will be
							distracted by the readable content of a page when looking at its
							layout. The point of using Lorem Ipsum is that it has a
							more-or-less normal distribution of letters.There are many
							variations of passages of Lorem Ipsum available, but the majority
							have suffered alteration in some form, by injected humour, or
							randomised words which don't look even slightly believable. If
							you are going to use a passage of Lorem Ipsum, you need to be
							sure there isn't anything embarrassing hidden in the middle of
							text.</p>
					</div>
					<img src="contact.png" alt="" />
					<div class="clear"></div>
				</div>
				<div class="section group">
					<div class="col span_2_of_3">
						<div class="contact-form">
							<h2>Contact Us</h2>
							<form>
								<div>
									<span><label>NAME</label></span> <span><input
										type="text" value=""></span>
								</div>
								<div>
									<span><label>E-MAIL</label></span> <span><input
										type="text" value=""></span>
								</div>
								<div>
									<span><label>MOBILE.NO</label></span> <span><input
										type="text" value=""></span>
								</div>
								<div>
									<span><label>SUBJECT</label></span> <span><textarea> </textarea></span>
								</div>
								<div>
									<span><input type="submit" value="SUBMIT"></span>
								</div>
							</form>
						</div>
					</div>
					<div class="col span_1_of_3">
						<div class="contact_info">
							<h2>Find Us Here</h2>
							<div class="map">
								<iframe width="100%" height="175" frameborder="0" scrolling="no"
									marginheight="0" marginwidth="0"
									src="https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed"></iframe>
								<br>
								<small><a
									href="https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265"
									style="color: #666; text-align: left; font-size: 12px">View
										Larger Map</a></small>
							</div>
						</div>
						<div class="company_address">
							<h2>Company Information :</h2>
							<p>500 Lorem Ipsum Dolor Sit,</p>
							<p>22-56-2-9 Sit Amet, Lorem,</p>
							<p>USA</p>
							<p>Phone:(00) 222 666 444</p>
							<p>Fax: (000) 000 00 00 0</p>
							<p>
								Email: <span>info@mycompany.com</span>
							</p>
							<p>
								Follow on: <span>Facebook</span>, <span>Twitter</span>
							</p>
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
</body>
</html>

