package com.mi.wzn.test.replacedmethod;

import com.sun.org.apache.xml.internal.security.utils.UnsyncByteArrayOutputStream;
import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

@Data
public class UserFactoryBean implements FactoryBean<User> {

    private String userInfo;

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setBrand("awesome");
        return user;
    }

    @Override
    public Class<User> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
