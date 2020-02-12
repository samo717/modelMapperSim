package com.stev.modelmapper.modelmapperdemo.source;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class B {

	private String var1 = null;

	private String var2 = null;

	private C var3 = null;

	public B var1(String var1) {
		this.var1 = var1;
		return this;
	}

	public B var2(String var2) {
		this.var2 = var2;
		return this;
	}

	public B var3(C var3) {
		this.var3 = var3;
		return this;
	}
}
