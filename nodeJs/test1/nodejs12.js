var http = require("http");
var fs = require("fs");
var url = require("url");

var urlObj = url.parse("http://localhost:8000/save?str1=aaa&str2=bbb");
//以这种形式(专业的使用ur1核心模块的形式)来处理路径,确实是能够将ur1路径和参数划分开
//但是得到的参数完全没有经过进一步的加工处理
//所得到的参数是以str1=aaa&str2=bbb的形式来呈现
//所以我们具体要哪个参数,需要对该参数字符串进行进一步的处理
var query = urlObj.query;
console.log(query);
// parse方法加入了第二个参数true之后,参数是经过了进一步处理了
// query 属性值中的参数被处理成为了json的格式
//  {"str1":" aaa"," str2":" bbb"}
// json对象的取值非常的方便,我们可以使用json.key的形式来取得我们想要的值
var urlObj2 = url.parse("http://localhost:8000/save?str1=aaa&str2=bbb", true);
var query2 = urlObj2.query;
console.log(query2);
var str1 = query2.str1;
var str2 = query2.str2;
console.log("str1的值为:"+str1);
console.log("str2的值为:"+str2);

var server = http.createServer();
server.listen(8000, function(){
	console.log("服务器已经开启");
});

server.on("request",function(request, response){
	//根据不同的请求路径,做出不同的响应
	response.setHeader ("Content-Type","text/html;charset=utf-8");
	//var url = request.url;
	//输出结果:/save?str1=aaa&str2=bbb
	//通过案例,表明路径ur1和参数共同的组成了ur1
	//console.log(url);
	var urlObj = url.parse(request.url, true)
	//挂参数后的路径和原始的/save当然就不匹配了
	//但是我们想要的是通过路径/save进入到下述的if处理当中,为浏览器做出响应
	//参数应该是作为额外的处理比较妥当,现在最大的问题是路径涵盖了参数
	//我们现在要做的是将/save?str1=aaa&str2=bbb拆分成为两部分内容
	//内容1:路径部分/save
	//内容2:参数部分str1=aaa&str2=bbb
	if (urlObj.pathname=="/save"){ 
		var query2 = urlObj.query;
		console.log(query2);
		var str1 = query2.str1;
		var str2 = query2.str2;
		response.end("响应添加页面,接收的参数为str1=" + str1 + ",str2=" + str2); 
	}
})