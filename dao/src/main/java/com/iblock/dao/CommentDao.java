package com.iblock.dao;

import com.iblock.dao.po.Comment;

public interface CommentDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKey(Comment record);
}