function ValidateInput(){
	var fields = getAllElementsWithAttribute("regex");
	var isValid = true;
	for(var i = 0;i < fields.length;i++){
			if(!isValidField(fields[i], fields[i].getAttribute("regex"))){
				isValid = false;
			}
	}
	return isValid;
}

function isValidField(field, regex){
	if(field.value.match(RegExp(regex))){
		return true;
	}
	field.style.borderColor = "red";
	return false;
}

function getAllElementsWithAttribute(attribute){
  var matchingElements = [];
  var allElements = document.getElementsByTagName('*');
  for (var i = 0, n = allElements.length; i < n; i++){
    if (allElements[i].getAttribute(attribute) !== null){
      matchingElements.push(allElements[i]);
    }
  }
  return matchingElements;
}
