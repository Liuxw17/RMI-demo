## RMI-Demo
### 背景
远程系统管理接口SystemManager允许客户端远程调用其内部的某个方法，来获取服务器环境下某个属性的值。  
因此，第一步需要在服务端和与之通信的客户端环境下，定义一个完全一样的SystemManager接口，将此接口标记为远程对象。
### RMI调用流程图
![](http://tuku.sivanliu.com/18-12-13/42201416.jpg)
### Demo1
如果使用的是eclipse编写了您第一个RMI Server和RMI Client，
并且使用的是“本地RMI 注册表”。
那么不需要做任何的配置、脚本指定等工作（包括不需要专门设置JRE权限、
不需要专门指定classpath、不需要专门生成Stub和Skeleton），
就可以看到RMI的运行和调用效果了：可以看到，
RemoteUnicastMain中的代码执行完成后整个应用程序没有退出。  
这是因为这个应用程序要承担“真实的RMI Server实现”的服务调用。
如果它退出，RMI 注册表就无法请求真实的服务实现了。
### Demo2
将RMI Server与 RMI注册表 分离在不同的JVM。

### 其它
- 对日志部分掌握的还不熟练；







参考资料：  
https://blog.csdn.net/yinwenjie/article/details/49120813  
https://blog.csdn.net/kingcat666/article/details/78578578  
````````````````
