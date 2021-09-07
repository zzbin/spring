var http = require("http");
var fs = require("fs");
var url = require("url");
//使用require("url")返回的url变量为一种json格式的对象
console.log(url);

//该url.parse("http://localhost:8000/save")方法
//会将我们的访问路径做一个以json的key和value 形式的具体的拆解
/*	
	会得到一些具体的信息,比如协议,ip,端口号
	我们通过案例得到了一个很重要的信息:
	pathname :抛开协议,ip,端口号的访问地址
	例如:
		如果访问的地址为:http://localhost:8000/
		pathname :/
		如果访问的地址为:http://localhost:8000/save
		pathname :/save
		如果访问的地址为:http://localhost:8000/abc/save
		pathname :/abc/save
	就是我们以前所使用到的var url =request.ur1;所得到的信息
	将来的实际项目开发,我们对于路径的处理,会涉及到访问参数,所以我们都是使用加载url核心模块的方式来处理路径，而不仅仅只是使用var url =request.ur1;这种形式
*/
var urlObj = url.parse("http://localhost:8000/save");
console.log(urlObj);