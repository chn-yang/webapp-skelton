package my.demo.common.mybatis;

import com.baomidou.mybatisplus.core.metadata.IPage;

public class PageUtil {

    public static <T, V> IPage<V> correctPage(IPage<T> correctPage, IPage<V> voPage) {
        voPage.setPages(correctPage.getPages());
        voPage.setSize(correctPage.getSize());
        voPage.setCurrent(correctPage.getCurrent());
        voPage.setTotal(correctPage.getTotal());
        return voPage;
    }
}
