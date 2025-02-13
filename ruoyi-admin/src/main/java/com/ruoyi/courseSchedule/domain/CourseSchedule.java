package com.ruoyi.courseSchedule.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程安排对象 tb_course_schedule
 * 
 * @author lcy
 * @date 2025-02-12
 */
public class CourseSchedule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long id;

    /** 课程 */
    @Excel(name = "课程")
    private String courseId;

    /** 教师 */
    @Excel(name = "教师")
    private Long teacherId;

    /** 教室 */
    @Excel(name = "教室")
    private String classroom;

    /** 星期 */
    @Excel(name = "星期")
    private Long dayOfWeek;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 详情 */
    @Excel(name = "详情")
    private String details;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCourseId(String courseId) 
    {
        this.courseId = courseId;
    }

    public String getCourseId() 
    {
        return courseId;
    }
    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setClassroom(String classroom) 
    {
        this.classroom = classroom;
    }

    public String getClassroom() 
    {
        return classroom;
    }
    public void setDayOfWeek(Long dayOfWeek) 
    {
        this.dayOfWeek = dayOfWeek;
    }

    public Long getDayOfWeek() 
    {
        return dayOfWeek;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setDetails(String details) 
    {
        this.details = details;
    }

    public String getDetails() 
    {
        return details;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("courseId", getCourseId())
            .append("teacherId", getTeacherId())
            .append("classroom", getClassroom())
            .append("dayOfWeek", getDayOfWeek())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("details", getDetails())
            .toString();
    }
}
