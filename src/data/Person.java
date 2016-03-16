package data;

import java.util.List;

public class Person {
	private String name;
	private String email;
	private List<Skill> skillset;

	public Person() {

	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected List<Skill> getSkillset() {
		return skillset;
	}

	protected void setSkillset(List<Skill> skillset) {
		this.skillset = skillset;
	}

	protected void addSkill(Skill skill) {
		skillset.add(skill);

	}
}
