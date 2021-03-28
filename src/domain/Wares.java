package domain;

import java.util.Date;

/**
 * 商品实体类
 */
public class Wares {
    private String id;//编号

    private String userid;//用户编号

    private String name;//商品名称

    private Double originalprice;//原价

    private Double currentprice;//现价

    private Integer stock;//库存

    private String state;//状态

    private String type;//类别

    private Date date;//上架时间

    @Override
    public String toString() {
        return "Wares{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", originalprice=" + originalprice +
                ", currentprice=" + currentprice +
                ", stock=" + stock +
                ", state='" + state + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }

    public Wares() {
    }

    public Wares(String id, String userid, String name, Double originalprice, Double currentprice, Integer stock, String state, String type, Date date) {
        this.id = id;
        this.userid = userid;
        this.name = name;
        this.originalprice = originalprice;
        this.currentprice = currentprice;
        this.stock = stock;
        this.state = state;
        this.type = type;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Double originalprice) {
        this.originalprice = originalprice;
    }

    public Double getCurrentprice() {
        return currentprice;
    }

    public void setCurrentprice(Double currentprice) {
        this.currentprice = currentprice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}