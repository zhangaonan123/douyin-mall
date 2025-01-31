package com.dmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dmall.domain.dto.LoginFormDTO;
import com.dmall.domain.po.User;
import com.dmall.domain.vo.UserLoginVO;

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
