<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
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
					<a href="basket" title="View my shopping cart" rel="nofollow"> <strong
						class="opencart"> </strong> <span class="cart_title">Cart</span> 
						<!--<span class="no_product">(empty)</span>-->
					</a>
				</div>
			</div>
			<div class="currency" title="currency">
				<div id="currency" class="wrapper-dropdown" tabindex="1">
					$ <strong class="opencart"> </strong>
					<ul class="dropdown">
						<li><a href="#"><span>$</span><fmt:message key="dollar" /></a></li>
						<li><a href="#"><span>€</span><fmt:message key="euro" /></a></li>
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

							obj.dd.on('click', function(event) {
								$(this).toggleClass('active');
								event.stopPropagation();
							});
						}
					}

					$(function() {

						var dd = new DropDown($('#currency'));

						$(document).click(function() {
							// all dropdowns
							$('.wrapper-dropdown').removeClass('active');
						});

					});
				</script>
			</div>
			<div class="login">
				<span><a href="login"><img src="login.png" alt=""
						title="login" /></a></span>
			</div>
			<div class="clear"></div>
		</div>
		<tags:language />
		<div class="clear"></div>
	</div>
	<div class="menu">
		<ul id="dc_mega-menu-orange" class="dc_mm-orange">
			<li><a href="index.jsp"><fmt:message key="home" /></a></li>
			<li><a href="GoodsPageServlet"><fmt:message key="products" /></a>
				<ul>
					<li><a href="products.jsp"><fmt:message key="mobilePhones" /></a>
						<ul>
							<li><a href="preview-2.jsp">Product 1</a></li>
							<li><a href="preview-3.jsp">Product 2</a></li>
							<li><a href="#">Product 3</a></li>
							<li><a href="#">Product 4</a></li>
							<li><a href="preview-6.jsp">Product 5</a></li>
							<li><a href="#">Product 6</a></li>
						</ul></li>
					<li><a href="products.jsp"><fmt:message key="desktop" /></a>
						<ul>
							<li><a href="preview.jsp">Product 1</a></li>
							<li><a href="preview-5.jsp">Product 2</a></li>
							<li><a href="preview-3.jsp">Product 3</a></li>
							<li><a href="#">Product 4</a></li>
							<li><a href="#">Product 5</a></li>
							<li><a href="#">Product 6</a></li>
						</ul></li>
					<li><a href="products.jsp"><fmt:message key="laptop" /></a>
						<ul>
							<li><a href="preview-2.jsp">Product 10</a></li>
							<li><a href="preview-5.jsp">Product 11</a></li>
							<li><a href="#">Product 12</a></li>
							<li><a href="#">Product 13</a></li>
						</ul></li>
					<li><a href="#"><fmt:message key="accessorities" /></a>
						<ul>
							<li><a href="#">Product 14</a></li>
							<li><a href="#">Product 15</a></li>
						</ul></li>
					<li><a href="#"><fmt:message key="software" /></a>
						<ul>
							<li><a href="#">Product 16</a></li>
							<li><a href="#">Product 17</a></li>
							<li><a href="#">Product 18</a></li>
							<li><a href="#">Product 19</a></li>
						</ul></li>
					<li><a href="#"><fmt:message key="sportAndFitness" /></a>
						<ul>
							<li><a href="#">Product 16</a></li>
							<li><a href="#">Product 17</a></li>
							<li><a href="#">Product 18</a></li>
							<li><a href="#">Product 19</a></li>
						</ul></li>
					<li><a href="#"><fmt:message key="footwear" /></a>
						<ul>
							<li><a href="#">Product 16</a></li>
							<li><a href="#">Product 17</a></li>
							<li><a href="#">Product 18</a></li>
							<li><a href="#">Product 19</a></li>
						</ul></li>
					<li><a href="#"><fmt:message key="jewellery" /></a>
						<ul>
							<li><a href="#">Product 16</a></li>
							<li><a href="#">Product 17</a></li>
							<li><a href="#">Product 18</a></li>
							<li><a href="#">Product 19</a></li>
						</ul></li>
					<li><a href="#"><fmt:message key="clothing" /></a>
						<ul>
							<li><a href="#">Product 16</a></li>
							<li><a href="#">Product 17</a></li>
							<li><a href="#">Product 18</a></li>
							<li><a href="#">Product 19</a></li>
						</ul></li>
					<li><a href="#"><fmt:message key="homeDecorAndKitchen" /></a>
						<ul>
							<li><a href="#">Product 16</a></li>
							<li><a href="#">Product 17</a></li>
							<li><a href="#">Product 18</a></li>
							<li><a href="#">Product 19</a></li>
						</ul></li>
					<li><a href="#"><fmt:message key="beautyAndHealthCare" /></a>
						<ul>
							<li><a href="#">Product 16</a></li>
							<li><a href="#">Product 17</a></li>
							<li><a href="#">Product 18</a></li>
							<li><a href="#">Product 19</a></li>
						</ul></li>
					<li><a href="#"><fmt:message key="toysAndKidsAndBabies" /></a>
						<ul>
							<li><a href="#">Product 16</a></li>
							<li><a href="#">Product 17</a></li>
							<li><a href="#">Product 18</a></li>
							<li><a href="#">Product 19</a></li>
						</ul></li>
				</ul></li>
			<li><a href="products.jsp"><fmt:message key="topBrands" /></a>
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
			<li><a href="faq.jsp"><fmt:message key="services" /></a>
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
			<li><a href="about.jsp"><fmt:message key="about" /></a></li>
			<li><a href="#"><fmt:message key="delivery" /></a></li>
			<li><a href="faq.jsp"><fmt:message key="faqs" /></a></li>
			<li><a href="contact.jsp"><fmt:message key="contacts" /></a></li>
			<div class="clear"></div>
		</ul>
	</div>
</body>
</html>