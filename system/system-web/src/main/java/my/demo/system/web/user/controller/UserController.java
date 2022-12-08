package my.demo.system.web.user.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import my.demo.common.util.result.Result;
import my.demo.common.util.result.ResultUtil;
import my.demo.system.web.user.entity.User;
import my.demo.system.web.user.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result<IPage<User>> index() {
        IPage<User> userList = userService.page(new Page<>());
        return ResultUtil.success(userList);
    }

}
