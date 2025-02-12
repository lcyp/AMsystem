package com.ruoyi.course.service.impl;

import java.util.List;
import java.util.UUID;

import com.ruoyi.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.course.mapper.CourseMapper;
import com.ruoyi.course.domain.Course;
import com.ruoyi.course.service.ICourseService;

/**
 * 课程管理Service业务层处理
 * 
 * @author lcy
 * @date 2025-02-11
 */
@Service
public class CourseServiceImpl implements ICourseService 
{
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private ISysUserService userService;

    /**
     * 查询课程管理
     * 
     * @param id 课程管理主键
     * @return 课程管理
     */
    @Override
    public Course selectCourseById(String id)
    {
        return courseMapper.selectCourseById(id);
    }

    /**
     * 查询课程管理列表
     * 
     * @param course 课程管理
     * @return 课程管理
     */
    @Override
    public List<Course> selectCourseList(Course course)
    {
        return courseMapper.selectCourseList(course);
    }

    /**
     * 新增课程管理
     * 
     * @param course 课程管理
     * @return 结果
     */
    @Override
    public int insertCourse(Course course)
    {
        //生成主键id
        //根据当前时间戳生成id
        String Id = UUID.randomUUID().toString().replace("-", "");
        course.setId(Id);
        return courseMapper.insertCourse(course);
    }

    /**
     * 修改课程管理
     * 
     * @param course 课程管理
     * @return 结果
     */
    @Override
    public int updateCourse(Course course)
    {
        return courseMapper.updateCourse(course);
    }

    /**
     * 批量删除课程管理
     * 
     * @param ids 需要删除的课程管理主键
     * @return 结果
     */
    @Override
    public int deleteCourseByIds(String[] ids)
    {
        return courseMapper.deleteCourseByIds(ids);
    }

    /**
     * 删除课程管理信息
     * 
     * @param id 课程管理主键
     * @return 结果
     */
    @Override
    public int deleteCourseById(String id)
    {
        return courseMapper.deleteCourseById(id);
    }
}
