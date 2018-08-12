function validate(frm){
	//read form data
	var sno =frm.sno.value;
	var sname = frm.sname.value;
	var address = frm.address.value;
	var course = frm.course.value;
	var avg = frm.avg.value;
	//perform client side validation
	//set client side error message 
	document.getElementById("snoErr").innerHTML="";
	document.getElementById("snameErr").innerHTML="";
	document.getElementById("addressErr").innerHTML="";
	document.getElementById("courseErr").innerHTML="";
	document.getElementById("avgErr").innerHTML="";
	
	 frm.vflag.value="yes";
	 
	if(sno==""){
		document.getElementById("snoErr").innerHTML="student no is manadartory";
		frm.sno.focus;
		return false;
	}
	else{
		if(isNaN(sno)){
			document.getElementById("snoErr").innerHTML="must be numaric value client";
		}
	}
	if(sname==0){
		document.getElementById("snameErr").innerHTML="student name is manadartory";
		frm.sname.focus;
		return false;
	}
	if(address==0){
		document.getElementById("addressErr").innerHTML="student address is manadartory";
		frm.address.focus;
		return false;
	}
	if(course==0){
		document.getElementById("courseErr").innerHTML="student course is manadartory";
		frm.course.focus;
		return false;
	}
	if(avg==""){
		document.getElementById("avgErr").innerHTML="student avg is manadartory";
		frm.avg.focus;
		return false;
	}else{
		if(isNaN(avg)){
			document.getElementById("avgErr").innerHTML="must be numaric value";
		}
	}
	return true;
}