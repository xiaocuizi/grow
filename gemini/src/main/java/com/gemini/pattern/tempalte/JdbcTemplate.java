package com.gemini.pattern.tempalte;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.tempalte
 * @classname: JdbcTemplate
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 16:55
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * @param sql
     * @param args
     * @return
     */
    public List<?> executeQuery(String sql, RowMapper rowMapper, Object[] args) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {
            //获取连接
            connection = this.getConnection();
            //创建语句集
            preparedStatement = this.getPreparedStatement(sql, connection);
            //执行语句
            resultSet = this.getExecuteQuery(preparedStatement);
            //解析结果
            int rowNum = 1;
            List<?> listResult = this.processResult(resultSet, rowMapper, rowNum);
            //关闭结果集关
            this.getResultClose(resultSet);
            //关闭语句集
            this.getPrepareStatementClose(preparedStatement);
            //关闭连接
            this.getConectionClose(connection);
            return listResult;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭结果集关
                if (resultSet != null)
                    this.getResultClose(resultSet);
                //关闭语句集
                if (preparedStatement != null)
                    this.getPrepareStatementClose(preparedStatement);
                //关闭连接
                if (connection != null)
                    this.getConectionClose(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private void getPrepareStatementClose(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    private void getConectionClose(Connection connection) throws SQLException {
        //通常放回连接池
        connection.close();
    }

    private void getResultClose(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

    private ResultSet getExecuteQuery(PreparedStatement preparedStatement) throws SQLException {
        return preparedStatement.executeQuery();
    }

    private PreparedStatement getPreparedStatement(String sql, Connection connection) throws SQLException {
        return connection.prepareStatement(sql);
    }

    /**
     * @param resultSet
     * @param rowNum
     * @return
     */
    public List<?> processResult(ResultSet resultSet, RowMapper rowMapper, int rowNum) throws SQLException {
        List<Object> returnList = new ArrayList<>();
        if (resultSet.next()) {
            returnList.add(rowMapper.mapRow(resultSet, rowNum++));
        }
        return returnList;
    }
}
