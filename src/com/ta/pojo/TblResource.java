package com.ta.pojo;

public class TblResource {
    private Integer id;

    private String url;

    private String perm;

    private Boolean power;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm == null ? null : perm.trim();
    }

    public Boolean getPower() {
        return power;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }
}