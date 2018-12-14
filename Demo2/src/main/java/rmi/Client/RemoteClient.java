package rmi.Client;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import rmi.Server.RemoteServiceInterface;
import rmi.UserInfo;

import java.rmi.Naming;
import java.util.List;

/**
 * @Author: neverX2017
 * @Description: 客户端调用RMI测试
 */
public class RemoteClient {

    static {
        BasicConfigurator.configure();
    }
    /**
     * 日志
     */
    private static final Log LOGGER = LogFactory.getLog(RemoteClient.class);
    public static void main(String [] args) throws Exception{
        //这里使用的是java名称服务技术进行的RMI接口查找
        RemoteServiceInterface remoteServiceInterface = (RemoteServiceInterface) Naming.lookup("rmi://10.141.221.142:1099/queryAllUserinfo");
        List<UserInfo> users = remoteServiceInterface.queryAllUserinfo();

        RemoteClient.LOGGER.info("users.size() = " +users.size());
    }
}
