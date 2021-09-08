//console.log ("nodejs15");
  
//require("./nodejs16.js");

 
//对于这个变量(或者是其他的组件(方法或者对象)),必须经过导出授权,才能够让其他的nodejs 文件在加载该模块之后,使用这些组件
//对于nodejs 的模块系统(模块作用域),重要的是突显其作用域的概念,这是其他的语言所不具备的比较高级的功能
//在该模块下的组件,必须要通过exports对象授权,才能够被其他的模块所应用
//例如:有以下两个变量的声明:

//对于str1是经过exports 对象导出的,就是经过授权同意的,就可以让其他的模块使用到
//对于str2,就是一个使用var声明的普通变量,没有经过exports 的导出授权,其他的模块是不能够应用的
/*
exports.str1 = "abc";
//var str2 = "bcd";
exports.str2 = "bcd";

//方法也必须要使用exports 导出授权才可以被其他的模块引用
exports.info = function(){
	return "111";
}
exports.add = function(a,b){
	return a+b;
}
//对象也必须要使用exports 导出授权才可以被其他的模块引用
exports.stu={
	"id": "A0001",
	"name":"zs",
	"age":"23"
}
*/

//如果一个模块需要直接导出某个成员,不声明变量,直接以exports =的形式是不可以的
//我们需要使用module 来完成
//module.exports = "abc";
/* 
module.exports = function() {
	return "abc123";
}
*/
module.exports = {
	"id": "A0001",
	"name":"zs",
	"age":"23"
}