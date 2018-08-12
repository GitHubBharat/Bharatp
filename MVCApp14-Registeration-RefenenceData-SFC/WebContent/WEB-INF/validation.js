/**
 * validation.js
 */
function validate(){
	//read form data
	var userName =document.getElementById("userName").value;
	var regExp=[a-Z];
	msg=document.getElementById("msg");
	if(userName.match(regExp)){
		document.write("Username Varify");
	}
	else{
		msg.innerHTML="inValid Username";
	}
	var password = document.getElementById("password").value;
	var regExp=[a-Z];
	msg=document.getElementById("msg");
	if(password.match(regExp)){
		document.write("password Varify");
	}
	else{
		msg.innerHTML="inValid password";
	}
	
	var Name =document.getElementById("Name").value;
	var regExp=[a-Z];
	msg=document.getElementById("msg");
	if(Name.match(regExp)){
		document.write("Name Varify");
	}
	else{
		msg.innerHTML="inValid name";
	}
	
	var email =document.getElementById("email").value;
	var regExp=[a-Z];
	msg=document.getElementById("msg");
	if(email.match(regExp)){
		document.write("email Varify");
	}
	else{
		msg.innerHTML="inValid email";
	}
	
	var mobile = document.getElementById("mobile").value;
	var regExp=/\+91[0-9]{10}/;
	msg=document.getElementById("msg");
	if(mobile.match(regExp)){
		document.write("mobile Varify");
	}
	else{
		msg.innerHTML="inValid mobile";
	}
	
	var address =document.getElementById("address").value;
	var pinCode = document.getElementById("pinCode").value;
	var regExp=/[0-9]{6}/;
		msg=document.getElementById("msg");
		if(pinCode.match(regExp)){
			document.write("pinCode Varify");
		}
		else{
			msg.innerHTML="inValid pinCode";
		}
	
}
