package domain;

/**
 * 好友表实体类
 */
public class Friends {
    private String userid;

    private String otherid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOtherid() {
        return otherid;
    }

    public void setOtherid(String otherid) {
        this.otherid = otherid;
    }
}