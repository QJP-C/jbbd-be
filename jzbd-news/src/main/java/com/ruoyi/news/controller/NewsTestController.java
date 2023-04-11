package com.ruoyi.news.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.annotation.Anonymous;
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
import com.ruoyi.news.domain.NewsTest;
import com.ruoyi.news.service.INewsTestService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 新闻公告管理Controller
 * 
 * @author ruoyi
 * @date 2023-04-12
 */
@RestController
@Anonymous
@RequestMapping("/system/newsTest")
public class NewsTestController extends BaseController
{
    @Autowired
    private INewsTestService newsTestService;

    /**
     * 查询新闻公告管理列表
     */
//    @PreAuthorize("@ss.hasPermi('system:newsTest:list')")
    @Anonymous
    @GetMapping("/list")
    public TableDataInfo list(NewsTest newsTest)
    {
        startPage();
        List<NewsTest> list = newsTestService.selectNewsTestList(newsTest);
        return getDataTable(list);
    }
    @Anonymous
    @GetMapping("/list/test")
    public Map<String,String> list(){
        HashMap<String,String> map = new HashMap<>();
        map.put("code","200");
        map.put("data","asdasdas");
        map.put("message","外部访问成功");
        return map;
    }

    /**
     * 导出新闻公告管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:newsTest:export')")
    @Log(title = "新闻公告管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NewsTest newsTest)
    {
        List<NewsTest> list = newsTestService.selectNewsTestList(newsTest);
        ExcelUtil<NewsTest> util = new ExcelUtil<NewsTest>(NewsTest.class);
        util.exportExcel(response, list, "新闻公告管理数据");
    }

    /**
     * 获取新闻公告管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:newsTest:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(newsTestService.selectNewsTestById(id));
    }

    /**
     * 新增新闻公告管理
     */
    @PreAuthorize("@ss.hasPermi('system:newsTest:add')")
    @Log(title = "新闻公告管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NewsTest newsTest)
    {
        return toAjax(newsTestService.insertNewsTest(newsTest));
    }

    /**
     * 修改新闻公告管理
     */
    @PreAuthorize("@ss.hasPermi('system:newsTest:edit')")
    @Log(title = "新闻公告管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NewsTest newsTest)
    {
        return toAjax(newsTestService.updateNewsTest(newsTest));
    }

    /**
     * 删除新闻公告管理
     */
    @PreAuthorize("@ss.hasPermi('system:newsTest:remove')")
    @Log(title = "新闻公告管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(newsTestService.deleteNewsTestByIds(ids));
    }
}
