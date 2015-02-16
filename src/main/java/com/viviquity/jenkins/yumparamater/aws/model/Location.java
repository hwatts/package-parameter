package com.virginholidays.jenkins.yumparamater.aws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * yum-paramater
 *
 * @author Declan Newman (467689)
 * @since 15/02/15
 */
@XmlRootElement(name = "location", namespace = "http://linux.duke.edu/metadata/common")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Location {

    private String href;

    @XmlAttribute
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}