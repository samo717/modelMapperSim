package com.stev.modelmapper.modelmapperdemo.target;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class C {
	private String var1 = null;

	private String var2 = null;

	private D var3 = null;

    public C var1(String var1) {
        this.var1 = var1;
        return this;
    }
}
