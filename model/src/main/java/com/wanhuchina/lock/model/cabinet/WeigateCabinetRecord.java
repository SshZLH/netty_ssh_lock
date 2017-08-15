package com.wanhuchina.lock.model.cabinet;

import com.wanhuchina.lock.model.base.BaseDO;

public class WeigateCabinetRecord extends BaseDO {
    private String careId;

    private String orderId;

    private String cabinetId;

    private String careCreateTime;

    private String wahoceId;

    private String careQueryTime;

    private String careCabinetStatus;

    private String careOperator;

    private String careReturnTime;

    private String careReturnStatus;

    private String careOpenTime;

    private String careClosTime;

    private String careStateLock;

    public String getCareId() {
        return careId;
    }

    public void setCareId(String careId) {
        this.careId = careId == null ? null : careId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(String cabinetId) {
        this.cabinetId = cabinetId == null ? null : cabinetId.trim();
    }

    public String getCareCreateTime() {
        return careCreateTime;
    }

    public void setCareCreateTime(String careCreateTime) {
        this.careCreateTime = careCreateTime == null ? null : careCreateTime.trim();
    }

    public String getWahoceId() {
        return wahoceId;
    }

    public void setWahoceId(String wahoceId) {
        this.wahoceId = wahoceId == null ? null : wahoceId.trim();
    }

    public String getCareQueryTime() {
        return careQueryTime;
    }

    public void setCareQueryTime(String careQueryTime) {
        this.careQueryTime = careQueryTime == null ? null : careQueryTime.trim();
    }

    public String getCareCabinetStatus() {
        return careCabinetStatus;
    }

    public void setCareCabinetStatus(String careCabinetStatus) {
        this.careCabinetStatus = careCabinetStatus == null ? null : careCabinetStatus.trim();
    }

    public String getCareOperator() {
        return careOperator;
    }

    public void setCareOperator(String careOperator) {
        this.careOperator = careOperator == null ? null : careOperator.trim();
    }

    public String getCareReturnTime() {
        return careReturnTime;
    }

    public void setCareReturnTime(String careReturnTime) {
        this.careReturnTime = careReturnTime == null ? null : careReturnTime.trim();
    }

    public String getCareReturnStatus() {
        return careReturnStatus;
    }

    public void setCareReturnStatus(String careReturnStatus) {
        this.careReturnStatus = careReturnStatus == null ? null : careReturnStatus.trim();
    }

    public String getCareOpenTime() {
        return careOpenTime;
    }

    public void setCareOpenTime(String careOpenTime) {
        this.careOpenTime = careOpenTime == null ? null : careOpenTime.trim();
    }

    public String getCareClosTime() {
        return careClosTime;
    }

    public void setCareClosTime(String careClosTime) {
        this.careClosTime = careClosTime == null ? null : careClosTime.trim();
    }

    public String getCareStateLock() {
        return careStateLock;
    }

    public void setCareStateLock(String careStateLock) {
        this.careStateLock = careStateLock == null ? null : careStateLock.trim();
    }
}