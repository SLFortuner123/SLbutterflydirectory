package com.slfortuner.slbutterflydirectory;


public class Butterfly {

    private String cName;
    private String sName;
    private String imgURL;

    public Butterfly(String cName, String sName, String imgURL) {
        this.cName = cName;
        this.sName = sName;
        this.imgURL = imgURL;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String birthday) {
        this.imgURL= birthday;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getSName() { return sName; }

    public void setName(String sex) {
        this.sName = sex;
    }
}
