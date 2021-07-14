# 一、局部变量类型推断

​	var 保留类型，不是关键字

```java
public class VarDemo {
    /**
     * 1. 只针对局部变量
     * 2. var 是保留类型，不是关键字。意味着我们还可以用 var 来定义变量名或者是方法名
     * 3. var 不允许赋值为 null
     * 4. var 不能定义方法参数的，因为没有值无法进行类型推断
     *
     * @param args String
     */
    public static void main(String[] args) {
        var i = 1;
        System.out.println(i);

        var s = "123";
        System.out.println(s);

        var list = new ArrayList<String>();
        list.add("123");
        for (var ss : list) {
            System.out.println(ss);
        }

        var map = new HashMap<String, String>();
        map.put("test", "tt");
        for (var elem : map.entrySet()) {
            System.out.println(elem);
        }

        var user = new User();
        user.setAge("12");
        user.setName("张三");

        System.out.println(user);

        // var aa = null;

    }
}

class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
```



# 二、垃圾收集器优化

​	JAVA9：新生代使用 ParNew 收集器。老年代使用 Parallel Old 收集器。

​	`Stop The World`

​	JAVA10：改为 G1 收集器，G1（Garbage-First）是一个全收集器。



# 三、新增 73 个新功能扩展 API 类库

## 3.1、copyOf

​	在 `java.util.List`、`java.util.Set`、`java.util.Map`新增加了一个静态方法 `copyOf`

​	这些方法按照其迭代顺序返回一个不可修改的列表、集合或映射包含了给定元素的集合。

```java
public class CopyOfDemo {

    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        var list1 = List.copyOf(list);
        System.out.println(list1);

        var set = new HashSet<>();
        set.add("d");
        set.add("b");
        set.add("a");
        System.out.println(Set.copyOf(set));

        var map = new HashMap<String, String>();
        map.put("k1","v2");
        map.put("k2","v2");
        System.out.println(Map.copyOf(map));
    }
}
```

## 3.2、toString

​	在`java.io.ByteArrayOutputStream`新增了一个方法`toString(Charset)`。重载 `toString`方法，通过使用指定的字符集编码字节，将缓冲区的内容输出为指定编码。

```java
public class ToStringDemo {
    public static void main(String[] args) {
        var str = "张三";
        var bis = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_16));
        var bos = new ByteArrayOutputStream();

        var c = 0;
        while ((c = bis.read()) != -1) {
            bos.write(c);
        }

        System.out.println(bos.toString(StandardCharsets.UTF_16));
    }
}
```

## 3.3、java.io.PrintStream、java.io.PrintWriter 新增构造方法

​	在`java.io.PrintStream`、`java.io.PrintWriter`新增了三个构造方法，需要指定 Charset。

```java
public class ConstructDemo {
    public static void main(String[] args) throws IOException {
        var str = "张三";
        var p = new PrintWriter("e://aa.txt", StandardCharsets.UTF_8);
        p.println(str);
        p.flush();
        p.close();
    }
}
```

## 3.4、transferTo

​	在`java.io.Reader`中新增`transferTo`方法，方法作用是从 Reader 中读取所有字符串，并按照所读取的顺序写入指定的 Writer。

```java
public class TransferToDemo {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("e://aa.txt"), StandardCharsets.UTF_8));
        var p = new PrintWriter(new File("e://cc.txt"));
        reader.transferTo(p);
        p.flush();
        p.close();
        reader.close();
    }
}
```

## 3.5、java.util.Formatter、java.util.Scanner 新增构造方法

​	在`java.util.Formatter`、`java.util.Scanner`新增构造方法，允许输入 Charset。

```java
public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        var scan = new Scanner(new FileInputStream("e://aa.txt"), StandardCharsets.UTF_8);
        scan.useDelimiter("为");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
    }
}
```

