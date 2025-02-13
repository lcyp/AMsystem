package com.ruoyi.courseSchedule.service;

import java.util.List;
import com.ruoyi.courseSchedule.domain.CourseSchedule;

/**
 * 课程安排Service接口
 * 
 * @author lcy
 * @date 2025-02-12
 */
public interface ICourseScheduleService 
{
    /**
     * 查询课程安排
     * 
     * @param id 课程安排主键
     * @return 课程安排
     */
    public CourseSchedule selectCourseScheduleById(Long id);

    /**
     * 查询课程安排列表
     * 
     * @param courseSchedule 课程安排
     * @return 课程安排集合
     */
    public List<CourseSchedule> selectCourseScheduleList(CourseSchedule courseSchedule);

    /**
     * 新增课程安排
     * 
     * @param courseSchedule 课程安排
     * @return 结果
     */
    public int insertCourseSchedule(CourseSchedule courseSchedule);

    /**
     * 修改课程安排
     * 
     * @param courseSchedule 课程安排
     * @return 结果
     */
    public int updateCourseSchedule(CourseSchedule courseSchedule);

    /**
     * 批量删除课程安排
     * 
     * @param ids 需要删除的课程安排主键集合
     * @return 结果
     */
    public int deleteCourseScheduleByIds(Long[] ids);

    /**
     * 删除课程安排信息
     * 
     * @param id 课程安排主键
     * @return 结果
     */
    public int deleteCourseScheduleById(Long id);
}
