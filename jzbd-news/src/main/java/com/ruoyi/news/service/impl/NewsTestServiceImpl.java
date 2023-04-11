package com.ruoyi.news.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.news.mapper.NewsTestMapper;
import com.ruoyi.news.domain.NewsTest;
import com.ruoyi.news.service.INewsTestService;

/**
 * 新闻公告管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-12
 */
@Service
public class NewsTestServiceImpl implements INewsTestService 
{
    @Autowired
    private NewsTestMapper newsTestMapper;

    /**
     * 查询新闻公告管理
     * 
     * @param id 新闻公告管理主键
     * @return 新闻公告管理
     */
    @Override
    public NewsTest selectNewsTestById(Long id)
    {
        return newsTestMapper.selectNewsTestById(id);
    }

    /**
     * 查询新闻公告管理列表
     * 
     * @param newsTest 新闻公告管理
     * @return 新闻公告管理
     */
    @Override
    public List<NewsTest> selectNewsTestList(NewsTest newsTest)
    {
        return newsTestMapper.selectNewsTestList(newsTest);
    }

    /**
     * 新增新闻公告管理
     * 
     * @param newsTest 新闻公告管理
     * @return 结果
     */
    @Override
    public int insertNewsTest(NewsTest newsTest)
    {
        return newsTestMapper.insertNewsTest(newsTest);
    }

    /**
     * 修改新闻公告管理
     * 
     * @param newsTest 新闻公告管理
     * @return 结果
     */
    @Override
    public int updateNewsTest(NewsTest newsTest)
    {
        return newsTestMapper.updateNewsTest(newsTest);
    }

    /**
     * 批量删除新闻公告管理
     * 
     * @param ids 需要删除的新闻公告管理主键
     * @return 结果
     */
    @Override
    public int deleteNewsTestByIds(Long[] ids)
    {
        return newsTestMapper.deleteNewsTestByIds(ids);
    }

    /**
     * 删除新闻公告管理信息
     * 
     * @param id 新闻公告管理主键
     * @return 结果
     */
    @Override
    public int deleteNewsTestById(Long id)
    {
        return newsTestMapper.deleteNewsTestById(id);
    }
}
