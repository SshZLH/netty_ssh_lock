package com.wanhuchina.lock.model.cabinet;

import com.wanhuchina.lock.model.base.BaseDO;

public class WeigateCabi extends BaseDO {
    private String cabiId;

    private String wahoId;

    private String cabinetNo;

    private String cabiIsdel;

    private String cabiLastAccessTime;

    public String getCabiId() {
        return cabiId;
    }

    public void setCabiId(String cabiId) {
        this.cabiId = cabiId == null ? null : cabiId.trim();
    }

    public String getWahoId() {
        return wahoId;
    }

    public void setWahoId(String wahoId) {
        this.wahoId = wahoId == null ? null : wahoId.trim();
    }

    public String getCabinetNo() {
        return cabinetNo;
    }

    public void setCabinetNo(String cabinetNo) {
        this.cabinetNo = cabinetNo == null ? null : cabinetNo.trim();
    }

    public String getCabiIsdel() {
        return cabiIsdel;
    }

    public void setCabiIsdel(String cabiIsdel) {
        this.cabiIsdel = cabiIsdel == null ? null : cabiIsdel.trim();
    }

    public String getCabiLastAccessTime() {
        return cabiLastAccessTime;
    }

    public void setCabiLastAccessTime(String cabiLastAccessTime) {
        this.cabiLastAccessTime = cabiLastAccessTime == null ? null : cabiLastAccessTime.trim();
    }
}