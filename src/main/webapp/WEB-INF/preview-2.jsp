<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<head>
<title>Free Smart Store Website Template | Preview :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="style.css" rel="stylesheet" type="text/css" media="all" />
<link href="slider.css" rel="stylesheet" type="text/css" media="all" />
<link href="menu.css" rel="stylesheet" type="text/css" media="all" />
<link href='http://fonts.googleapis.com/css?family=Doppio+One'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Monda'
	rel='stylesheet' type='text/css'>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script src="script.js" type="text/javascript"></script>
<script type="text/javascript" src="jquery-1.7.2.min.js"></script>
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
				<div class="content_top">
					<div class="back-links">
						<p>
							<a href="index.jsp">Home</a> >> <a href="#">Electronics</a>
						</p>
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
					<div class="cont-desc span_1_of_2">
						<div class="grid images_3_of_2">
							<img src="feature-pic2.jpg" alt="" />
						</div>
						<div class="desc span_3_of_2">
							<h2>Lorem Ipsum is simply dummy text</h2>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore. Lorem ipsum dolor
								sit amet, consectetur adipisicing elit, sed do eiusmod tempor
								incididunt ut labore.</p>
							<div class="price">
								<p>
									Price: <span>$500</span>
								</p>
							</div>
							<div class="available">
								<p>Available Options :</p>
								<ul>
									<li>Color: <select>
											<option>Silver</option>
											<option>Black</option>
											<option>Dark Black</option>
											<option>Red</option>
									</select></li>
									<li>Size:<select>
											<option>Large</option>
											<option>Medium</option>
											<option>small</option>
											<option>Large</option>
											<option>small</option>
									</select></li>
									<li>Quality:<select>
											<option>1</option>
											<option>2</option>
											<option>3</option>
											<option>4</option>
											<option>5</option>
									</select></li>
								</ul>
							</div>
							<div class="share">
								<p>Share Product :</p>
								<ul>
									<li><a href="#"><img src="youtube.png" alt=""></a></li>
									<li><a href="#"><img src="facebook.png" alt=""></a></li>
									<li><a href="#"><img src="twitter.png" alt=""></a></li>
									<li><a href="#"><img src="linkedin.png" alt=""></a></li>
								</ul>
							</div>
							<div class="add-cart">
								<div class="rating">
									<p>
										Rating:<img src="rating.png" alt="" /><span>[3
											of 5 Stars]</span>
									</p>
								</div>
								<div class="button">
									<span><a href="#">Add to Cart</a></span>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						<div class="product-desc">
							<h2>Product Details</h2>
							<p>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry. Lorem Ipsum has been the industry's
								standard dummy text ever since the 1500s, when an unknown
								printer took a galley of type and scrambled it to make a type
								specimen book. It has survived not only five centuries, but also
								the leap into electronic typesetting, remaining essentially
								unchanged.</p>
							<p>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry. Lorem Ipsum has been the industry's
								standard dummy text ever since the 1500s, when an unknown
								printer took a galley of type and scrambled it to make a type
								specimen book. It has survived not only five centuries, but also
								the leap into electronic typesetting, remaining essentially
								unchanged.</p>
						</div>
						<div class="product-tags">
							<h2>Product Tags</h2>
							<h4>Add Your Tags:</h4>
							<div class="input-box">
								<input type="text" value="" />
							</div>
							<div class="button">
								<span><a href="#">Add Tags</a></span>
							</div>
						</div>
					</div>
					<div class="rightsidebar span_3_of_1">
						<h2>CATEGORIES</h2>
						<ul>
							<li><a href="#">Mobile Phones</a></li>
							<li><a href="#">Desktop</a></li>
							<li><a href="#">Laptop</a></li>
							<li><a href="#">Accessories</a></li>
							<li><a href="#">Software</a></li>
							<li><a href="#">Sports & Fitness</a></li>
							<li><a href="#">Footwear</a></li>
							<li><a href="#">Jewellery</a></li>
							<li><a href="#">Clothing</a></li>
							<li><a href="#">Home Decor & Kitchen</a></li>
							<li><a href="#">Beauty & Healthcare</a></li>
							<li><a href="#">Toys, Kids & Babies</a></li>
						</ul>
						<div class="subscribe">
							<h2>Newsletters Signup</h2>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod.......</p>
							<div class="signup">
								<form>
									<input type="text" value="E-mail address"
										onfocus="this.value = '';"
										onblur="if (this.value == '') {this.value = 'E-mail address';}"><input
										type="submit" value="Sign up">
								</form>
							</div>
						</div>
						<div class="community-poll">
							<h2>Community POll</h2>
							<p>What is the main reason for you to purchase products
								online?</p>
							<div class="poll">
								<form>
									<ul>
										<li><input type="radio" name="vote" class="radio"
											value="1"> <span class="label"><label>More
													convenient shipping and delivery </label></span></li>
										<li><input type="radio" name="vote" class="radio"
											value="2"> <span class="label"><label
												for="vote_2">Lower price</label></span></li>
										<li><input type="radio" name="vote" class="radio"
											value="3"> <span class="label"><label
												for="vote_3">Bigger choice</label></span></li>
										<li><input type="radio" name="vote" class="radio"
											value="5"> <span class="label"><label
												for="vote_5">Payments security </label></span></li>
										<li><input type="radio" name="vote" class="radio"
											value="6"> <span class="label"><label
												for="vote_6">30-day Money Back Guarantee </label></span></li>
										<li><input type="radio" name="vote" class="radio"
											value="7"> <span class="label"><label
												for="vote_7">Other.</label></span></li>
									</ul>
								</form>
							</div>
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
</body>
</html>
