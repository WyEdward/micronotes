package cn.wyedward.domain;

import java.io.Serializable;
import java.util.Date;

public class Blog implements Serializable{
    private static final long serialVersionUID = -3593274334274242450L;

    private Integer blogId;

    private String appreciation;

    private String commentabled;

    private Date createTime;

    private String description;

    private String firstPicture;

    private String flag;

    private String published;

    private String title;

    private Date updateTime;

    private Integer views;

    private Integer typeId;

    private Integer userId;

    private String shareStatement;

    private String recommed;

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
}