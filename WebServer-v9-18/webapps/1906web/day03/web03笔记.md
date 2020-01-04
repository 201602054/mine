###课程回顾
1. CSS 层叠样式表  作用：美化页面
2. 引入方式三种：
- 内联：在标签的style属性里面填写样式代码，弊端：不能复用
- 内部：在head标签里面添加style标签，好处：可以当前页面复用，弊端：不能多页面复用
- 外部：在单独的css文件中写样式代码，好处：可以多页面复用，可以将html和css代码分离
3. 选择器
- 标签名  div{}
- id     #id{}
- 类     .class{}
- 分组   div,#id,.class{}
- 子孙后代  div div span{}
- 子元素   div>div>span{}
- 属性     input[属性名='值']{}
- 伪类     a:link/visited/hover/active{}
- 任意元素选择器   *{}
4. 颜色赋值
- 单词   red
- 6位16进制   #ff0000
- 3位16进制   #f00
- 3位10进制   rgb(255,0,0)
- 4位10进制   rgba(255,0,0,0-1)
5. 背景图片
- 设置背景图片  background-image:url(路径);
- 背景图片尺寸  background-size: 200px 300px;
- 禁止重复      background-repeat: no-repeat;
- 控制位置      background-position: 100% 100%;
6. 显示方式 display 
- block: 块级元素，独占一行，可以修改宽高
- inline: 行内元素, 共占一行，不能修改宽高
- inline-block:行内块元素，可以修改宽高，也可以共占一行

常见行内元素:
<a>	<b>	<br>  <input>  <span>  			

常见块级元素:
<caption>  <dd>  <dl>  <dt>  <ol>  <ul>  <div>  <form>  <h1~6>  

常见行内块:<img>

7. 盒子模型
- 盒子模型=外边距+边框+内边距+宽高 
- 宽高： width/height 赋值方式：1. 像素  2.上级元素的百分比
	行内元素不能修改宽高
- 外边距： 元素距上级元素或相邻兄弟元素的距离称为外边距
	赋值方式：      margin-left/right/top/bottom:10px;
				margin:10px; 四个方向10
				margin:10px 20px; 上下10 左右20
				margin:0 auto;  居中
				maring:10px 20px 30px 40px; 上右下左 顺时针
	行内元素上下外边距无效
	粘连问题： 当元素的上边缘和上级元素的上边缘重叠时，给元素添加上外边距时会出现粘连问题，给上级元素添加overflow:hidden解决
####盒子模型之边框
- 赋值方式： border: 边框粗细 边框样式 边框颜色
		border-left/right/top/bottom:边框粗细 边框样式 边框颜色;
- 圆角设置： border-radius: 20px； 值越大越圆
####盒子模型之内边距
- 什么是内边距： 元素边框距内容的距离
- 赋值方式： 和外边距类似
		padding-left/right/top/bottom:20px;
		padding:10px; 四个方向10
		padding:10px 20px; 上下10 左右20
		padding:10px 20px 30px 40px; 上右下左
- 行内元素内边距影响元素所占宽度，不影响所占高度

####文本相关样式
1. 文本修饰： text-decoration
- overline 上划线
- underline 下划线
- line-through 删除线
- none 去掉文本修饰
2. 水平对齐方式:text-align
- left/right/center
3. 文本颜色 color
4. 行高 line-height
	可以实现文本上下居中
####字体相关
1. 字体大小 font-size 
2. 字体加粗 font-weight:bold(加粗)/normal(去掉加粗);
3. 斜体： font-style:italic 
4. 字体设置： font-family: xxx,xxx,xxx;
	font: 字体大小 xxx,xxx,xxx;

###CSS的三大特性
1. 继承性
	标签可以继承上级标签的[[文本和字体]]相关的样式，部分标签自带效果不受继承影响，比如超链接a标签 自带的字体颜色不受影响，h1-h6自带的字体大小不受继承影响 
2. 层叠性
	不同的选择器有可能选择到同一个标签，如果作用的样式不同则样式层叠到一起全部生效，如果作用的样式相同则由优先级决定哪个生效。
3. 优先级
	作用范围越小优先级越高，  id选择器>class选择器>标签名>继承（属于间接选中） 

###定位方式：4+1种定位方式
####position定位 4种
1. 文档流定位(静态定位)， 默认的定位方式
- position:static
- 特点： 行内元素从左向右排列，块级元素从上到下排列 
- 如何控制元素的位置：通过外边距margin控制
2. 相对定位：
- 格式： position：relative
- 特点： 元素不脱离文档流（占着原来的位置），通过left/right/top/bottom 让元素从当前位置做位置偏移   
3. 绝对定位
- 格式： position：absolute
- 特点： 元素脱离文档流（不占原来的位置），通过left/right/top/bottom让元素相对于窗口或某一个上级元素（在上级元素中添加相对定位）做位置偏移 
4. 固定定位
- 格式： postion：fixed
- 特点： 元素脱离文档流，通过left/right/top/bottom让元素相对于窗口做位置偏移

1. 文档流定位(静态定位)  默认的定位方式
	position:static;
	特点： 从上到下 从左向右
	通过外边距改变元素位置
2. 相对定位 
	position:relative  
	特点： 不脱离文档流   通过left/right/top/bottom相对于当前位置做位置偏移
3. 绝对定位
	position:absolute
	特点： 脱离文档流  通过left/right/top/bottom相对于窗口(默认）或某一个上级元素（在元素中添加相对定位）做位置偏移
4. 固定定位
	position:fixed
	特点： 脱离文档流  通过left/right/top/bottom相对于窗口做位置偏移 
5. 浮动定位
	float:left/right
	特点:元素脱离文档流,从当前所在行向左或右浮动,当撞到上级元素边框或其他浮动元素时停止.
	场景:当需要把纵向排列改为横向排列是使用浮动定位
	注意:
		1)如果一行装不下会自动换行,再向指定方向浮动时可能会卡住
		2)清除浮动: clear: both; 
	
	