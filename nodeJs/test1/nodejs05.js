//加载核心模块
//参数:http加载服务端相应的核心模块
var http = require("http");
//通过核心模块对象http,调用createServer ()方法,创建一个服务端对象
var server = http.createServer();
//通过server 开启服务器
//调用监听的方法listen ,来开启服务
/*
	listen 方法
		参数1:端口号8000(自己去设置端口号)
		参数2:回调函数:服务器开启后,调用该方法
*/
server.listen(8000, function(){
	console.log("服务器已经开启");
});
/*
	on方法:接收并处理服务器
		参数1:"request' :表示用来接收请求
		参数2:回调函数, 在服务器接收请求后,在该函数中处理请求
	打开浏览器:
		http://localhost:8000
	服务器在处理完请求后，为浏览器做出一个响应
		request:表示请求对象，对于请求相关内容的处理
		response:表示响应对象，对于响应相关内容的处理	
					类似于javaweb开发中的servlet（service方法中的参数）
*/
server.on("request",function(request, response){
	//判断请求路径
	//  /表示服务的根路径
	//  /favicon.ico表示node.js默认接收的请求
	//  /favicon.ico如果存在,我们在处理请求时屏蔽掉即可
	var url = request.url
	//说明是我们自己的路径
	if(url != "/favicon.ico"){
		console.log("处理请求为：" + url);
		//为浏览器做出响应,我们要使用response
		//////////////////////响应方式一//////////////////////////
		//调用write 方法:表示要为浏览器写内容
		//response.write("aaabbbccc");
		//做完响应内容后,不要忘记关闭响应对象
		//response.end ();
		//////////////////////响应方式二//////////////////////////
		response.end ("aaabbbcccddd");
	}
	
});