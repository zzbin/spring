//注意:引入路径的./绝对不要省略掉(其他的语言引入相对路径下的同一级路径下的文件./是可以省略掉的,nodejs 不行)
//后缀名(.js)可以省略掉
//按照文件加载的先后顺序,依次进行加载文件,依次执行文件
//require("./nodejs15.js");
//require("./nodejs16.js");

//对于之前学习过的加载核心模块,我们可以通过require 方法加载核心模块之后,得到一个可以使用的对象
//对于自定义的模块,仍然可以
//我们得到了一个nodejs15对象,该对象是一个json格式的对象(一般来讲对于nodejs 所谓的对象,就是json对象)
//我们可以通过得到的这个对象,以json的形式,通过key.value 的形式,来取得加载的模块中的相应的信息
//我们可以通过该对象,取得加载的自定义模块中的变量,方法,对象等
var nodejs15 = require("./nodejs15.js");
console.log(nodejs15);
//只要是经过nodejs15使用exports对象导出的组件,在这里都能够引入并应用
/*
console.log(nodejs15.str1);
console.log(nodejs15.str2);
console.log(nodejs15.info());
console.log(nodejs15.add(1,2));
console.log ("id = " + nodejs15.stu.id + ";name = " + nodejs15.stu.name + ";age = " + nodejs15.stu.age);
*/