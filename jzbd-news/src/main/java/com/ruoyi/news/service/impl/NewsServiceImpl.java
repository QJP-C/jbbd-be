package com.ruoyi.news.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.news.mapper.NewsMapper;
import com.ruoyi.news.domain.News;
import com.ruoyi.news.service.INewsService;

/**
 * 新闻Service业务层处理
 *
 * @author ruoyi
 * @date 2023-04-12
 */
@Service
public class NewsServiceImpl implements INewsService
{
    @Autowired
    private NewsMapper newsMapper;

    /**
     * 查询新闻
     *
     * @param newsId 新闻主键
     * @return 新闻
     */
    @Override
    public News selectNewsByNewsId(Long newsId)
    {
        return newsMapper.selectNewsByNewsId(newsId);
    }

    /**
     * 查询新闻列表
     *
     * @param news 新闻
     * @return 新闻
     */
    @Override
    public List<News> selectNewsList(News news)
    {
        return newsMapper.selectNewsList(news);
    }

    /**
     * 新增新闻
     *
     * @param news 新闻
     * @return 结果
     */
    @Override
    public int insertNews(News news)
    {
        String url = "http://localhost/dev-api";
        news.setCreateTime(DateUtils.getNowDate());
        System.out.println(url+news.getNewsImg()+"=====");
        news.setNewsImg(url+news.getNewsImg());
        return newsMapper.insertNews(news);
    }

    /**
     * 修改新闻
     *
     * @param news 新闻
     * @return 结果
     */
    @Override
    public int updateNews(News news)
    {
        news.setUpdateTime(DateUtils.getNowDate());
        return newsMapper.updateNews(news);
    }

    /**
     * 批量删除新闻
     *
     * @param newsIds 需要删除的新闻主键
     * @return 结果
     */
    @Override
    public int deleteNewsByNewsIds(Long[] newsIds)
    {
        return newsMapper.deleteNewsByNewsIds(newsIds);
    }

    /**
     * 删除新闻信息
     *
     * @param newsId 新闻主键
     * @return 结果
     */
    @Override
    public int deleteNewsByNewsId(Long newsId)
    {
        return newsMapper.deleteNewsByNewsId(newsId);
    }
}
