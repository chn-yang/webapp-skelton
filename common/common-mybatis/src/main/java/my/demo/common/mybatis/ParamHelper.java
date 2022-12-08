package my.demo.common.mybatis;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamHelper<T> {
    Page<T> page;
    T entity;
    HashMap<String, Integer> orderBy;
}
