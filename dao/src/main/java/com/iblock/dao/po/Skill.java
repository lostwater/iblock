package com.iblock.dao.po;

import java.util.Date;

public class Skill {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SKILL.id
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SKILL.name
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SKILL.status
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SKILL.add_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SKILL.update_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SKILL.id
     *
     * @return the value of SKILL.id
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SKILL.id
     *
     * @param id the value for SKILL.id
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SKILL.name
     *
     * @return the value of SKILL.name
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SKILL.name
     *
     * @param name the value for SKILL.name
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SKILL.status
     *
     * @return the value of SKILL.status
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SKILL.status
     *
     * @param status the value for SKILL.status
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SKILL.add_time
     *
     * @return the value of SKILL.add_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SKILL.add_time
     *
     * @param addTime the value for SKILL.add_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SKILL.update_time
     *
     * @return the value of SKILL.update_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SKILL.update_time
     *
     * @param updateTime the value for SKILL.update_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}