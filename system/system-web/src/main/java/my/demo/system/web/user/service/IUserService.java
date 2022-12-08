package my.demo.system.web.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import my.demo.system.web.user.entity.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
public interface IUserService extends IService<User> {
    IPage<User> getUserList(Integer page_num, Integer page_size);

    User findByName(String name);

    User findByAccount(String account);

    User findByMobile(String mobile);
}
