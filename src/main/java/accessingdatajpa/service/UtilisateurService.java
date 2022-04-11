package accessingdatajpa.service;

import accessingdatajpa.repositories.UtilisateruRepository;
import accessingdatajpa.repositories.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

public class UtilisateurService implements IUtilisateurService {

    @Autowired
    private UtilisateruRepository utilisateurRepository ;

    @Override
    public void addUser(String nom, String description, String adresse, String ville, String code_postal, String adresse_email) {

        utilisateurRepository.save(new Utilisateur(nom, description, adresse, ville, code_postal, adresse_email));


    }



}
