package my.demo.common.util;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 分页参数
 */
@Setter
@Getter
@Accessors(chain = true)
@ApiModel(description = "分页参数")
public class PageParams<T> implements Serializable {

    @Valid
    @ApiModelProperty(value = "查询参数")
    private T condition;

    @ApiModelProperty(value = "每页大小, 默认为10", example = "10")
    private long size = 0;

    @ApiModelProperty(value = "当前页, 默认为1", example = "1")
    private long page = 1;

    @ApiModelProperty(value = "排序")
    private String sort;

    @ApiModelProperty(value = "排序规则", allowableValues = "desc:倒序,asc:顺序")
    private String order;

    public PageParams() {

    }

    public PageParams(long page, long size) {
        this.page = page;
        this.size = size;
    }

    public String getSort(String def) {
        return StrUtil.isNotBlank(sort) ? sort : def;
    }

    public PageParams setOrder(String order) {
        this.order = validOrder(order);
        return this;
    }

    public String getOrder(String def) {
        return order != null ? order : validOrder(def);
    }

    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public long getOffset() {
        return page <= 1 ? 0 : (page - 1) * getSize();
    }

    private String validOrder(String order) {
        if (order == null) return null;
        if ("asc".equalsIgnoreCase(order) || "desc".equalsIgnoreCase(order))
            return order.toLowerCase();
        return null;
    }

    public long getSize() {
        if (size <= 0) return 10;
        return size;
    }

    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public long getOrigSize() {
        return size;
    }
}
