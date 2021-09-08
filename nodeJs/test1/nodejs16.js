console.log ("nodejs16");
  
require("./nodejs17.js");
//在nodejs16中,加载了nodejs17:在nodejs17中,加载了nodejs18
/*
	如果是按照程序加载的顺序来看
	输出的结果应该是
	nodejs16
	nodejs17
	nodejs18
	nodejs18
	
	实际所得到的结果,并不是以上我们通常认知的那样
	nodejs16
	nodejs17
	nodejs18
	最后一个nodejs18没有输出
	因为nodejs18已经在以上的代码执行的过程中加载过了,就不会再重复加载了
	下述的
	require("./nodejs18.js");
	这一句加载其实找的不是硬盘上的Inodejs18.js这个文件,而是优先的从已经加载过的保存在缓存中的nodejs18.js来实现
*/
require("./nodejs18.js");