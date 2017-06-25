package com.util.json.annotations.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.util.json.annotations.entity.DisputeEntity;

@SuppressWarnings("serial")
public class AccountDeserializer extends StdDeserializer<DisputeEntity> {

	public AccountDeserializer() { 
		this(null); 
		System.out.println("cons");
    } 
 
    public AccountDeserializer(Class<?> vc) { 
    	super(vc); 
    	System.out.println("cons1");
    }
    
	@Override
	public DisputeEntity deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		
		System.out.println(p);
		return null;
	}

}
