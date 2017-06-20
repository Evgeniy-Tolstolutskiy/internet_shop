function ValidateInput()
{
	var isValid = true;
	
	$('[regex]').each(function () {
		if(!isValidField($(this), $(this).attr("regex"))){
			isValid = false;
		}
	});
	return isValid;
}

function isValidField(field, regex){
	if(field.val().match(RegExp(regex))){
		return true;
	}
	field.css('border-color', 'red');
	return false;
}