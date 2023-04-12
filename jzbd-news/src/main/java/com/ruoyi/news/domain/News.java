package com.ruoyi.news.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 新闻对象 news
 *
 * @author ruoyi
 * @date 2023-04-12
 */
public class News extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 新闻id */
    private Long newsId;

    /** 新闻题目 */
    @Excel(name = "新闻题目")
    private String newsTitle;

    /** 新闻来源 */
    @Excel(name = "新闻来源")
    private String newsSource;

    /** 图片链接 */
    @Excel(name = "图片链接")
    private String newsImg;

    /** 浏览量 */
    @Excel(name = "浏览量")
    private Long pageViews;

    /** 正文 */
    @Excel(name = "正文")
    private String specificContent;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setNewsId(Long newsId)
    {
        this.newsId = newsId;
    }

    public Long getNewsId()
    {
        return newsId;
    }
    public void setNewsTitle(String newsTitle)
    {
        this.newsTitle = newsTitle;
    }

    public String getNewsTitle()
    {
        return newsTitle;
    }
    public void setNewsSource(String newsSource)
    {
        this.newsSource = newsSource;
    }

    public String getNewsSource()
    {
        return newsSource;
    }
    public void setNewsImg(String newsImg)
    {
        this.newsImg = newsImg;
    }

    public String getNewsImg()
    {
        return newsImg;
    }
    public void setPageViews(Long pageViews)
    {
        this.pageViews = pageViews;
    }

    public Long getPageViews()
    {
        return pageViews;
    }
    public void setSpecificContent(String specificContent)
    {
        this.specificContent = specificContent;
    }

    public String getSpecificContent()
    {
        return specificContent;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("newsId", getNewsId())
                .append("newsTitle", getNewsTitle())
                .append("newsSource", getNewsSource())
                .append("newsImg", getNewsImg())
                .append("pageViews", getPageViews())
                .append("specificContent", getSpecificContent())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
