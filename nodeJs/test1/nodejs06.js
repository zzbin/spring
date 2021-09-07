var http = require("http");
var server = http.createServer();

server.listen(8000, function(){
	console.log("服务器已经开启");
});

server.on("request",function(request, response){
	//根据不同的请求路径,做出不同的响应
	var url = request.url;
	// 设置响应头信息,响应头信息指的是服务器通知浏览器响应的基本信息
	// 我们需要设置一个Content-type响应头,通知浏览器应该以UTF-8编码的格式打开响应
	response.setHeader ("Content-Type"," text/plain;charset=utf-8")
	if (url=="/"){ 
		response.end("响应初始页面")
	} else if (url=="/save"){ 
		response.end("响应添加页面"); 
	} else if (url=="/update"){
		response .end("响应修改页面")
	} else if(url=="/delete"){
		response.end("响应删除页面"); 
	} else if (url=="/select"){
		response.end("响应查询页面");
	} else{
		//找不到的资源响应的状态码为404
		response .end ("404Not Found ")
	}
});