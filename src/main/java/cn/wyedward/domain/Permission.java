package cn.wyedward.domain;

import java.io.Serializable;

public class Permission  implements Serializable {
    private static final long serialVersionUID = 7859146747080513202L;

    private Integer permissionId;

    private String permissionUrl;

    private String permissionName;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl == null ? null : permissionUrl.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", permissionUrl='" + permissionUrl + '\'' +
                ", permissionName='" + permissionName + '\'' +
                '}';
    }
}