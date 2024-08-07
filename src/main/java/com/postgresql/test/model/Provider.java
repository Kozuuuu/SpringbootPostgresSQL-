package com.postgresql.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "alerts")
public class Provider {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String siteId;
    private String dateTimestamp;
    private String dateOld;
    private String providerPrimaryOld;
    private String providerBackupOld;
    private String dateNew;
    private String providerPrimaryNew;
    private String providerBackupNew;

    // Getters and Setters
    public  Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getDateTimestamp() {
        return dateTimestamp;
    }

    public void setDateTimestamp(String dateTimestamp) {
        this.dateTimestamp = dateTimestamp;
    }

    public String getDateOld() {
        return dateOld;
    }

    public void setDateOld(String dateOld) {
        this.dateOld = dateOld;
    }

    public String getProviderPrimaryOld() {
        return providerPrimaryOld;
    }

    public void setProviderPrimaryOld(String providerPrimaryOld) {
        this.providerPrimaryOld = providerPrimaryOld;
    }

    public String getProviderBackupOld() {
        return providerBackupOld;
    }

    public void setProviderBackupOld(String providerBackupOld) {
        this.providerBackupOld = providerBackupOld;
    }

    public String getDateNew() {
        return dateNew;
    }

    public void setDateNew(String dateNew) {
        this.dateNew = dateNew;
    }

    public String getProviderPrimaryNew() {
        return providerPrimaryNew;
    }

    public void setProviderPrimaryNew(String providerPrimaryNew) {
        this.providerPrimaryNew = providerPrimaryNew;
    }

    public String getProviderBackupNew() {
        return providerBackupNew;
    }

    public void setProviderBackupNew(String providerBackupNew) {
        this.providerBackupNew = providerBackupNew;
    }
}
