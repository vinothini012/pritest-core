package no.citrus.restapi.model;


import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Measure implements Comparable<Measure> {
	public String source;
	public String name;
	@XmlElementWrapper(name = "children")
	@XmlElement(name = "measure")
	public List<Measure> children;
	public double value;
	public Category category;
	public Date date;
	public boolean failed;
	public int numOfFails;

	public Measure() {}
    
    public Measure(String source, Date date, List<Measure> children, int numOfFails) {
    	this.source = source;
    	this.date = date;
    	this.children = children;
    	this.numOfFails = numOfFails;
    }
    
    public Measure(String name) {
    	this.name = name;
    }
    
    public int getNumOfFails() {
		return numOfFails;
	}

	public void setNumOfFails(int numOfFails) {
		this.numOfFails = numOfFails;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<Measure> getChildren() {
		return children;
	}

	public void setChildren(List<Measure> children) {
		this.children = children;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isFailed() {
		return failed;
	}

	public void setFailed(boolean failed) {
		this.failed = failed;
	}
	
	@Override
	public int compareTo(Measure arg) {
		return this.numOfFails - arg.getNumOfFails();
	}
}
