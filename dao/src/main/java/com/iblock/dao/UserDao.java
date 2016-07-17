package com.iblock.dao;

import com.iblock.dao.po.User;
import com.iblock.dao.po.UserDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbggenerated Mon Jan 25 16:29:39 CST 2016
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbggenerated Mon Jan 25 16:29:39 CST 2016
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbggenerated Mon Jan 25 16:29:39 CST 2016
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbggenerated Mon Jan 25 16:29:39 CST 2016
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbggenerated Mon Jan 25 16:29:39 CST 2016
     */
    int updateByPrimaryKey(User record);

    User selectUser(@Param("userName") String userName, @Param("password") String password);

    UserDetail selectDetailById(Long id);

    User selectByMobile(String mobile);

    List<User> selectByRole(@Param("role") Integer role);

    List<User> batchSelect(@Param("ids") List<Long> ids);
}