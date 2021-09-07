var http = require("http");
var fs = require("fs");
var server = http.createServer();

server.listen(8000, function(){
	console.log("服务器已经开启");
});

server.on("request",function(request, response){
	//根据不同的请求路径,做出不同的响应
	var url = request.url;
	console.log("处理请求为：" + url);
	// 设置响应头信息,响应头信息指的是服务器通知浏览器响应的基本信息
	// 我们需要设置一个Content-type响应头,通知浏览器应该以UTF-8编码的格式打开响应
	// text/plain;charset=utf-8表示响应到浏览器上的是普通文本
	// 我们现在需要做的是响应html文本，通知浏览器识别html
	// Content-Type:text/html
	response.setHeader ("Content-Type","text/html;charset=utf-8")
	if (url=="/"){ 
		response.end("响应初始页面")
	} else if (url=="/save"){ 
		response.end("<font color='red'>响应添加页面</font>"); 
	} else if (url=="/update"){
		//在实际项目开发中,我们不可能像这样以拼接字符串的形式来写htm1
		//我们的服务器在接收了请求之后,都是找到已经存在的前端资源(htm等),来为浏览器做响应
		var html = `
			<html>
				<head></head>
				<body>
					<table border="1">
						<tr>
							<td>a1</td>
							<td>a2</td>
							<td>a3</td>
						</tr>
						<tr>
							<td>b1</td>
							<td>b2</td>
							<td>b3</td>
						</tr>
					</table>
				</body>
			</html>
		`
		response .end(html)
	} else if(url=="/delete"){
		fs.readFile("./html/test01.html", function(error, data){
			response.end(data.toString()); 
		})
	} else if (url=="/select"){
		response.end("响应查询页面");
	//如果是静态资源,则读取访问的相应的静态资源文件
	//不论是css文件,js文件,或者是图片资源,统一使用一个else if 分支来完成需求
	//由于所有的静态资源都预定好了保存在public文件夹下
	//所以我们完全可以根据访问的路径来进行判断
	//需要判断的是如果访问路径是以/public /开头的文件则为静态资源加载发出的请求
	//url.indexof("/public/)==0:表示如果是以/public /开头
	}else if (url.indexOf("/public/")==0){
		fs.readFile("."+url, function(error, data){
			response.end(data); 
		})
	}else{
		response.end ("404Not Found ")
	}
});