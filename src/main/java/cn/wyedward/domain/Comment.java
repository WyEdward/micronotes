package cn.wyedward.domain;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {

    private static final long serialVersionUID = 2510367807963740712L;

    private Integer commentId;

    private String context;

    private Date createTime;

    private String nickName;

    private String email;

    private Integer blogId;

    private Integer parentId;

    private String headPortrait;

    private String adminComment;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public String getAdminComment() {
        return adminComment;
    }

    public void setAdminComment(String adminComment) {
        this.adminComment = adminComment == null ? null : adminComment.trim();
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", context='" + context + '\'' +
                ", createTime=" + createTime +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", blogId=" + blogId +
                ", parentId=" + parentId +
                ", headPortrait='" + headPortrait + '\'' +
                ", adminComment='" + adminComment + '\'' +
                '}';
    }
}