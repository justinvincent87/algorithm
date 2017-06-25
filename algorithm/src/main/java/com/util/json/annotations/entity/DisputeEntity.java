package com.util.json.annotations.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.util.json.annotations.test.AccountDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DisputeEntity {

	@JsonProperty
	private String segmentName;
	@JsonDeserialize(using = AccountDeserializer.class)
	private String account;

	public String getSegmentName() {
		return segmentName;
	}

	//@JsonSetter("segmentName")
	public void setSegmentName(String segmentName) {
		this.segmentName = segmentName;
	}

	public String getAccount() {
		return account;
	}

	/*
	 * @JsonSetter("firstLast") public void setFirstLastName(String account) {
	 * this.account = account; }
	 */

	/*
	 * @JsonSetter("account") public void setAccount(String account) {
	 * this.account = account; }
	 */

	//@SegmentSetter(propertyName = "firstLast")
	public void setAccount(String propertyName) {
		//System.out.println(segmentName + " : " + propertyName);
		this.account = propertyName;
	}

	@Override
	public String toString() {
		return "DisputeEntity [segmentName=" + segmentName + ", account=" + account + "]";
	}

}
