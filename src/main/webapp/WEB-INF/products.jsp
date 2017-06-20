<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setBundle basename="main" />
<head>
<title><fmt:message key="productsTitle" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="style.css" rel="stylesheet" type="text/css" media="all" />
<link href="slider.css" rel="stylesheet" type="text/css" media="all" />
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
	$(document).ready(function($) {
		$('#dc_mega-menu-orange').dcMegaMenu({
			rowItems : '4',
			speed : 'fast',
			effect : 'fade'
		});
	});
	
	function addToBasket(id){
		var xhttp;
		xhttp = new XMLHttpRequest();
		xhttp.open("GET", "addToBasket?goodId="+id, true);
		xhttp.send();
	}
</script>
</head>
<body>
	<div class="wrap">
		<div class="header">
			<%@ include file="header.jsp"%>
		</div>
		<div class="main">
			<div class="content">
				<div class="content_top">
					<div class="heading">
						<h3><fmt:message key="featureProducts" /></h3>
					</div>
					<form action="GoodsPageServlet">
						<div class="sort">
							<p>
								<fmt:message key="sortBy" />: <select name="orderBy">
									<option ${orderBy.equals("Price asc")?"selected":""}
										value="Lowest Price"><fmt:message key="priceAsc" /></option>
									<option ${orderBy.equals("Price desc")?"selected":""}
										value="Highest Price"><fmt:message key="priceDesc" /></option>
									<option ${orderBy.equals("Name asc")?"selected":""}
										value="Name asc"><fmt:message key="nameAsc" /></option>
									<option ${orderBy.equals("Name desc")?"selected":""}
										value="Name desc"><fmt:message key="nameDesc" /></option>
								</select>
							</p>
						</div>
						<div class="show">
							<p>
								<fmt:message key="show" />: <select name="countOnPage">
									<c:forEach begin="4" end="20" var="i" step="4">
										<option ${countOnPage==i?"selected":""} value="${i}">${i}</option>
									</c:forEach>
								</select>
							</p>
						</div>
						<div>
							<fmt:message key="category" />: <input type="text" name="category" value="${category}" />
						</div>
						<div>
							<fmt:message key="goodName" />: <input type="text" name="name" value="${name}" />
						</div>
						<div>
							<fmt:message key="consumer" />: <input type="text" name="consumer" value="${consumer}" />
						</div>
						<div>
							<fmt:message key="price" /> <br /> <fmt:message key="from" />: <input type="number" name="minPrice"
								value="${minPrice}" /> - <fmt:message key="to" />: <input type="number"
								name="maxPrice" value="${maxPrice}" />
						</div>
						<div class="page-no">
							<p><fmt:message key="resultPages" />:
							<ul>
								<c:forEach begin="1" end="${countOfPages + 1}" var="i">
									<li><a ${i==pageNumber?"class=\"active\"":""}
										href="GoodsPageServlet?${url}&pageNumber=${i}">${i}</a></li>
								</c:forEach>
							</ul>
							</p>
						</div>
						<div class="clear"></div>
						<div>
							<input type="submit" value="Do filters" />
						</div>
					</form>
				</div>
				<div class="section group">
					<c:forEach items="${goods}" var="good">
						<div class="grid_1_of_4 images_1_of_4">
							<a href="preview-3.jsp"><img src="${good.getImagePath()}"
								alt="" /></a>
							<h2>${good.getName()}</h2>
							<p><fmt:message key="category" />: ${good.getCategory()}</p>
							<p>
								<span class="price">${good.getPrice()}</span>
							</p>
							<div class="button">
								<span><img src="cart.jpg" alt="" /><a
									onclick="addToBasket(${good.getId()})" class="cart-button"><fmt:message key="addToCart" /></a></span>
							</div>
							<div>
								<span><a href="preview-3.jsp" class="details"><fmt:message key="consumer" />:
										${good.getConsumer()}</a></span>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	<div class="footer">
		<div class="wrapper">
			<div class="section group">
				<div class="col_1_of_4 span_1_of_4">
					<h4><fmt:message key="information" /></h4>
					<ul>
						<li><a href="#"><fmt:message key="aboutUs" /></a></li>
						<li><a href="#"><fmt:message key="customerService" /></a></li>
						<li><a href="#"><span><fmt:message key="advancedSearch" /></span></a></li>
						<li><a href="#"><fmt:message key="ordersAndReturns" /></a></li>
						<li><a href="#"><span><fmt:message key="contactUs" /></span></a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h4><fmt:message key="whyByFromUs" /></h4>
					<ul>
						<li><a href="about.jsp"><fmt:message key="aboutUs" /></a></li>
						<li><a href="faq.jsp"><fmt:message key="customerService" /></a></li>
						<li><a href="#"><fmt:message key="privacyPolicy" /></a></li>
						<li><a href="contact.jsp"><span><fmt:message key="siteMap" /></span></a></li>
						<li><a href="preview-2.jsp"><span><fmt:message key="searchTerms" /></span></a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h4><fmt:message key="myAccount" /></h4>
					<ul>
						<li><a href="contact.jsp"><fmt:message key="signIn" /></a></li>
						<li><a href="index.jsp"><fmt:message key="viewCart" /></a></li>
						<li><a href="#"><fmt:message key="myWishList" /></a></li>
						<li><a href="#"><fmt:message key="trackMyOrder" /></a></li>
						<li><a href="faq.jsp"><fmt:message key="help" /></a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h4><fmt:message key="contacts" /></h4>
					<ul>
						<li><span>+91-123-456789</span></li>
						<li><span>+00-123-000000</span></li>
					</ul>
					<div class="social-icons">
						<h4><fmt:message key="followUs" /></h4>
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

