### 有用的知识
#### 注解
**@Mapper**

注解的作用相当于在mybatis-config.xml中注册mapper.xml文件。

**@Param**

注解用来标识传递给sql语句的参数名称是什么、

**@RestController**

注解用来表示该类标识为一个处理请求的处理器

**@RequestMapping**

用来表示标识http请求与该控制器中方法之间的映射关系

**@PathVariable**

注解用于接收请求路径中占位符的值

**@RequestBody**

注解用于将前台传过来的json对象转换为后台的Java对象

**@Service**

注解用于表示将该类注入到spring容器中，从而使得其能够注入到其他类中