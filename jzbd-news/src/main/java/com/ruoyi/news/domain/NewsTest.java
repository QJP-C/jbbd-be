package com.ruoyi.news.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 新闻公告管理对象 newsTest
 * 
 * @author ruoyi
 * @date 2023-04-12
 */
public class NewsTest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String biaoti;

    /** 内容 */
    @Excel(name = "内容")
    private String neirong;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    /** 是否发布 */
    @Excel(name = "是否发布")
    private Long flag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBiaoti(String biaoti) 
    {
        this.biaoti = biaoti;
    }

    public String getBiaoti() 
    {
        return biaoti;
    }
    public void setNeirong(String neirong) 
    {
        this.neirong = neirong;
    }

    public String getNeirong() 
    {
        return neirong;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }
    public void setFlag(Long flag) 
    {
        this.flag = flag;
    }

    public Long getFlag() 
    {
        return flag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("biaoti", getBiaoti())
            .append("neirong", getNeirong())
            .append("creatTime", getCreatTime())
            .append("flag", getFlag())
            .toString();
    }
}
