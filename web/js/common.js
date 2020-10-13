// 输入框不能为空
function blockececk_warning(name) {

	var nameinput = document.getElementById(name).value;

	//获得输入框的字符长度
	var len = nameinput.length;


	var namespan = name + "span";
	// alert(namespan);
	var usernameSpan = document.getElementById(namespan);
	//如果输入框的字符长度为0，提示数据不能为空
	if (!len) {
		// $(document.getElementById(namespan)).css({"display":"block"});
		usernameSpan.innerHTML = "<font>数据不能为空</font>";
		// $("div").find("span").css({"background-color":"green"});
	} else {
		// 满足条件的信息提示
		// 在对应的span中显示提示信息
		usernameSpan.innerHTML = "<font color='green'>√</font>";
	}

}
// 重复密码不能为空,并且要和密码一致
function checkpassword(name) {
	// alert("name:" + name);
	//获得输入框的内容

	var nameinput = document.getElementById(name).value;
	// alert("nameinput:" + nameinput)

	//获得输入框的字符长度
	var len = nameinput.length;


	var namespan = name + "span";
	// alert(namespan);
	var usernameSpan = document.getElementById(namespan);
	//如果输入框的字符长度为0，提示数据不能为空
	if (!len) {

		usernameSpan.innerHTML = "<font>数据不能为空</font>";
	} else {
		var password = document.getElementById("password").value;
		if (password == nameinput) {
			// 满足条件的信息提示
			// 在对应的span中显示提示信息
			usernameSpan.innerHTML = "<font color='green'>√</font>";
		} else {
			usernameSpan.innerHTML = "<font>密码不一致</font>";
		}
	}


}
function spanempty(){
	// // document.getElementsByTagName("ececk_warning").item(0).remove();
	// document.getElementsByClassName("ececk_warning").innerHTML="";
	document.getElementById('usernamespan').innerHTML = '';
	document.getElementById('passwordspan').innerHTML = '';
	document.getElementById('repasswordspan').innerHTML = '';
	document.getElementById('remarkspan').innerHTML = '';
}
// function clearWindow(){
// 	$("ececk_warning").empty();
// }
