/*
 * the PersonFOrm class has two attributes; name and age.
 */

package org.wecancodeit.hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {
	@NotNull
	@Size(min = 2, max = 30) // will only allow names between 2 and 30 characters.
	private String name;

	@NotNull
	@Min(18) // wont allow if age is below 18

	private Integer age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonForm [name=" + name + ", age=" + age + "]";
	}
}
