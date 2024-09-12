/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.msa.userprofile_soa.Service;

import com.msa.userprofile_soa.DAO.Databaseclass;
import com.msa.userprofile_soa.Model.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



/**
 *
 * @author pratap pandey
 */
public class ProfileService {
    
    private Map<Long, UserProfile> userProfiles = Databaseclass.getUser();
    
    public ProfileService(){
        UserProfile up1 = new UserProfile(1L, "Ryan", "Nathan", "msa.com");
        UserProfile up2 = new UserProfile(2L, "Michael", "Mann", "msa2.com");
        UserProfile up3 = new UserProfile(3L, "Mark", "Mike", "msa3.com");
        UserProfile up4 = new UserProfile(4L, "Wu", "Chan", "msa4.com");
        UserProfile up5 = new UserProfile(5L, "Coco", "Mann", "msa5.com");
        UserProfile up6 = new UserProfile(6L, "Nathan", "Lyon", "msa6.com");
        UserProfile up7 = new UserProfile(7L, "Austin", "Mask", "msa7.com");
        
        userProfiles.put(1L, up1);
        userProfiles.put(2L, up2);
        userProfiles.put(3L, up3);
        userProfiles.put(4L, up4);
        userProfiles.put(5L, up5);
        userProfiles.put(6L, up6);
        userProfiles.put(7L, up7);
        
    }
    
    //Method to fetch all profiles.
    public List<UserProfile> getAllProfile() {
        return new ArrayList<>(userProfiles.values());
    }
    public UserProfile getProfile(long id) {
        return userProfiles.get(id);
    }
    public UserProfile addProfile(UserProfile userProfile) {
        userProfile.setProfileID(userProfiles.size()+1);
        userProfiles.put(userProfile.getProfileID(), userProfile);
        return userProfile;
    }
    public UserProfile UpdateProfile(UserProfile userProfile) {
      if(userProfile.getProfileID() <= 0) { 
         return null;
      } else { 
         userProfiles.put(userProfile.getProfileID(), userProfile);
         return userProfile;
      }
   } //method to delete profile
   
   public void RemoveProfile(long Id) {
      userProfiles.remove(Id);
   }
    
}
