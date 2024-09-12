/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.msa.userprofile_soa.DAO;
import com.msa.userprofile_soa.Model.UserProfile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pratap pandey
 */
public class Databaseclass {
    
    private static final Map<Long, UserProfile> message = new HashMap<>();
    
    public static Map<Long, UserProfile> getUser(){
        return message;
    }
    
}
