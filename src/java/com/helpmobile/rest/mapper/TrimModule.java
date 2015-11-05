/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest.mapper;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.IOException;

/**
 *
 * @author terra
 */
public class TrimModule extends SimpleModule {

    public TrimModule() {
        addDeserializer(String.class, new StdScalarDeserializer<String>(String.class) {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException,
                    JsonProcessingException {
                return jp.getValueAsString().trim();
            }
        });
    }
}