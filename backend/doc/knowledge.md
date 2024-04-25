### 有用的知识

#### 特殊代码段
1. 跨域配置
```Java
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.setMaxAge(MAX_AGE);
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }
```
这段代码是一个 Spring Boot 应用中用来配置 CORS（跨源资源共享）的过滤器。CORS 是一种跨域资源共享的机制，允许服务器在响应中设置一些 HTTP 头部，以便让浏览器可以绕过同源策略，从而实现跨域访问。通常情况下，当浏览器发起跨域请求时，服务器需要在响应中包含一些 CORS 头部，指示浏览器是否允许该请求。

**这段代码中的作用是创建一个 CorsFilter 实例，并配置了允许所有来源的请求（*），允许所有头部信息和所有请求方法。同时，还设置了一个最大缓存时间。最后，这个过滤器会应用到所有的 URL 匹配模式上（/**）。**

这样配置后，Spring Boot 应用就可以允许跨域请求了，客户端可以从其他源（不同的域、协议或端口）获取资源而无需受到浏览器的限制。
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