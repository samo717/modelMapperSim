package com.stev.modelmapper.modelmapperdemo.source;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class A {

	private B var1 = null;

	public A var1(B var1) {
		this.var1 = var1;
		return this;
	}
}
