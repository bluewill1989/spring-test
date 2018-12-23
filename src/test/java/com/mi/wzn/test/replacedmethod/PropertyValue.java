package com.mi.wzn.test.replacedmethod;

import lombok.Data;
import org.springframework.beans.factory.parsing.*;

@Data
public class PropertyValue implements ReaderEventListener {
    private String value1;

    private String value2;

    public void print(){
        System.out.println("this is propertyValue!!");
    }

    @Override
    public void defaultsRegistered(DefaultsDefinition defaultsDefinition) {
//        System.out.println("defaultsDefinition finished!!");
    }

    @Override
    public void componentRegistered(ComponentDefinition componentDefinition) {
        System.out.println("componentRegistered finished!!");

    }

    @Override
    public void aliasRegistered(AliasDefinition aliasDefinition) {

    }

    @Override
    public void importProcessed(ImportDefinition importDefinition) {

    }
}
