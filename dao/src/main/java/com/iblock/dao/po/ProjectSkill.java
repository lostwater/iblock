package com.iblock.dao.po;

import java.util.Date;

public class ProjectSkill {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROJECT_SKILL.id
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROJECT_SKILL.project_id
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    private Long projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROJECT_SKILL.skill_id
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    private Integer skillId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROJECT_SKILL.status
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROJECT_SKILL.update_time
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROJECT_SKILL.add_time
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    private Date addTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROJECT_SKILL.id
     *
     * @return the value of PROJECT_SKILL.id
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROJECT_SKILL.id
     *
     * @param id the value for PROJECT_SKILL.id
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROJECT_SKILL.project_id
     *
     * @return the value of PROJECT_SKILL.project_id
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROJECT_SKILL.project_id
     *
     * @param projectId the value for PROJECT_SKILL.project_id
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROJECT_SKILL.skill_id
     *
     * @return the value of PROJECT_SKILL.skill_id
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public Integer getSkillId() {
        return skillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROJECT_SKILL.skill_id
     *
     * @param skillId the value for PROJECT_SKILL.skill_id
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROJECT_SKILL.status
     *
     * @return the value of PROJECT_SKILL.status
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROJECT_SKILL.status
     *
     * @param status the value for PROJECT_SKILL.status
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROJECT_SKILL.update_time
     *
     * @return the value of PROJECT_SKILL.update_time
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROJECT_SKILL.update_time
     *
     * @param updateTime the value for PROJECT_SKILL.update_time
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROJECT_SKILL.add_time
     *
     * @return the value of PROJECT_SKILL.add_time
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROJECT_SKILL.add_time
     *
     * @param addTime the value for PROJECT_SKILL.add_time
     *
     * @mbggenerated Sun Jul 17 12:02:29 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}