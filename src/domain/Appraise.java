package domain;

/**
 * 用户评价实体类
 */
public class Appraise {
    private String waresid;

    private String userid;

    private String appraisecontent;

    public String getWaresid() {
        return waresid;
    }

    public void setWaresid(String waresid) {
        this.waresid = waresid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAppraisecontent() {
        return appraisecontent;
    }

    public void setAppraisecontent(String appraisecontent) {
        this.appraisecontent = appraisecontent;
    }
}