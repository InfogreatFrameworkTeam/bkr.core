package bkr.core.data.dto;

import java.util.List;

import bkr.core.data.model.Permission;
import bkr.core.data.model.Role;
import bkr.core.data.model.User;

/**
 * 用户DTO
 * 
 * @author chengd
 */
public class UserDto {
    /** 用户 */
    private User user;

    /** 用户角色 */
    private Role role;

    /** 用户权限 */
    private List<Permission> permissionList;

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param userId
     *            the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role
     *            the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * @return the permissionList
     */
    public List<Permission> getPermissionList() {
        return permissionList;
    }

    /**
     * @param permissionList
     *            the permissionList to set
     */
    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

}
