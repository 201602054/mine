###jQuery
- 什么是jQuery： 是一个通过js语言所写的js框架，实现了对原始js代码的封装，可以让程序员写的更少但实现的更多。
	
	  注意:jQuery对象实际上是一个DOM对象的数组,它在该数组上扩展了一些操作数组元素的方法
	  3.jQuery操作步骤
	1)引入jQuery的js文件:引入方式与普通js文件引入方式一样,通过script标签的src属性引入
	2)使用选择器定位要操作的节点
	3)调用jQuery的方法进行操作
		jQuery对象.方法().方法().  ...
	  
- jQuery优势：
1. 简化js代码
2. 可以像css一样获取标签
	-js获取div:var arr = document.getElementsByTagName("div");
	-jq获取div:$("div")
3. 可以像css一样批量修改样式
	- css 修改div的字体颜色: 
	div{
		color:red;
	}
	- js 修改div的字体颜色: 
	var arr = document.getElementsByTagName("div");
	for(var i=0;i<arr.length;i++){
		arr[i].style.color="red";
	}
	- jq 修改div的字体颜色: 
	$("div").css("color","red");
4. 可以解决部分兼容性问题  
###引入jq
- 由于jq框架就是通过js语言缩写的js文件，引入方式和普通的js一样，通过script标签的src属性引入到页面中
####动态绑定事件
- 格式： $("#b1").click(function(){});
####获取文本框的值
- js:  i1.value
- jq:  $("#i1").val();
####js对象和jq对象互相转换
1. js转jq：  var jq = $(js);
2. jq转js：  var js = jq[0];

####jq的选择器
#####基础选择器 写法和css一样
1. 标签名选择器    $("div")
2. id选择器       $("#id")
3. 类选择器       $(".class")
4. 分组选择器     $("div,#id,.class")
5. 任意元素选择器 $("*")
####层级选择器
1. $("div span") 匹配div里面所有的span
2. $("div>span") 匹配div里面所有span子元素
3. $("div+span") 匹配div的弟弟元素span  
4. $("div~span") 匹配div的弟弟们元素span
- 层级相关方法：
	1. $("#abc").siblings() 	获取id为abc元素的所有兄弟     与其同级的兄弟
	2. $("#abc").prev()  		获取id为abc元素的哥哥元素	    与其同级的哥哥
	3. $("#abc").prevAll() 		获取id为abc元素的哥哥们元素
	4. $("#abc").next() 		获取id为abc元素的弟弟元素
	5. $("#abc").nextAll() 		获取id为abc元素的弟弟们元素
	6. $("#abc").parent() 		获取id为abc元素的父元素
	7. $("#abc").children() 	获取id为abc元素的子元素们
####过滤选择器(下标)
- $("div:first") 		匹配所有div中的第一个
- $("div:last") 		匹配所有div中的最后一个
- $("div:even") 		匹配所有div中下标为偶数的元素
- $("div:odd") 			匹配所有div中下标为奇数的元素
- $("div:lt(n)") 		匹配所有div中下标小于n的元素   下标从0开始
- $("div:gt(n)") 		匹配所有div中下标大于n的元素
- $("div:eq(n)") 		匹配所有div中下标等于n的元素
- $("div:not(.abc)") 	匹配所有div中class值不等于abc的元素

####内容选择器
- $("div:has(p)") 				匹配包含p子元素的div
- $("div:empty") 				匹配空的div
- $("div:parent") 				匹配非空的div
- $("div:contains('xxx')") 		匹配包含xxx文本的div

####可见选择器
- $("div:hidden") 				匹配所有隐藏的div
- $("div:visible") 				匹配所有可见的div
- 隐藏显示相关的方法
	1. $("#abc").show() 		让元素显示
	2. $("#abc").hide() 		让元素隐藏
	3. $("#abc").toggle() 		让元素显示和隐藏切换 

####属性选择器
- $("div[id]") 			匹配包含id属性的div
- $("div[id='xxx']") 	匹配id属性值为xxx的div
- $("div[id!='xxx']") 	匹配id属性值不为xxx的div

####子元素选择器
- $("div:first-child") 	匹配是div并且是子元素并且是第一个 
- $("div:last-child") 	匹配是div并且是子元素并且是最后一个
- $("div:nth-child(n)") 匹配是div并且是子元素并且是第n个  		n从1开始

####表单选择器
- $(":input") 			匹配表单中所有的控件 
- $(":password") 		匹配表单中所有的密码框
- $(":radio") 			匹配表单中所有的单选
- $(":checkbox") 		匹配表单中所有的多选
- $(":checked") 		匹配表单中所有选中的单选、多选和下拉选
- $("input:checked") 	匹配表单中所有选中的单选和多选
- $(":selected") 		匹配表单中所有选中的下拉选

###增加元素对象
- 创建元素对象:
	js:var d = document.createElement("div");
	jq:var d = $("<div id='xxx'>abc</div>");
- 添加到某个元素中									(增)
	$("body").append(d);   //添加到最后面
	$("body").prepend(d);  //添加到最前面
####插入标签											(插)
	$("#abc").before(d); //插入到id为abc元素的前面
	$("#abc").after(d); //插入到id为abc元素的后面
####删除标签											(删)
	js: document.body.removeChild(d);
	jq:  $("#abc").remove();   //删除id为abc的元素
####修改标签											(改)
1. 修改标签的text     等效innerText
	标签对象.text(); //获取
	标签对象.text("xxx");  //修改
2. 修改标签的html    等效innerHTML
	标签对象.html();  //获取
	标签对象.html("<h1>xxx</h1>"); //修改
3. 修改标签的css样式
	标签对象.css("color");  //获取
	标签对象.css("color","red") //修改
	标签对象.css({"width":"200px","height":"100px"});批量赋值
4. 修改标签的属性   attribute属性
	标签对象.attr("class");  //获取class的值
	标签对象.attr("class","c1"); //修改标签class值为c1





####代码介绍：
1. demo01 引入jq    按钮动态绑定事件  获取文本框的值
2. demo02 jq和js互相转换


