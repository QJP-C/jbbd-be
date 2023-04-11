package com.ruoyi.news.mapper;

import java.util.List;
import com.ruoyi.news.domain.NewsTest;

/**
 * 新闻公告管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-12
 */
public interface NewsTestMapper 
{
    /**
     * 查询新闻公告管理
     * 
     * @param id 新闻公告管理主键
     * @return 新闻公告管理
     */
    public NewsTest selectNewsTestById(Long id);

    /**
     * 查询新闻公告管理列表
     * 
     * @param newsTest 新闻公告管理
     * @return 新闻公告管理集合
     */
    public List<NewsTest> selectNewsTestList(NewsTest newsTest);

    /**
     * 新增新闻公告管理
     * 
     * @param newsTest 新闻公告管理
     * @return 结果
     */
    public int insertNewsTest(NewsTest newsTest);

    /**
     * 修改新闻公告管理
     * 
     * @param newsTest 新闻公告管理
     * @return 结果
     */
    public int updateNewsTest(NewsTest newsTest);

    /**
     * 删除新闻公告管理
     * 
     * @param id 新闻公告管理主键
     * @return 结果
     */
    public int deleteNewsTestById(Long id);

    /**
     * 批量删除新闻公告管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNewsTestByIds(Long[] ids);
}
