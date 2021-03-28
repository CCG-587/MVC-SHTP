package domain;

import java.util.Date;

/**
 * 求购商品实体类
 */
public class Buywares {
    private String buywaresid;

    private String userid;

    private String waresname;

    private Integer acceptprice;

    private String pictureid;

    private Date publishdate;

    private String buystate;

    private String buyremarks;

    public String getBuywaresid() {
        return buywaresid;
    }

    public void setBuywaresid(String buywaresid) {
        this.buywaresid = buywaresid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getWaresname() {
        return waresname;
    }

    public void setWaresname(String waresname) {
        this.waresname = waresname;
    }

    public Integer getAcceptprice() {
        return acceptprice;
    }

    public void setAcceptprice(Integer acceptprice) {
        this.acceptprice = acceptprice;
    }

    public String getPictureid() {
        return pictureid;
    }

    public void setPictureid(String pictureid) {
        this.pictureid = pictureid;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public String getBuystate() {
        return buystate;
    }

    public void setBuystate(String buystate) {
        this.buystate = buystate;
    }

    public String getBuyremarks() {
        return buyremarks;
    }

    public void setBuyremarks(String buyremarks) {
        this.buyremarks = buyremarks;
    }
}