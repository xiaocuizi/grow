package com.gemini.pattern.tempalte.entity;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.tempalte.entity
 * @classname: Member
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 17:11
 */
public class Member {

    private String username;
    private String password;
     private String nickname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
