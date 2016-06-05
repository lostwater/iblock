package com.iblock.dao;

import com.iblock.dao.po.Skill;

import java.util.List;

public interface SkillDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKILL
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insert(Skill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKILL
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insertSelective(Skill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKILL
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    Skill selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKILL
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKeySelective(Skill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKILL
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKey(Skill record);

    List<Skill> selectAll();

    List<Skill> selectByIds(List<Integer> ids);
}