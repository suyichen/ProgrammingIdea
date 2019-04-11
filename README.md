# 构造方法
<https://blog.csdn.net/yichen97/article/details/89153634>

**特点：**
1. 构造方法的方法名必须和类名完全保持一致，包括大小写。

2. 构造方法不能在方法名前面定义方法类型，即不能定义void，也不能有返回值（不能有return语句）。

3. 构造方法的作用是完成对象的初始化，能够把定义对象时的参数传给对象的域。

4. 构造方法不能自己调用，对象初始化的时候由系统自动调用。

5. 一个类中的构造方法可以重载；在没有定义构造方法的时候，编译时自动生成一个默认构造方法（无参，方法体为空）。

**无参/有参/重载**
```javascript
public class Son {
 
    private String name;
    private int age;
 
    public Son(){
        this.name = "Tom";
        this.age = 30;
    }
 
    public Son(String name,int age){
         this.name = name;
         this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
}
```
**设置默认值**

```javascript
    public Son(String name,int age,int height){
      this.name = name;
      this.age = age;
      this.height = height;
   }
 
    public Son(int hegiht){
      this("Tom",18,hegiht);
    }
    
    public Son(int age,int height){
       this("Nick",age,height);
    }
```

