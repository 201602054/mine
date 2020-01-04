自我介绍：刘国斌   qq:77331283  
####什么是服务器
- 服务器就是一台高性能的电脑，在此电脑上安装了各种服务软件后就称此电脑为xxx服务器
- web服务器：安装了 web服务软件(WebServer)，这台电脑就称为web服务器
- 邮件服务器：安装了邮件服务软件，这台电脑称为邮件服务器
- 数据库服务器：安装了数据服务软件，这台电脑称为数据库服务器
- ftp服务器：安装提供文件上传下载服务的软件，这台电脑称为ftp服务器
###课程介绍
1. web前端（学习如何开发页面）
- HTML 负责搭建页面结构和内容（盖房子）
- CSS 负责美化页面（装修）
- JavaScript 负责给页面添加动态效果和动态内容 （给房子添加点机关）
- jQuery 是js的框架 用于简化原生js代码
- BootStrap 页面框架对html、css、jQuery进行封装，从而提高开发效率
2. 数据库（学习如何对数据进行增删改查）
3. Servlet（学习如何接收请求和如何响应请求）
###HTML
- Hyper Text Markup Languge超文本标记语言
	超文本：不仅仅是纯文本还包括：字体相关（样式，颜色，大小等）和多媒体（图片，音频，视频） 
- 学习html主要学习的就是 有哪些标签，标签有哪些属性，标签和标签的嵌套关系
- 和xml不同点：xml标签是可以自定义的，html提供了一部分现有的标签
###创建html页面
- 新建文件->other->搜索html
###html页面结构介绍
	
		<!DOCTYPE html>文档声明：用于告诉浏览器使用html哪个版本的标准解析页面， 此写法是用html5的标准解析页面
		<html>根标签 除了文档声明都写在跟标签里面
			<head>头标签 给浏览器看的内容写在头标签里面
				<meta charset="UTF-8">告诉浏览器页面字符集
				<title>Insert title here</title>告诉浏览器页面标题是什么
			</head>
			<body>体标签 给用户看的内容写在体标签里面
				
			</body>
		</html>
###HTML中常见标签
####文本相关标签
1. 内容标题: 独占一行 自带上下间距 字体加粗
	<h1>到<h6>
2. 段落标签：独占一行 自带上下间距 
	<p>
3. 加粗和斜体
	<b>abc</b> <i>abc</i>
####列表标签
1. 无序列表
2. 有序列表
3. 定义列表
4. 列表嵌套



###上午课程回顾
1. 文本相关： 
	h1-h6内容标题 独占一行  自带间距  字体加粗
	p段落标签 独占一行 自带间距        align="left/right/center"
	加粗b   斜体i  换行br
2. 列表标签   无序列表 ul:type   li   有序列表 ol:type start reversed    li    定义列表  dl  dt dd    列表嵌套： 有序和无序可以任意无限嵌套


####图片标签
- 支持的图片格式： jpg/jpeg ， png位图（支持透明色）， gif动图
- src属性： 图片路径
	1. 相对路径：访问站内资源一般使用相对路径
		- 页面和图片在同一目录：直接写图片名
		- 图片在页面的上级目录：../图片名
		- 图片在页面的下级目录：文件夹名/图片名
	2. 绝对路径：访问站外资源一般使用绝对路径，也称为图片盗链，图片盗链好处：可以节省本站资源，坏处：可能找不到图片
- alt:当图片不能正常显示时显示的文本
- title: 标题 鼠标在图片上悬停时显示的文本
- width/height:  两种赋值方式： 1. 像素  2. 上级元素的百分比
	如果只设置宽度则高度会等比例缩放
###超链接a
- 如果不加href属性就是纯文本
- href：资源路径 
	页面资源：可以访问站内资源也可以访问站外资源
	文件资源：如果浏览器支持浏览则直接浏览不支持则下载
- 文本超链接和图片超链接，a标签包裹文本则是文本超链接 包裹图片就是图片超链接
###表格table
- table:border边框的粗细
- tr行
- td列 跨行rowspan   跨列colspan （col=colume列）
- th表头
- caption 表格标题
###表单form
- 作用： 用于获取用户输入的相关信息，将信息提交到服务器
- 学习表单主要学习的就是表单中有哪些控件：
	文本框 密码框 提交按钮 单选 多选 下拉选等

		<!-- action提交地址 -->
		<!-- 表单中的任何控件必须有name属性 -->
		<form action="http://www.tmooc.cn">
			用户名:<input type="text" 
			placeholder="请输入用户名" name="username"><br>
			密码:<input type="password" 
			placeholder="请输入密码" name="password"><br>
			性别:<input type="radio" value="nan" name="gender">男
			<!-- checked默认选中  value提交的值-->
			<input type="radio" value="nv"
			checked="checked" name="gender">女<br>
			兴趣：<input type="checkbox" name="hobby" 
				value="cy">抽烟
				<input type="checkbox" checked="checked" name="hobby" 
				value="hj">喝酒
				<input type="checkbox" name="hobby" 
				value="tt">烫头<br>
			生日：<input type="date" name="birthday"><br>
			靓照：<input type="file" name="pic"><br>
			<!-- 下拉选 -->
			城市：<select name="city">
					<option value="bj">北京</option><!-- 选项 -->
					<!-- selected默认选中 -->
					<option value="sh" selected="selected">上海</option>
					<option value="gz">广州</option>
				</select><br>
			<input type="submit" value="注册">
		</form>









