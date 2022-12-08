package my.demo.system.web.user.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import my.demo.system.web.user.entity.User;
import my.demo.system.web.user.mapper.UserMapper;
import my.demo.system.web.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public IPage<User> getUserList(Integer page_num, Integer page_size) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return lambdaQuery().eq(User::getName, name).one();
    }

    @Override
    public User findByAccount(String account) {
        return lambdaQuery().eq(User::getAccount, account).one();
    }

    @Override
    public User findByMobile(String mobile) {
        return lambdaQuery().eq(User::getMobile, mobile).one();
    }
}
