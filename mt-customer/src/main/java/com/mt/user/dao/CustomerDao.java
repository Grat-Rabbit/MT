package com.mt.user.dao;

import com.mt.user.pojo.Customer;
import jdk.nashorn.internal.parser.Token;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerDao {
    /**
     * 搜索所有用户信息
     */
    List<Customer> listAllCustomer();

    /**
     * 通过id查询用户
     */
    Customer getCustomerById(@Param("customerId") String customerId);

    /**
     * 通过用户名查询用户
     */
    Customer getCustomerByName(@Param("customerName") String customerName);

    /**
     * 新增用户
     */
    boolean insertCustomer(@Param("customer") Customer customer);

    /**
     * 更新用户信息
     */
    boolean updateCustomer(@Param("customer") Customer customer);

    /**
     * 更新用户头像
     * 等待调用委甄上传服务接口
     */
    boolean updateAvatar(@Param("avatar") String avatar);
}