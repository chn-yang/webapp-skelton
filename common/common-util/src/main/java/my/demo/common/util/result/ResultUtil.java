package my.demo.common.util.result;

/**
 * 返回结果工具类
 */
public class ResultUtil<T> {

    /**
     * 请求成功
     *
     * @return Result<V>
     */
    public static <V> Result<V> success() {
        return new Result<>(HttpCode.OK.getCode(), HttpCode.OK.getMessage());
    }

    /**
     * 请求成功（无消息）
     *
     * @return Result<V>
     */
    public static <V> Result<V> successAndNoMsg() {
        return new Result<>(HttpCode.OK.getCode(), "");
    }

    /**
     * 成功请求
     *
     * @return Result<V>
     */
    public static <V> Result<V> success(V data) {
        return new Result<V>(HttpCode.OK.getCode(), HttpCode.OK.getMessage(), data);
    }

    /**
     * 成功请求（无消息）
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> successAndNoMsg(V data) {
        return new Result<>(HttpCode.OK.getCode(), "", data);
    }


    /**
     * 请求成功
     *
     * @return Result<V>
     */
    public static <V> Result<V> msg(String msg) {
        return new Result<>(HttpCode.OK.getCode(), msg);
    }

    /**
     * 操作失败
     *
     * @return Result<V>
     */
    public static <V> Result<V> fail() {
        return new Result<>(HttpCode.FAIL.getCode(), HttpCode.FAIL.getMessage());
    }

    /**
     * 操作失败
     *
     * @return Result<V>
     */
    public static <V> Result<V> fail(V data) {
        return new Result<>(HttpCode.FAIL.getCode(), HttpCode.FAIL.getMessage(), data);
    }

    /**
     * 服务器错误
     *
     * @return Result<V>
     */
    public static <V> Result<V> error() {
        return new Result<>(HttpCode.INTERNAL_SERVER_ERROR.getCode(), HttpCode.INTERNAL_SERVER_ERROR.getMessage());
    }


    /**
     * 服务器错误
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> error(V data) {
        return new Result<>(HttpCode.INTERNAL_SERVER_ERROR.getCode(), HttpCode.INTERNAL_SERVER_ERROR.getMessage(), data);
    }

    /**
     * 参数错误
     *
     * @return Result<V>
     */
    public static <V> Result<V> paramError() {
        return new Result<>(HttpCode.INVALID_REQUEST.getCode(), HttpCode.INVALID_REQUEST.getMessage());
    }

    /**
     * 参数错误
     *
     * @return Result<V>
     */
    public static <V> Result<V> paramErrorMsg(String msg) {
        return new Result<>(HttpCode.INVALID_REQUEST.getCode(), msg);
    }

    /**
     * 参数错误
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> paramError(V data) {
        return new Result<>(HttpCode.INVALID_REQUEST.getCode(), HttpCode.INVALID_REQUEST.getMessage(), data);
    }

    /**
     * 认证到期
     *
     * @return Result<V>
     */
    public static <V> Result<V> authExpired() {
        return new Result<>(HttpCode.AUTH_EXPIRED.getCode(), HttpCode.AUTH_EXPIRED.getMessage());
    }

    /**
     * 没有权限
     *
     * @return Result<V>
     */
    public static <V> Result<V> unAuthorized() {
        return new Result<>(HttpCode.UNAUTHORIZED.getCode(), HttpCode.UNAUTHORIZED.getMessage());
    }

    /**
     * 没有权限
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> unAuthorized(V data) {
        return new Result<>(HttpCode.UNAUTHORIZED.getCode(), HttpCode.UNAUTHORIZED.getMessage(), data);
    }


    /**
     * 禁止访问
     *
     * @return Result<V>
     */
    public static <V> Result<V> forbidden() {
        return new Result<>(HttpCode.FORBIDDEN.getCode(), HttpCode.FORBIDDEN.getMessage());
    }

