package com.java8.tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Developer {
	private int id;
	private String name;
	private String tech;
	private float experience;
	
	
	public Developer(int id, String name, String tech, float experience) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.experience = experience;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	private static List<Developer> developerList = new ArrayList<Developer>();
	
	private static Map<String, Developer> developerMap = new HashMap<String, Developer>();
	
	static{
		developerList.add(new Developer(1, "Sarvesh", "java", 4.4f));
		developerList.add(new Developer(2, "ramesh", "C++", 2.4f));
		developerList.add(new Developer(4, "suresh", "Angular", 1f));
		developerList.add(new Developer(3, "kamlesh", "Dot net", 2f));
		developerList.add(new Developer(5, "vimlesh", "Angular", 14f));
		developerList.add(new Developer(8, "yogesh", "java", 15f));
		developerList.add(new Developer(11, "Dharmesh", "Power BI", 3.5f));
		developerList.add(new Developer(7, "Vishesh", "Python", .6f));
		developerList.add(new Developer(12, "Sarvesh", "typescript", 4.5f));
		developerList.add(new Developer(10, "Kalpesh", "JavaScript", 9f));
		developerList.add(new Developer(6, "Dhanesh", "java", 4.4f));
		
		developerMap.put("IT",new Developer(1, "Sarvesh", "java", 4.4f));
		developerMap.put("DBA",new Developer(2, "ramesh", "C++", 2.4f));
		developerMap.put("ADMIN",new Developer(4, "suresh", "Angular", 1f));
		developerMap.put("HR",new Developer(3, "kamlesh", "Dot net", 2f));
		developerMap.put("HELPER",new Developer(5, "vimlesh", "Angular", 14f));
		developerMap.put("TECHLEAD",new Developer(8, "yogesh", "java", 15f));
		developerMap.put("SECURITY",new Developer(11, "Dharmesh", "Power BI", 3.5f));
	}
	
	public static List<Developer> getDeveloperList() {
		return developerList;
	}
	
	public static Map<String, Developer> getDeveloperMap() {
		return developerMap;
	}
	
	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", tech=" + tech + ", experience=" + experience + "]";
	}
	
	
	
}
