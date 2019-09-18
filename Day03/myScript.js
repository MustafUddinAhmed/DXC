function Check(){
    var userName= document.getElementById("userName").value;
    var password= document.getElementById("password").value;
    var e1= document.getElementById("error1")
    var e2= document.getElementById("error2")
    
    if(userName.length==0){
        e1.innerHTML="<font color=red>User Name is Mandatory</font>"
    }
    else{
        e1.innerHTML=""
    }
    if(password.length==0){
        e2.innerHTML="<font color=red>Password is Mandatory</font>"
    }
    else if(password.length<6 || password.length>12){
        e2.innerHTML="<font color=red>Password length should be between 6 and 12</font>"
    }
    else if(password.charAt(0)!="A"){
        e2.innerHTML="<font color=red>Password must start with A</font>"
    }
    else{
        e2.innerHTML=""
    }
}