    /**
     * 禁止访问
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> forbidden(V data) {
        return new Result<>(HttpCode.FORBIDDEN.getCode(), HttpCode.FORBIDDEN.getMessage(), data);
    }


    /**
     * 资源不存在
     *
     * @return Result<V>
     */
    public static <V> Result<V> notFound() {
        return new Result<>(HttpCode.NOT_FOUND.getCode(), HttpCode.NOT_FOUND.getMessage());
    }


    /**
     * 资源不存在
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> notFound(V data) {
        return new Result<>(HttpCode.NOT_FOUND.getCode(), HttpCode.NOT_FOUND.getMessage(), data);
    }


    /**
     * 请求的格式不正确
     *
     * @return Result<V>
     */
    public static <V> Result<V> notAcceptable() {
        return new Result<>(HttpCode.NOT_ACCEPTABLE.getCode(), HttpCode.NOT_ACCEPTABLE.getMessage());
    }


    /**
     * 请求的格式不正确
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> notAcceptable(V data) {
        return new Result<>(HttpCode.NOT_ACCEPTABLE.getCode(), HttpCode.NOT_ACCEPTABLE.getMessage(), data);
    }


    /**
     * 数据已经被删除
     *
     * @return Result<V>
     */
    public static <V> Result<V> gone() {
        return new Result<>(HttpCode.GONE.getCode(), HttpCode.GONE.getMessage());
    }


    /**
     * 数据已经被删除
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> gone(V data) {
        return new Result<>(HttpCode.GONE.getCode(), HttpCode.GONE.getMessage(), data);
    }

    /**
     * 实体参数校验错误
     *
     * @return Result<V>
     */
    public static <V> Result<V> unprocessableEntity() {
        return new Result<>(HttpCode.UNPROCESSABLE_ENTITY.getCode(), HttpCode.UNPROCESSABLE_ENTITY.getMessage());
    }

    /**
     * 实体参数校验错误
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> unprocessableEntity(V data) {
        return new Result<>(HttpCode.UNPROCESSABLE_ENTITY.getCode(), HttpCode.UNPROCESSABLE_ENTITY.getMessage(), data);
    }

    /**
     * 未知错误
     *
     * @return Result<V>
     */
    public static <V> Result<V> unKnowError() {
        return new Result<>(HttpCode.UN_KNOW_ERROR.getCode(), HttpCode.UN_KNOW_ERROR.getMessage());
    }

    /**
     * 未知错误
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> unKnowError(V data) {
        return new Result<>(HttpCode.UN_KNOW_ERROR.getCode(), HttpCode.UN_KNOW_ERROR.getMessage(), data);
    }

    /**
     * 业务逻辑验证未通过
     *
     * @return Result<V>
     */
    public static <V> Result<V> verificationFailed() {
        return new Result<>(HttpCode.VERIFICATION_FAILED.getCode(), HttpCode.VERIFICATION_FAILED.getMessage());
    }

    /**
     * 业务逻辑验证未通过
     *
     * @param data <V>
     * @return Result<V>
     */
    public static <V> Result<V> verificationFailed(V data) {
        return new Result<>(HttpCode.VERIFICATION_FAILED.getCode(), HttpCode.VERIFICATION_FAILED.getMessage(), data);
    }

    /**
     * 自定义返回
     *
     * @param e HttpCodeEnum
     * @return Result<V>
     */
    public static <V> Result<V> custom(HttpCode e) {
        return new Result<>(e.getCode(), e.getMessage());
    }

    /**
     * 自定义返回
     *
     * @param code  int
     * @param error String*
     * @return Result<V>
     */
    public static <V> Result<V> custom(int code, String error) {
        return new Result<>(code, error);
    }

    /**
     * 自定义返回
     *
     * @param code  int
     * @param error String
     * @param data  V
     * @return Result<V>
     */
    public static <V> Result<V> custom(int code, String error, V data) {
        return new Result<>(code, error, data);
    }

}
