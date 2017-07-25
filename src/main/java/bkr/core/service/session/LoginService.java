package bkr.core.service.session;

import bkr.core.data.dto.UserDto;

/**
 * 登录服务接口
 * 
 * @author chengd
 */
public interface LoginService {
    /**
     * 登录
     * 
     * @param userName
     *            用户名
     * @param userPassword
     *            用户密码
     */
    UserDto login(String userName, String userPassword);
}
