package my.demo.common.util;

import cn.hutool.core.util.StrUtil;

import java.util.HashMap;
import java.util.Map;

public class SqlFilter {

    private static final String[] KEY_WORDS = {";", "\"", "\'", "/*", "*/", "--", "exec",
            "select ", "update ", "delete ", "insert ", "alter", "drop ", "create ", "shutdown"};

    public static Map<String, String[]> getSafeParameterMap(Map<String, String[]> parameterMap) {
        Map<String, String[]> map = new HashMap<>(parameterMap.size());
        for (String key : parameterMap.keySet()) {
            String[] values = parameterMap.get(key);
            map.put(key, getSafeValues(values));
        }
        return map;
    }

    public static String[] getSafeValues(String[] values) {
        if (values!=null && values.length>0) {
            String[] safeValues = new String[values.length];
            for (int i = 0; i < values.length; i++) {
                safeValues[i] = getSafeValue(values[i]);
            }
            return safeValues;
        }
        return null;
    }

    public static String getSafeValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return value;
        }
        StringBuilder sb = new StringBuilder(value);
        String lowerCase = value.toLowerCase();
        for (String keyWord : KEY_WORDS) {
            int x;
            while ((x = lowerCase.indexOf(keyWord)) >= 0) {
                if (keyWord.length() == 1) {
                    sb.replace(x, x + 1, " ");
                    lowerCase = sb.toString().toLowerCase();
                    continue;
                }
                sb.delete(x, x + keyWord.length());
                lowerCase = sb.toString().toLowerCase();
            }
        }
        return sb.toString();
    }

}
