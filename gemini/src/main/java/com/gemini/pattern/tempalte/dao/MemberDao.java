package com.gemini.pattern.tempalte.dao;

import com.gemini.pattern.tempalte.JdbcTemplate;
import com.gemini.pattern.tempalte.RowMapper;
import com.gemini.pattern.tempalte.Template;
import com.gemini.pattern.tempalte.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.tempalte.dao
 * @classname: MemberDao
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 17:05
 */
public class MemberDao {
    /*public MemberDao(DataSource dataSource) {
        super(dataSource);
    }*/
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<?> query() {
        String sql = "select * from tc_member";
        return jdbcTemplate.executeQuery(sql, new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                List<Object> memberList = new ArrayList<>();
                Member member = new Member();
                member.setUsername(resultSet.getString("username"));
                member.setNickname(resultSet.getString("nickname"));
                member.setPassword(resultSet.getString("password"));
                memberList.add(member);
                return memberList;
            }
        }, null);
    }

    /*public Object processReust(ResultSet resultSet,int rowNum) {
        try {
            Member member =  new Member();
            member.setNickname(resultSet.getString("username"));
            member.setPassword(resultSet.getString("password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return member;
    }*/
}
