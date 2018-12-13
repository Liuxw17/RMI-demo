package rmi;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * @Author: neverX2017
 * @Description: 定义的Userinfo信息，就是一个普通的POJO对象
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -377525163661420263L;

    private String userName;
    private String userDesc;
    private Integer userAge;
    private Boolean userSex;

    public UserInfo() throws RemoteException{

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }
}
