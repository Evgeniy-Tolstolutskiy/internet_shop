<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setBundle basename="main" />
<img src="captcha" />
<fmt:message key="enterCaptcha" />:
<input type="text" name="captchaValue" />
<% if (Boolean.valueOf(request.getParameter("hiddenField"))) { %>
	<input type="hidden" name="hiddenCaptchaId" value="${hiddenCaptchaId}" />
<%
	}
%>