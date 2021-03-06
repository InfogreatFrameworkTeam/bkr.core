package bkr.core.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 权限表 model
 * 
 * @author chengd
 */
@Entity
@Table(name = "permission")
public class Permission {
    /** 权限Id */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "permission_id")
    private Long permissionId;

    /** 权限名 */
    private String name;

    /** 权限用户 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    /**
     * @return the permissionId
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * @param permissionId
     *            the permissionId to set
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user
     *            the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

}
