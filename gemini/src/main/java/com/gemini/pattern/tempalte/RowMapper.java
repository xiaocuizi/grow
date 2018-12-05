package com.gemini.pattern.tempalte;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.tempalte
 * @classname: RowMapper
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 18:12
 */
public interface RowMapper<T> {
    /**
     * @param resultSet
     * @param rowNum
     * @return
     */
    public T mapRow(ResultSet resultSet, int rowNum) throws SQLException;
}
