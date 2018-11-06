package com.gemini.pattern.proxy;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.proxy
 * @classname: Father
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/4 15:55
 */
public class Father {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    /**
     * @return
     */
    public void findLove() {
        System.out.println("帮儿子找对象,物色");
        this.person.findLove();
        System.out.println("双方父母是否同意");

    }


}


