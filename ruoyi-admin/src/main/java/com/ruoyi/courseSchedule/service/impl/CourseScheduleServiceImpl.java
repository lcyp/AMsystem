package com.ruoyi.courseSchedule.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.courseSchedule.mapper.CourseScheduleMapper;
import com.ruoyi.courseSchedule.domain.CourseSchedule;
import com.ruoyi.courseSchedule.service.ICourseScheduleService;

/**
 * 课程安排Service业务层处理
 * 
 * @author lcy
 * @date 2025-02-12
 */
@Service
public class CourseScheduleServiceImpl implements ICourseScheduleService 
{
    @Autowired
    private CourseScheduleMapper courseScheduleMapper;

    /**
     * 查询课程安排
     * 
     * @param id 课程安排主键
     * @return 课程安排
     */
    @Override
    public CourseSchedule selectCourseScheduleById(Long id)
    {
        return courseScheduleMapper.selectCourseScheduleById(id);
    }

    /**
     * 查询课程安排列表
     * 
     * @param courseSchedule 课程安排
     * @return 课程安排
     */
    @Override
    public List<CourseSchedule> selectCourseScheduleList(CourseSchedule courseSchedule)
    {
        return courseScheduleMapper.selectCourseScheduleList(courseSchedule);
    }

    /**
     * 新增课程安排
     * 
     * @param courseSchedule 课程安排
     * @return 结果
     */
    @Override
    public int insertCourseSchedule(CourseSchedule courseSchedule)
    {
        return courseScheduleMapper.insertCourseSchedule(courseSchedule);
    }

    /**
     * 修改课程安排
     * 
     * @param courseSchedule 课程安排
     * @return 结果
     */
    @Override
    public int updateCourseSchedule(CourseSchedule courseSchedule)
    {
        return courseScheduleMapper.updateCourseSchedule(courseSchedule);
    }

    /**
     * 批量删除课程安排
     * 
     * @param ids 需要删除的课程安排主键
     * @return 结果
     */
    @Override
    public int deleteCourseScheduleByIds(Long[] ids)
    {
        return courseScheduleMapper.deleteCourseScheduleByIds(ids);
    }

    /**
     * 删除课程安排信息
     * 
     * @param id 课程安排主键
     * @return 结果
     */
    @Override
    public int deleteCourseScheduleById(Long id)
    {
        return courseScheduleMapper.deleteCourseScheduleById(id);
    }
}
