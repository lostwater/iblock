package com.iblock.dao;

import com.iblock.dao.po.SubProcess;

public interface SubProcessDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUB_PROCESS
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insert(SubProcess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUB_PROCESS
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insertSelective(SubProcess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUB_PROCESS
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    SubProcess selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUB_PROCESS
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKeySelective(SubProcess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUB_PROCESS
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKey(SubProcess record);
}