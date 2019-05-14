# java-spring-boot-uid-generator-vesta
java-spring-boot-uid-generator vesta 生成


官方
https://github.com/cloudatee/vesta-id-generator


# 先打包官方

```java
mvn clean install -DskipTests -Dmaven.test.skip=true
```
在执行打包时报错
```java
[ERROR] 不再支持源选项 5。请使用 6 或更高版本。
[ERROR] 不再支持目标选项 1.5。请使用 1.6 或更高版本。
```
在pom 中增加如下，即可打包成功

```java
<properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>
```
# 生成 id流水号

```html
http://localhost:8080/genid
```
输出
```html
2351003345564468221
```

# 反解出流水号所代表的意义

```html
http://localhost:8080/expid?id=2351003345564468221
```
返回
```html
{"machine":1021,"seq":0,"time":43068252898,"genMethod":0,"type":1,"version":0}
```