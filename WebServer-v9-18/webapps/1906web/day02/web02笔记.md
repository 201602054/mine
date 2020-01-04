###课程回顾
1. 文本相关： 
- 内容标题： h1-h6  独占一行 字体加粗 自带上下间距，字体从大到小 ，align="left/right/center"
- 段落标签： p  独占一行 自带上下间距
- 字体加粗 b    斜体  i     换行 br
2. 列表标签
- 无序列表  ul:type     li
- 有序列表  ol:type  start   reversed       li
- 定义列表  dl   dt   dd   
- 列表嵌套: 有序和无序可以任意无限嵌套 
3. 图片标签img
- src: 图片路径
	相对路径：访问站内资源时使用相对路径
		1. 图片和页面在同一目录： 直接写图片名
		2. 图片在上级目录： ../图片名
		3. 图片在下级目录： 文件夹名/图片名
	绝对路径：访问站外资源时使用绝对路径，又称为盗链，节省本站资源，但是有可能存在找不到图片的风险
- alt: 图片不能正常显示时显示的文本
- title: 鼠标悬停时显示的文本
- width/height:  两种赋值方式：1. 像素  2. 上级元素的百分比  如果只设置宽度 高度会等比例缩放
4. 超链接 a
- href: 路径   可以指向页面 也可以指向文件（浏览器支持浏览则浏览，不支持则下载）
- 如果不写href属性就是一个纯文本
- 如果a标签包裹的是文本则是文本超链接，包裹的是图片则是图片超链接
5. 表格 table
- table:border 边框的粗细 
- 子标签： tr td：rowspan跨行  colspan跨列  th表头  caption表格标题  
6. 表单 form 
- action：提交地址  
- 控件：   <input type="text/pasword/radio/checkbox/date/file/submit" name   value placeholder占位文本   checked默认选中  >
	下拉选<select name><option value="xxx">xxx</option></select>

###修改eclipse缩进方式
- window->preferences->web->html files->Editor->勾选Indent use spaces  把下面的1改成2

###实体引用(特殊字符)
- 空格： 空格折叠现象（连续出现多个空格只能识别1个空格） &nbsp;
- 小于号：&lt;
- 大于号：&gt;
###分区标签
- 作用： 将多个相关标签添加到一个分区标签中，便于统一管理，可以理解成是一个容器
- div: 独占一行 
- span: 共占一行 
- 一般页面至少分为三大区：
	<div>头</div>
	<div>正文内容</div>
	<div>脚</div>
- html5中新增分区标签：(目的：为了代码可读性更高)
	1. header 头
	2. article文章
	3. section(块、区域)
	4. footer 脚
	5. nav 导航
- h5页面区域
	<header>头</header>
	<article>文章正文</article> 或 <section></section>
	<footer>脚</footer>

###CSS
- Casecading层叠Style样式Sheet表
- 作用： 用于美化页面
####CSS的引入方式
- 内联样式：在标签中的style属性里面添加样式代码，弊端：不能复用
- 内部样式：在head标签中添加style标签，在标签体内写样式代码，好处：可以当前页面复用，弊端：只能当前页面复用不能多页面复用 
- 外部样式：在单独的css文件中写样式代码，通过link标签引入到html页面中，好处：可以多页面复用，并且可以将html代码和css代码分离
####选择器
1. 标签名选择器
- 格式:  标签名{样式代码}
- 场景： 需要给页面中所有某一种标签添加样式时使用
2. id选择器
- 页面中任何标签都可以添加一个id属性 ，页面中的标签尽量不要重复 
- 格式： #id{样式代码}
- 场景：需要给页面中某一个标签添加样式时使用
3. 类选择器
- 格式： .class{样式代码}
- 场景： 当需要给页面中几个不相关的标签添加相同样式时使用
4. 分组选择器
- 将多个选择器合并成一个选择器
- 格式： h3,#abc,.c1{样式代码}
5. 子孙后代选择器
- 通过元素之间的关系选择元素
- 格式： div div span{样式代码}
6. 子元素选择器
- 通过元素之间的关系选择元素
- 格式： div>div>span{样式代码}
7. 属性选择器
- 通过元素的属性选择
- 格式： 标签名[属性名='值']{样式代码}
8. 伪类选择器
- 选择的是元素的状态 
- 			未访问状态   访问过状态  悬停状态   点击状态
- 格式：a:   link/	   visited/  hover/   active	{样式代码}
9. 任意元素选择器
- 选择页面中所有的标签
- 格式：  *{样式代码}
###各种常见样式
####颜色赋值
- 三原色： 红绿蓝  red green  blue    rgb  每种颜色取值范围0-255
1. 颜色单词赋值  red/green
2. 6位16进制赋值 #ff0000   
3. 3位16进制赋值 #f00 
4. 3位10进制赋值 rgb(0-255,0-255,0-255);    rbg(255,0,0)
5. 4位10进制赋值 rgba(0-255,0-255,0-255,0-1)  a=alpha透明度  
####背景图片

	background-image: url("../imgs/a.jpg");
    /* 修改背景图片尺寸 */
    background-size: 100px 100px;
    /* 禁止重复 */ 
    background-repeat: no-repeat;
    /* 控制位置 横向百分比 和 纵向百分比 */
    background-position: 90% 90%;
####显示方式： display
1. block:块级元素的默认值,可以修改宽高,独占一行
	块级元素： 独占一行  包括h1-h6,p,div
2. inline：行内元素的默认值,不能修改宽高,共占一行
	行内元素： 共占一行 包括span,b,i
3. inline-block：行内块，可以修改宽高，也可以共占一行
###盒子模型
- 宽高+外边距+边框+内边距=盒子模型
####盒子模型之宽高
- width、height: 赋值方式有两种： 1. 像素  2. 上级元素的百分比
- 行内元素不能修改宽高，宽高由内容决定
####盒子模型之外边距
- 元素距上级元素或相邻兄弟元素的距离称为外边距
- 行内元素上下外边距无效
- 粘连问题：当元素的上边缘和上级元素的上边缘重叠时，给元素添加上外边距，会出现粘连问题，给上级元素添加overflow：hidden解决
- 赋值方式：
	margin-left/right/top/bottom:10px;
	margin:20px; 四个方向全部20个像素
	margin:20px 40px; 上下20px  左右40px
	margin:0 auto;  居中
	margin:10px 20px 30px 40px;  上右下左 顺时针 
















