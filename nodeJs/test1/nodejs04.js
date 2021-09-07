// 写文件require('fs');
var file = require('fs');

//如果写入的文件本身不存在,那么则创建一个文件(根据下述指定的路径,以及文件名来创建文件)
//如果写入的文件本身有内容,那么新内容会将原有的内容覆盖掉,而不是追加新内容
//error文件写入失败的对象
file.writeFile("./file/abc1.txt","abcdef123", function(error, data){
	if(error){
		console.log("写入失败");
	}else{
		console.log("写入成功");
	}
})