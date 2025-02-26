package com.dmall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dmall.user.domain.dto.LoginFormDTO;
import com.dmall.user.domain.po.User;
import com.dmall.user.domain.vo.UserLoginVO;


/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author zhang
 *
 */
public interface IUserService extends IService<User> {

    UserLoginVO login(LoginFormDTO loginFormDTO);

    void deductMoney(String pw, Integer totalFee);
}
