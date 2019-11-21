# thrift-demo
>  spring boot集成thrift

### 1 项目使用了lombok

项目使用了lombok来自动生成Getter,Setter,Constructor,ToString等方法

lombok的具体用法参考:  https://jingyan.baidu.com/article/0a52e3f4e53ca1bf63ed725c.html

### 2 项目使用了thrift

thrift的具体用法参考:  https://segmentfault.com/a/1190000015001012

使用thrift生成java代码的命令：

```
thrift-0.13.0.exe -r -gen java FileTransService.thrift
```

thrift-0.13.0.exe下载地址:  http://www.apache.org/dyn/closer.cgi?path=/thrift/0.13.0/thrift-0.13.0.exe

