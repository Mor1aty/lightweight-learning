# 一、JShell（JAVA9 开始支持）

​	JShell 类似 Python 中的 shell。

​	在 bin 目录下，打开 JShell。

# 二、Dynamic Class-File Constants 类文件新添的一种结构

​	Java 的类型文件将被拓展，支持一种新的常量池格式：CONSTANT Dynamic，加载 CONSTANT Dynamic 会将创建委托给 bootstrap 方法。

​	目的是降低开发新形式的可实现类文件约束带来的成本和干扰。



# 三、局部变量类型推断（var 并非关键字）

​	类型推断，可以省略对象引用。

`var list = new ArrayList<String>();`

​	var 并非关键字，仅仅是一个语法糖。所以以下代码是成立的。

`int var = 1;`

​	var 需要慎用，容易丢失多态的优势。



注意点：

1. `var a;`这样不可以，因为无法推断。
2. 类的局部变量不能使用 var。



​	允许 lambda 表达式使用 var 变量，就可以在 lambda 表达式的参数上写注解了。

`(@Nonnull var x) -> x.process()`



# 四、新添加的 API

