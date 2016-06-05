package com.iblock.dao;

import com.iblock.dao.po.WorkflowLog;
import org.apache.ibatis.annotations.Param;

public interface WorkflowLogDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKFLOW_LOG
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insert(WorkflowLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKFLOW_LOG
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int insertSelective(WorkflowLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKFLOW_LOG
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    WorkflowLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKFLOW_LOG
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKeySelective(WorkflowLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKFLOW_LOG
     *
     * @mbggenerated Mon Feb 01 11:51:28 CST 2016
     */
    int updateByPrimaryKey(WorkflowLog record);

    WorkflowLog selectByInstId(@Param("instId") String instId, @Param("type") int type);

    WorkflowLog selectByProjectId(Long projectId);
}