/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.msa.userprofile_soa.Resource;

import com.msa.userprofile_soa.Model.UserProfile;
import com.msa.userprofile_soa.Service.ProfileService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author pratap pandey
 */
@Path("/Profile")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class ProfileResource {
    
    ProfileService messageService = new ProfileService();
    
    @GET
    public List getAllProfile(){
        return messageService.getAllProfile();
    }
    
    @GET
    @Path("{/ProfileID}")
    public UserProfile getProfile(@PathParam("ProfileID")long ID) {
        return messageService.getProfile(ID);
    }
    
    @POST
    public UserProfile addProfile(UserProfile profile) {
        return messageService.addProfile(profile);
    }
    
    @PUT
   @Path("/{proID}")
   public UserProfile UpdateProfile(@PathParam("proID")long Id,UserProfile UserProfile) {
      UserProfile.setProfileID(Id);
      return messageService.UpdateProfile(UserProfile);
   }
   
   @DELETE
   @Path("/{ProID}")
   public void deleteProfile(@PathParam("ProID")long Id) {
      messageService.RemoveProfile(Id);
   }
}
