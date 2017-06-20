<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setBundle basename="main" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><fmt:message key="paymentTitle" /></title>
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

	function hideCreditCardFields() {
		document.getElementById("cardInfo").hidden = true;
	}

	function showCreditCardFields() {
		document.getElementById("cardInfo").hidden = false;
	}
</script>
</head>
<body>
	<div class="wrap">
		<div class="header">
			<%@ include file="header.jsp"%>
			<div class="header_bottom">
				<form action="shipping">
					<input type="radio" name="type" value="In cash"
						onclick="hideCreditCardFields()" /> <fmt:message key="inCash" />
						<br />
					<input type="radio"
						name="type" value="With credit card"
						onclick="showCreditCardFields()" /> <fmt:message key="withCreditCard" />

					<div id="cardInfo">
						<table>
							<tr>
								<td><fmt:message key="cardType" />:</td>
								<td><input type="text" name="cardType" /></td>
							</tr>
							<tr>
								<td><fmt:message key="cardNumber" />:</td>
								<td><input type="text" name="cardNumber" /></td>
							</tr>
							<tr>
								<td><fmt:message key="cardExpirationDate" />:</td>
								<td><input type="text" name="cardExpirationDate" /></td>
							</tr>
							<tr>
								<td><fmt:message key="cardCvv" />:</td>
								<td><input type="text" name="cardCvv" /></td>
							</tr>
						</table>
					</div>
					<input type="submit" class="grey" value="Next" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>