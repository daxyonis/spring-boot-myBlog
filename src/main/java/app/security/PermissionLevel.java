package app.security;

import java.util.EnumMap;
import java.util.ArrayList;
import java.util.List;

/**
 * Enum class PermissionLevel to describe hierarchical 
 * permission levels (GUEST being the lowest and ADMIN the highest clearance)
 * Implements the  PathBindable interface to bind from request enum name to PermissionLevel object
 * @author Eva
 *
 */
public enum PermissionLevel {
	GUEST, 
	USER, 
	VENDOR, 
	BUYER, 
	ADMIN;
	
    	private PermissionLevel(){
    	    
    	}
	//****************************
	// TODO : return a list of PermissionLevel to use in user details view 
	private static EnumMap<PermissionLevel, String> levelMap = new EnumMap<PermissionLevel,String>(PermissionLevel.class);
	
	public static List<PermissionLevel> getAll(){
		return new ArrayList<PermissionLevel>(levelMap.keySet());
	}
	//****************************
	
	@Override public String toString(){
	      /*
	      * Either name() or super.toString() may be called here.
	      * name() is final, and always returns the exact name as specified in
	      * declaration; toString() is not final, and is intended for presentation
	      * to the user. It seems best to call name() here.
	      */
	      return "Permission: " + name();
	    }

}
