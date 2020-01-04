###BootStrap
- 是一个当前比较流行的前端框架，基于html/css/js/jquery实现，由Twitter公司开发
- 内部工作原理，只需要给标签添加class属性，Bootstrap会自动匹配到该标签添加各种样式 
####创建第一个Bootstrap页面
- 官网下载地址：  www.bootcss.com
- 从doc.tedu.cn 下载 BootStrap starter
- 把解压出来的两个文件夹复制粘贴到 1906web文件夹下
- 如果需要在新的页面中使用Bootstrap 则复制starter.html 改文件名的方式
- class="well" Well是一种会引起内容凹陷显示或插图效果的容器 <div>。 

####按钮
- 三种标签都可以作为按钮使用   
	input type=button/submit   
	button
	a
- 有不同的预设样式 	参考文档
- 有不同预设尺寸  	 	参考文档
####字体图标(组件)
1. Bootstrap自带图标   glyphicon glyphicon-asterisk
2. 第三方图标    fa fa-address-book
	注意:字体颜色改变,对应的图标会随之变化
####导航(组件)
- 标签式和胶囊式 参考文档
- 可展开的标签 参考文档

####下拉菜单

#### small字体标签    class="text-left/right/center"

###响应式布局
- 根据不同的设备响应不同的样式
- 媒体查询： 是Bootstrap中实现响应式布局的实现方式
	@media (max-width: 768px) { ... }
	@media (min-width: 768px) and (max-width: 992px) { ... }
	@media (min-width: 992px) and (max-width: 1200px) { ... }
	@media (min-width: 1200px) { ... }
###栅格系统  参考文档
	<div class="row"></div>
- 一行有12列 可以任意组合  
- 栅格嵌套 每嵌套一次 都会有新的12列   

###容器定位
例如:
<div class="container">内容</div>
	页面缩放时,如果需要将内容居中显示,则需要将行添加到container中
<div class="container-fluid">内容</div>
两种值代表了两种不同的元素定位方式



文本元素样式:
<small>文本</small>			文本内容变小
<strong>文本</strong>		文本着重显示
<em>文本</em>				文本斜体显示

文本元素对齐:
<p class="text-left">文本</p> 
<p class-"text-center">文本</p> 
<p class-"text-right">文本</p>