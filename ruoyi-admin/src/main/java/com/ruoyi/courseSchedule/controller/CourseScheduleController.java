package com.ruoyi.courseSchedule.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.courseSchedule.domain.CourseSchedule;
import com.ruoyi.courseSchedule.service.ICourseScheduleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程安排Controller
 * 
 * @author lcy
 * @date 2025-02-12
 */
@RestController
@RequestMapping("/courseSchedule/courseSchedule")
public class CourseScheduleController extends BaseController
{
    @Autowired
    private ICourseScheduleService courseScheduleService;

    /**
     * 查询课程安排列表
     */
    @PreAuthorize("@ss.hasPermi('courseSchedule:courseSchedule:list')")
    @GetMapping("/list")
    public TableDataInfo list(CourseSchedule courseSchedule)
    {
        startPage();
        List<CourseSchedule> list = courseScheduleService.selectCourseScheduleList(courseSchedule);
        return getDataTable(list);
    }

    /**
     * 导出课程安排列表
     */
    @PreAuthorize("@ss.hasPermi('courseSchedule:courseSchedule:export')")
    @Log(title = "课程安排", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CourseSchedule courseSchedule)
    {
        List<CourseSchedule> list = courseScheduleService.selectCourseScheduleList(courseSchedule);
        ExcelUtil<CourseSchedule> util = new ExcelUtil<CourseSchedule>(CourseSchedule.class);
        util.exportExcel(response, list, "课程安排数据");
    }

    /**
     * 获取课程安排详细信息
     */
    @PreAuthorize("@ss.hasPermi('courseSchedule:courseSchedule:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(courseScheduleService.selectCourseScheduleById(id));
    }

    /**
     * 新增课程安排
     */
    @PreAuthorize("@ss.hasPermi('courseSchedule:courseSchedule:add')")
    @Log(title = "课程安排", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CourseSchedule courseSchedule)
    {
        return toAjax(courseScheduleService.insertCourseSchedule(courseSchedule));
    }

    /**
     * 修改课程安排
     */
    @PreAuthorize("@ss.hasPermi('courseSchedule:courseSchedule:edit')")
    @Log(title = "课程安排", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CourseSchedule courseSchedule)
    {
        return toAjax(courseScheduleService.updateCourseSchedule(courseSchedule));
    }

    /**
     * 删除课程安排
     */
    @PreAuthorize("@ss.hasPermi('courseSchedule:courseSchedule:remove')")
    @Log(title = "课程安排", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(courseScheduleService.deleteCourseScheduleByIds(ids));
    }
}
