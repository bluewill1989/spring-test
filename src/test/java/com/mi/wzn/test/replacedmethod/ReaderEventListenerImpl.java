package com.mi.wzn.test.replacedmethod;

import org.springframework.beans.factory.parsing.*;

public class ReaderEventListenerImpl implements ReaderEventListener {
    @Override
    public void defaultsRegistered(DefaultsDefinition defaultsDefinition) {

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
