From: https://blog.csdn.net/yinwenjie/article/details/49120813
### 背景
远程系统管理接口SystemManager允许客户端远程调用其内部的某个方法，来获取服务器环境下某个属性的值。  
因此，第一步需要在服务端和与之通信的客户端环境下，定义一个完全一样的SystemManager接口，将此接口标记为远程对象。
### RMI调用流程图
![](http://tuku.sivanliu.com/18-12-13/42201416.jpg)