var regexps = [/[A-Z][a-z]{1,20}/, /[A-Z][a-z]{1,20}/, /\w{1,20}@[a-z]+\.(com|ua|ru)/, /\w{12,}/, /[A-Z][a-z]{1,20}/, /[A-Z]{2}/, /\w{2,20}/, /[0-9]+/, /[0-9]+/];

function isValidField(field, regex){
	if(regex.exec(field.value)){
		return true;
	}
	field.style.borderColor = "red";
	return false;
}