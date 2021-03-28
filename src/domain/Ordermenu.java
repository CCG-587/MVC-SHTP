package domain;

import java.util.Date;

/**
 * 商品订单实体类
 */
public class Ordermenu {
    private Integer orderid;

    private String userid;

    private String waresid;

    private String orderstate;

    private Date orderbegdate;

    private Date orderenddate;

    private String receiveadd;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getWaresid() {
        return waresid;
    }

    public void setWaresid(String waresid) {
        this.waresid = waresid;
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }

    public Date getOrderbegdate() {
        return orderbegdate;
    }

    public void setOrderbegdate(Date orderbegdate) {
        this.orderbegdate = orderbegdate;
    }

    public Date getOrderenddate() {
        return orderenddate;
    }

    public void setOrderenddate(Date orderenddate) {
        this.orderenddate = orderenddate;
    }

    public String getReceiveadd() {
        return receiveadd;
    }

    public void setReceiveadd(String receiveadd) {
        this.receiveadd = receiveadd;
    }
}