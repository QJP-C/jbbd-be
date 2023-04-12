package com.ruoyi.news.service;

import java.util.List;
import com.ruoyi.news.domain.News;

/**
 * 新闻Service接口
 *
 * @author ruoyi
 * @date 2023-04-12
 */
public interface INewsService
{
    /**
     * 查询新闻
     *
     * @param newsId 新闻主键
     * @return 新闻
     */
    public News selectNewsByNewsId(Long newsId);

    /**
     * 查询新闻列表
     *
     * @param news 新闻
     * @return 新闻集合
     */
    public List<News> selectNewsList(News news);

    /**
     * 新增新闻
     *
     * @param news 新闻
     * @return 结果
     */
    public int insertNews(News news);

    /**
     * 修改新闻
     *
     * @param news 新闻
     * @return 结果
     */
    public int updateNews(News news);

    /**
     * 批量删除新闻
     *
     * @param newsIds 需要删除的新闻主键集合
     * @return 结果
     */
    public int deleteNewsByNewsIds(Long[] newsIds);

    /**
     * 删除新闻信息
     *
     * @param newsId 新闻主键
     * @return 结果
     */
    public int deleteNewsByNewsId(Long newsId);
}
