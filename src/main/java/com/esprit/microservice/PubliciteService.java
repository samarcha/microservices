package com.esprit.microservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PubliciteService {
	
	@Autowired
	private PubliciteRepository publiciteRepository;
	
	public List<Publicite> fetchAll() {
		return publiciteRepository.findAll();
	}

	public Publicite addPublicite(Publicite publicite) {
		return publiciteRepository.save(publicite);
	}
	
	public Publicite updatePublicite(int id, Publicite newPublicite) {
		if (publiciteRepository.findById(id).isPresent()) {
			Publicite existingPublicite = publiciteRepository.findById(id).get();
			existingPublicite.setDescription(newPublicite.getDescription());
			existingPublicite.setType(newPublicite.getType());
			existingPublicite.setImage(newPublicite.getImage());
			existingPublicite.setDate_debut(newPublicite.getDate_debut());
			existingPublicite.setDate_fin(newPublicite.getDate_fin());

			return publiciteRepository.save(existingPublicite);
		} else
			return null;
	}
	
	public String deletePublicite(int id) {
		if (publiciteRepository.findById(id).isPresent()) {
			publiciteRepository.deleteById(id);
			return "publicite supprimé";
		} else
			return "publicite non supprimé";
	}

}
