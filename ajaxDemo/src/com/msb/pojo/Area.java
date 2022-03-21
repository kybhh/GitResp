package com.msb.pojo;

import java.io.Serializable;

/**
 * @Auther: ms
 * @Date: 2022/3/20 0020 - 03 - 20 - 14:34
 * @Description: com.msb.pojo
 * @version: 1.0
 */
public class Area implements Serializable {

    private Integer areaid;
    private String areaname;
    private Integer parentid;
    private Integer arealevel;
    private Integer status;

    @Override
    public String toString() {
        return "Area{" +
                "areaid=" + areaid +
                ", areaname='" + areaname + '\'' +
                ", parentid=" + parentid +
                ", arealevel=" + arealevel +
                ", status=" + status +
                '}';
    }

    public Area() {
    }

    public Area(Integer areaid, String areaname, Integer parentid, Integer arealevel, Integer status) {
        this.areaid = areaid;
        this.areaname = areaname;
        this.parentid = parentid;
        this.arealevel = arealevel;
        this.status = status;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getArealevel() {
        return arealevel;
    }

    public void setArealevel(Integer arealevel) {
        this.arealevel = arealevel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
