<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setBundle basename="main" />
<%
	if (request.getSession().getAttribute("user") != null) {
%>
	Hello, ${user.getName()}
<%
	} else {
%>
<div class="login_panel">
	<h3><fmt:message key="existingCustomer" /></h3>
	<p><fmt:message key="signInWithTheFormBelow" />.</p>
	<form action="signin" method="post" id="member">
		<input name="login" type="text" value="Username" class="field"
			onfocus="this.value = '';"
			onblur="if (this.value == '') {this.value = 'Username';}" /> 
			<input name="password" type="password" value="Password" class="field"
			onfocus="this.value = '';"
			onblur="if (this.value == '') {this.value = 'Password';}" />
		<div class="buttons">
			<div>
				<input type="submit" class="grey" value="Sign in" />
			</div>
		</div>
	</form>
	<p class="note"><fmt:message key="ifForgotPassword" /> <a
			href="#"><fmt:message key="here" /></a>
	</p>

</div>
<%
	}
%>