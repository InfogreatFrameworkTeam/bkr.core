package bkr.core.session.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bkr.base.util.security.MD5Util;
import bkr.core.session.dto.UserDto;
import bkr.core.session.model.QUser;
import bkr.core.session.model.User;
import bkr.core.session.repoistory.UserRepository;
import bkr.core.session.service.LoginService;

/**
 * 登录服务接口实现类
 * 
 * @author chengd
 */
@Service
public class LoginServiceImpl implements LoginService {

    /** 用户表库 */
    @Autowired
    private UserRepository userRepository;

    /**
     * 登录
     * 
     * @param userName
     *            用户名
     * @param userPassword
     *            用户密码
     */
    public UserDto login(String userName, String userPassword) {
        // 用户表Q类
        QUser quser = QUser.user;

        // 密码加密
        String md5Pass = MD5Util.getMD5(userPassword);

        // 检索用户
        User user = userRepository.findOne(quser.name.eq(userName).and(
                quser.password.eq(md5Pass)));

        // 在使用hibernate 最为数据持久层时，我们会映射实体之间的关系，而当我们要访问其中一个实体1时，通常会关联到具有关联关系的实体2，
        // 这是如果使用Jackson来获取实体1的时，就会无限级联的访问关联的实体2，这样就会造成“无限递归引用的异常”
        // 有映射关系的表 不能用检索结果作为出力
        // 返回检索结果
        if (user == null) {
            return null;
        } else {
            UserDto dto = new UserDto();
            dto.setUser(user);
            dto.setRole(user.getRole());
            dto.setPermissionList(user.getPermissionList());
            return dto;
        }
    }

}
