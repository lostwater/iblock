package com.iblock.dao;

import com.iblock.dao.po.Manager;

public interface ManagerDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insert(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insertSelective(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    Manager selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKeySelective(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKey(Manager record);
}