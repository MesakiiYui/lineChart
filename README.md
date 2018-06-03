### 1.项目描述：

使用springboot+webservice将数据发送给前端生成折线统计图



### 2.项目组成

该项目一共分为三部分：

1.源数据端(spring boot)

microservice-simple-provider-user

2.数据接收端(spring boot)

microservice-simple-consumer-receive

3.折线图生成(html5 + vue + bootstrap + echarts)

Linechart

#### 三部分程序完全独立，需要各自配置运行

### 3.如何运行：

1.启动源数据端

应当可以访问
```
    http://localhost:7900/simple/1
```

url最后一位为id,测试时可以访问到 7 

2.启动数据接收端

应当可以访问
```
http://localhost:7901/data/1
```
url最后一位为id,测试时可以访问到 7 

3.启动前端，

可以将第二步生成的地址输入表单，直接生成统计图，

第一个输入框用于生成对比图

第二个输入框用于生成独立折线图


前两个项目已经打成jar包，测试时可以直接运行jar包

java -jar xxx.jar


    
    



