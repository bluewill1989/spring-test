package com.mi.wzn.test.innermethod;

import org.springframework.beans.BeansException;

public interface ObjectFactory {
    Object getObject() throws BeansException;
}
