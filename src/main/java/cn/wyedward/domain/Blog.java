package cn.wyedward.domain;

import java.io.Serializable;
import java.util.Date;

public class Blog implements Serializable{
    private static final long serialVersionUID = -3593274334274242450L;
    /** 博客id*/
    private Integer blogId;
    /** 点赞开启*/
    private String appreciation;
    /** 评论开启*/
    private String commentabled;
    /** 创建时间*/
    private Date createTime;
    /** 博客描述*/
    private String description;
    /** 首图*/
    private String firstPicture;
    /** 标记*/
    private String flag;
    /** 是否发布*/
    private String published;
    /** 标题*/
    private String title;
    /** 最后一次更新时间*/
    private Date updateTime;
    /** 浏览次数*/
    private Integer views;
    /** 博客所属类别id*/
    private Integer typeId;
    /** 博客所属用户id*/
    private Integer userId;
    /** 分享开启*/
    private String shareStatement;
    /** 是否被评论*/
    private String recommed;
    /** 内容*/
    private String content;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation == null ? null : appreciation.trim();
    }

    public String getCommentabled() {
        return commentabled;
    }

    public void setCommentabled(String commentabled) {
        this.commentabled = commentabled == null ? null : commentabled.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture == null ? null : firstPicture.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published == null ? null : published.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getShareStatement() {
        return shareStatement;
    }

    public void setShareStatement(String shareStatement) {
        this.shareStatement = shareStatement == null ? null : shareStatement.trim();
    }

    public String getRecommed() {
        return recommed;
    }

    public void setRecommed(String recommed) {
        this.recommed = recommed == null ? null : recommed.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", appreciation='" + appreciation + '\'' +
                ", commentabled='" + commentabled + '\'' +
                ", createTime=" + createTime +
                ", description='" + description + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", flag='" + flag + '\'' +
                ", published='" + published + '\'' +
                ", title='" + title + '\'' +
                ", updateTime=" + updateTime +
                ", views=" + views +
                ", typeId=" + typeId +
                ", userId=" + userId +
                ", shareStatement='" + shareStatement + '\'' +
                ", recommed='" + recommed + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}