package org.springframework.learning;

import org.springframework.lang.Nullable;

public class Foo {
	@Nullable
	private String fooName;
	@Nullable
	private String barName;

	public Foo() {
		System.out.println("Foo constructor");
	}


	public Foo(String fooName) {
		this.fooName = fooName;
	}

	public Foo(String fooName, String barName) {
		this.fooName = fooName;
		this.barName = barName;
	}

	@Nullable
	public String getFooName() {
		return fooName;
	}

	public void setFooName(String fooName) {
		this.fooName = fooName;
	}

	@Nullable
	public String getBarName() {
		return barName;
	}

	public void setBarName(String barName) {
		this.barName = barName;
	}
}
