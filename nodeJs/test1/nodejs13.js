var http = require("http");
var fs = require("fs");
var url = require("url");

var server = http.createServer();
server.listen(8000, function(){
	console.log("服务器已经开启");
});

server.on("request",function(request, response){
	response.setHeader ("Content-Type","text/html;charset=utf-8");
	var urlObj = url.parse(request.url, true)
	if(urlObj.pathname=="/"){
		fs.readFile("./html/test01.html", function(error, data){
			response.end(data); 
		})
	}else if (urlObj.pathname=="/save"){ 
		console.log("处理添加操作");
		// 处理完添加操作后,将请求重定向到初始页
		// 重定向技术的原理是
		/*
			将需要重新访问的路径提供给浏览器,浏览器拿到了这个路径之后,再一次自动的发出请求
			按照重定向的地址访问服务器,服务器再一次提供响应
		*/
		/*
			响应状态码:
				 200:响应成功
				 404:找不到的资源
				 405:请求不被允许
				 500:表示服务器内部错误
				 302:表示的是普通的重定向
		*/
		//设置响应的状态码为302
		response.statusCode = 302;
		// 设置响应头信息,设置重定向的地址
		/*
			参数1:Location 表示从本地(当前程序)开始重定向
			参数2:表示重定向的路径(表示为用户提供的需要发出的第二次请求的路径)
				路径的设置方式1:http://localhost:8000/具体的资源路径
				路径的设置方式2:省略掉上述的协议ip端口号的方式(最常用的方式)
								/具体的资源路径
				例如:
					方式一：http://localhost:8000/
					方式二：/
					方式一：http://localhost:8000/save
					方式二：/save
		*/
		response.setHeader("Location","/");
		//调用end方法做出响应
		response.end();
	}else{
		response.end("找不到资源："+ urlObj.pathname);
	}
})