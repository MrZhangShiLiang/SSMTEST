package org.zsl.po;

import java.util.Date;
import java.util.List;

public class ZslOrders {
    private Integer id;

    private Integer userid;

    private String number;

    private Date createtime;

    private String note;



    private List<ZslOrderdetail> orderdetails;

    public List<ZslOrderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<ZslOrderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }



    private ZslUser zslUser;

    public ZslUser getZslUser() {
        return zslUser;
    }

    public void setZslUser(ZslUser zslUser) {
        this.zslUser = zslUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}