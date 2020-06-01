package com.mt.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Customer {
    @ApiModelProperty(name="customerId",value="xxxx",example="examle1111")
    public String customerId;
    @ApiModelProperty(name="customerName",value="xxxx2",example="examle11211")
    public String customerName;
    @ApiModelProperty(name="password",value="123456",example="123456")
    public String password;
    @ApiModelProperty(name="permissionId",value="5",example="examle1111")
    public  Integer permissionId;
    @ApiModelProperty(name="phone",value="xxxx",example="15811111111")
    public String phone;
    @ApiModelProperty(name="email",value="xxxx",example="xxx@xxx.xxx")
    public String email;
    @ApiModelProperty(name="avatar",value="xxxx",example="xxx")
    public String avatar;

     public  Customer(){};

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", password='" + password + '\'' +
                ", permissionId=" + permissionId +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
    public Integer getPermissionId() {
        return permissionId;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
