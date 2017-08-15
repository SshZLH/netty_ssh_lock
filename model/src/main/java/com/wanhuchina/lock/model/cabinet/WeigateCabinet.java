package com.wanhuchina.lock.model.cabinet;

import com.wanhuchina.lock.model.base.BaseDO;

public class WeigateCabinet extends BaseDO {
    private String cabinetId;

    private String cabinetNo;

    private String cabinetStatus;

    private String cabinetIsdel;

    private String cabinetPassword;

    private String cabinetDoorNo;

    private String wahoId;

    private String cabinetSupperPassword;

    private String cabiId;

    private String wahoceId;

    private String cabinetOpenTime;

    private String cabinetClosTime;

    private String cabinetStateLock;


    public String getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(String cabinetId) {
        this.cabinetId = cabinetId == null ? null : cabinetId.trim();
    }

    public String getCabinetNo() {
        return cabinetNo;
    }

    public void setCabinetNo(String cabinetNo) {
        this.cabinetNo = cabinetNo == null ? null : cabinetNo.trim();
    }

    public String getCabinetStatus() {
        return cabinetStatus;
    }

    public void setCabinetStatus(String cabinetStatus) {
        this.cabinetStatus = cabinetStatus == null ? null : cabinetStatus.trim();
    }

    public String getCabinetIsdel() {
        return cabinetIsdel;
    }

    public void setCabinetIsdel(String cabinetIsdel) {
        this.cabinetIsdel = cabinetIsdel == null ? null : cabinetIsdel.trim();
    }

    public String getCabinetPassword() {
        return cabinetPassword;
    }

    public void setCabinetPassword(String cabinetPassword) {
        this.cabinetPassword = cabinetPassword == null ? null : cabinetPassword.trim();
    }

    public String getCabinetDoorNo() {
        return cabinetDoorNo;
    }

    public void setCabinetDoorNo(String cabinetDoorNo) {
        this.cabinetDoorNo = cabinetDoorNo == null ? null : cabinetDoorNo.trim();
    }

    public String getWahoId() {
        return wahoId;
    }

    public void setWahoId(String wahoId) {
        this.wahoId = wahoId == null ? null : wahoId.trim();
    }

    public String getCabinetSupperPassword() {
        return cabinetSupperPassword;
    }

    public void setCabinetSupperPassword(String cabinetSupperPassword) {
        this.cabinetSupperPassword = cabinetSupperPassword == null ? null : cabinetSupperPassword.trim();
    }

    public String getCabiId() {
        return cabiId;
    }

    public void setCabiId(String cabiId) {
        this.cabiId = cabiId == null ? null : cabiId.trim();
    }

    public String getWahoceId() {
        return wahoceId;
    }

    public void setWahoceId(String wahoceId) {
        this.wahoceId = wahoceId == null ? null : wahoceId.trim();
    }

    public String getCabinetOpenTime() {
        return cabinetOpenTime;
    }

    public void setCabinetOpenTime(String cabinetOpenTime) {
        this.cabinetOpenTime = cabinetOpenTime == null ? null : cabinetOpenTime.trim();
    }

    public String getCabinetClosTime() {
        return cabinetClosTime;
    }

    public void setCabinetClosTime(String cabinetClosTime) {
        this.cabinetClosTime = cabinetClosTime == null ? null : cabinetClosTime.trim();
    }

    public String getCabinetStateLock() {
        return cabinetStateLock;
    }

    public void setCabinetStateLock(String cabinetStateLock) {
        this.cabinetStateLock = cabinetStateLock == null ? null : cabinetStateLock.trim();
    }
}