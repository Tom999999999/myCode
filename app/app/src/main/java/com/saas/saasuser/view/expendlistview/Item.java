package com.saas.saasuser.view.expendlistview;

import android.view.View;

/**
 * Simple POJO model for example
 */
public class Item {
    private String orderId;
    private String orderNum;
    private String isRole;
    private String strTag;
    private String price;
    private String pledgePrice;
    private String fromAddress;
    private String toAddress;
    private  String requestsCount;
    private String date;
    private String time;

    private View.OnClickListener requestBtnClickListener;

    public Item() {
    }

    public Item(String orderId, String orderNum, String isRole, String strTag, String price, String pledgePrice, String fromAddress, String toAddress, String requestsCount, String date, String time) {
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.isRole = isRole;
        this.strTag = strTag;
        this.price = price;
        this.pledgePrice = pledgePrice;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.requestsCount = requestsCount;
        this.date = date;
        this.time = time;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getIsRole() {
        return isRole;
    }

    public void setIsRole(String isRole) {
        this.isRole = isRole;
    }

    public String getStrTag() {
        return strTag;
    }

    public void setStrTag(String strTag) {
        this.strTag = strTag;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPledgePrice() {
        return pledgePrice;
    }

    public void setPledgePrice(String pledgePrice) {
        this.pledgePrice = pledgePrice;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getRequestsCount() {
        return requestsCount;
    }

    public void setRequestsCount(String requestsCount) {
        this.requestsCount = requestsCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener = requestBtnClickListener;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Item item = (Item) o;
//
//        if (requestsCount != item.requestsCount) return false;
//        if (price != null ? !price.equals(item.price) : item.price != null) return false;
//        if (pledgePrice != null ? !pledgePrice.equals(item.pledgePrice) : item.pledgePrice != null)
//            return false;
//        if (fromAddress != null ? !fromAddress.equals(item.fromAddress) : item.fromAddress != null)
//            return false;
//        if (toAddress != null ? !toAddress.equals(item.toAddress) : item.toAddress != null)
//            return false;
//        if (date != null ? !date.equals(item.date) : item.date != null) return false;
//        return !(time != null ? !time.equals(item.time) : item.time != null);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = price != null ? price.hashCode() : 0;
//        result = 31 * result + (pledgePrice != null ? pledgePrice.hashCode() : 0);
//        result = 31 * result + (fromAddress != null ? fromAddress.hashCode() : 0);
//        result = 31 * result + (toAddress != null ? toAddress.hashCode() : 0);
//        result = 31 * result + (requestsCount != null ? requestsCount.hashCode() : 0);
//        result = 31 * result + (date != null ? date.hashCode() : 0);
//        result = 31 * result + (time != null ? time.hashCode() : 0);
//        return result;
//    }



}
