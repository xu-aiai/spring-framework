package org.springframework.learning;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DefaultFooService implements FooService {

	@Override
	public Foo getFoo(String fooName) {
		// ...
		return new Foo(fooName);
	}

	@Override
	public Foo getFoo(String fooName, String barName) {
		// ...
		return new Foo(fooName, barName);
	}

	@Transactional
	@Override
	public void insertFoo(Foo foo) {
		// ...
	}

	@Override
	public void updateFoo(Foo foo) {
		// ...
	}
}