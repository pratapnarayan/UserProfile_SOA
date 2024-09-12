/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.msa.userprofile_soa.Model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author prata
 */
@XmlRootElement
public class UserProfile {
    
    private long profileID;
    private String fName;
    private String lName;
    private String add;
    
    public UserProfile(long profileID, String fName, String lName, String add) {
        this.profileID = profileID;
        this.fName = fName;
        this.lName = lName;
        this.add = add;
    }

    public long getProfileID() {
        return profileID;
    }

    public void setProfileID(long profileID) {
        this.profileID = profileID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    
    
}
