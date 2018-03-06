/**
 * This file was generated by the Jeddict
 */
package com.gbs.compliance.susep.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.ws.rs.FormParam;

/**
 * @author Stibiun
 */
@Entity
public class SusepEventStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @FormParam("id")
    private Long id;
    @Basic
    @FormParam("enumName")
    private String enumName;
    @Basic
    @FormParam("uiName")
    private String uiName;
    @Basic
    @FormParam("description")
    private String description;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnumName() {
        return this.enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public String getUiName() {
        return this.uiName;
    }

    public void setUiName(String uiName) {
        this.uiName = uiName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}