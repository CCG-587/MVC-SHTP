package domain;

/**
 * 商品实体类
 */
public class Wares {
    private String waresid;

    private String userid;

    private String waresname;

    private Double waresprice;

    private Integer waresstock;

    private String waresremarks;

    public Wares() {
    }

    public Wares(String waresid, String userid, String waresname, Double waresprice, Integer waresstock, String waresremarks) {
        this.waresid = waresid;
        this.userid = userid;
        this.waresname = waresname;
        this.waresprice = waresprice;
        this.waresstock = waresstock;
        this.waresremarks = waresremarks;
    }

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

    public String getWaresname() {
        return waresname;
    }

    public void setWaresname(String waresname) {
        this.waresname = waresname;
    }

    public Double getWaresprice() {
        return waresprice;
    }

    public void setWaresprice(Double waresprice) {
        this.waresprice = waresprice;
    }

    public Integer getWaresstock() {
        return waresstock;
    }

    public void setWaresstock(Integer waresstock) {
        this.waresstock = waresstock;
    }

    public String getWaresremarks() {
        return waresremarks;
    }

    public void setWaresremarks(String waresremarks) {
        this.waresremarks = waresremarks;
    }

    @Override
    public String toString() {
        return "Wares{" +
                "waresid='" + waresid + '\'' +
                ", userid='" + userid + '\'' +
                ", waresname='" + waresname + '\'' +
                ", waresprice=" + waresprice +
                ", waresstock=" + waresstock +
                ", waresremarks='" + waresremarks + '\'' +
                '}';
    }
}