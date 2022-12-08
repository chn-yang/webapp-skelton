package my.demo.common.util.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Accessors(chain = true)
@ApiModel(description = "分页结果数据")
public class PageResult<T> implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("每页记录数")
	private long size = 10;

	@ApiModelProperty("当前页码")
	private long page = 1;

	@ApiModelProperty("总页数")
	private long totalPage = 0;

	@ApiModelProperty("总记录数")
	private long totalCount = 0;

	@ApiModelProperty("记录列表")
	private List<T> list;


	public PageResult(){

	}
	public PageResult(long page, long size){
		this.page = page;
		this.size = size;
	}

	/**
	 * 根据 totalCount 和 size 算出 totalPage
	 * @return
	 */
	public PageResult<T> autoTotalPage(){
		if(size>0 && totalCount>0){
			totalPage = (int)Math.ceil((double)totalCount / size);
		}
		return this;
	}

}
