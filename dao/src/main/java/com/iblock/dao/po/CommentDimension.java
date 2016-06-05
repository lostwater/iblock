package com.iblock.dao.po;

import java.util.Date;

public class CommentDimension {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT_DIMENSION.id
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT_DIMENSION.dimension_type
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Byte dimensionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT_DIMENSION.score
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Float score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT_DIMENSION.comment_id
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Long commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT_DIMENSION.status
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT_DIMENSION.add_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT_DIMENSION.update_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT_DIMENSION.id
     *
     * @return the value of COMMENT_DIMENSION.id
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT_DIMENSION.id
     *
     * @param id the value for COMMENT_DIMENSION.id
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT_DIMENSION.dimension_type
     *
     * @return the value of COMMENT_DIMENSION.dimension_type
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Byte getDimensionType() {
        return dimensionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT_DIMENSION.dimension_type
     *
     * @param dimensionType the value for COMMENT_DIMENSION.dimension_type
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setDimensionType(Byte dimensionType) {
        this.dimensionType = dimensionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT_DIMENSION.score
     *
     * @return the value of COMMENT_DIMENSION.score
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Float getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT_DIMENSION.score
     *
     * @param score the value for COMMENT_DIMENSION.score
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT_DIMENSION.comment_id
     *
     * @return the value of COMMENT_DIMENSION.comment_id
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT_DIMENSION.comment_id
     *
     * @param commentId the value for COMMENT_DIMENSION.comment_id
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT_DIMENSION.status
     *
     * @return the value of COMMENT_DIMENSION.status
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT_DIMENSION.status
     *
     * @param status the value for COMMENT_DIMENSION.status
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT_DIMENSION.add_time
     *
     * @return the value of COMMENT_DIMENSION.add_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT_DIMENSION.add_time
     *
     * @param addTime the value for COMMENT_DIMENSION.add_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT_DIMENSION.update_time
     *
     * @return the value of COMMENT_DIMENSION.update_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT_DIMENSION.update_time
     *
     * @param updateTime the value for COMMENT_DIMENSION.update_time
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}