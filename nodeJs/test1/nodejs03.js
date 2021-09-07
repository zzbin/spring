// 想要读取文件，必须使用到Node.js的核心模块中的fs
//参数必须是fs（Node.js制定好的）
//file变量，可以随意命名
var file = require('fs');
//读取文件的相对路径
//对于我们现在本身的测试./和不使用./差别不大,但是推荐使用./的形式
//未来的开发中,如果我们使用到了相对路径,那么加上./指定路径的方式是百分百好用的,不加./的形式有可能就不能用了
//养成好习惯,一切相对路径的指定,都要加./

//回调函数中的data,表示读取的文件中的内容
//error 表示读取文件失败的错误对象,只有在文件读取失败的情况下,该对象才会有实质的内容
file.readFile("./file/abc.txt", function(error, data){
	//console.log(data.toString());
	//console.log(error);
	if(error){
		console.log("read file fail");
	}else{
		console.log("read file success，content is：" + data.toString());
	}
})