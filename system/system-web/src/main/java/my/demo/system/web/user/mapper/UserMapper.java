package my.demo.system.web.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.demo.system.web.user.entity.User;

import java.util.Collection;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
public interface UserMapper extends BaseMapper<User> {
    Integer insertBatchSomeColumn(Collection<User> entityList);
}
