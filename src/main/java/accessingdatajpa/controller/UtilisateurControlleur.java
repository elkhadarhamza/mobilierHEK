package accessingdatajpa.controller;

import accessingdatajpa.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class UtilisateurControlleur {
    @Autowired
    private IUtilisateurService utilisateurService;

    @PostMapping(value = "/api/Utilisateur/add")
    public void ajouterUtilisateur(@RequestParam(value = "nom") String nom,
                                   @RequestParam(value = "description") String description,
                                   @RequestParam(value = "adresse") String adresse,
                                   @RequestParam(value = "ville") String ville,
                                   @RequestParam(value = "code_postal") String code_postal,
                                   @RequestParam(value = "adresse_email") String adresse_email) {
        utilisateurService.addUser(nom, description, adresse, ville, code_postal, adresse_email);
    }
}
