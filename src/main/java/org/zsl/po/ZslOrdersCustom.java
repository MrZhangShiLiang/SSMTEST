package org.zsl.po;

/**
 * @author zsl
 * @date 2020/2/7
 */
public class ZslOrdersCustom extends ZslOrders{
    private String userName;
    private String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
