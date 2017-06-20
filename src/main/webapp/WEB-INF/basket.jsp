<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setBundle basename="main" />
<html>
<head>
<title><fmt:message key="basketTitle" /></title>
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
				<form action="checkUser">
					<c:forEach items="${basket.getGoodsInBasket()}" var="good">
						<div class="grid_1_of_4 images_1_of_4">
							<a href="preview-3.jsp"><img src="${good.getImagePath()}"
								alt="" /></a>
							<h2>${good.getName()}</h2>
							<p><fmt:message key="category" />: ${good.getCategory()}</p>
							<p>
								<span class="price">${good.getPrice()}</span>
							</p>
							<p><fmt:message key="count" />:${basket.getBasket().get(good)}</p>
							<div>
								<span><a class="details"><fmt:message key="consumer" />:
										${good.getConsumer()}</a></span>
							</div>
						</div>
					</c:forEach>
					<br />
					<input type="submit" class="grey" value="<fmt:message key="doOrder" />" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>