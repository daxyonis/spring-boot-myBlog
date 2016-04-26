/**
 * 
 */
package app.services.dao;

import java.util.List;
import app.security.PermissionLevel;
import app.models.Usager;

/**
 * @author Eva
 *
 */
public interface UsagerDAO {	
	
	public PermissionLevel getUserLevel(String emailAddress);
		
	public Usager findByEmailAddressAndPassword(String emailAddress, String password);
	
	public List<Usager> findAll();
	
	public Usager findById(int id);
	
	public boolean add(Usager user);
	
	public boolean update(Usager user);
	
	public boolean remove(int id);
}
