package cn.wyedward.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = 7272818353345462122L;
    /** 用户id*/
    private String userName;
    /** 用户登录账号*/
    private Integer userId;
    /** 用户密码*/
    private String password;
    /** 用户状态*/
    private String status;
    /** 用户创建时间*/
    private Date createTime;
    /** 邮箱*/
    private String email;
    /** 用户头像*/
    private String headPortrait;
    /** 用户昵称*/
    private String nickName;
    /** 最后一次更新时间*/
    private Date updateTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", email='" + email + '\'' +
                ", headPortrait='" + headPortrait + '\'' +
                ", nickName='" + nickName + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}