package view;
import models.*;
import java.util.*;
import java.nio.file.Path;

public class Consol{
    private final Scanner n; 
    private final  Department dep;
    public Path chemin ;
    public Consol(){
        this.n = new Scanner(System.in);
        this.dep = new Department("dep");
    }

    public void menu(){
        System.out.println("***************************************************************************\n");
        System.out.println("*                        GESTION DES ETUDIANTS                            *\n");
        System.out.println("***************************************************************************\n");
        System.out.println("*              1. Ajouter un etudiant                                     *\n");
        System.out.println("*              2. Supprimer un etudiant                                   *\n");
        System.out.println("*              3. Modifier un etudiant                                    *\n");
        System.out.println("*              4. Affichier la liste d'etudiants                          *\n");
        System.out.println("*              5. Trier les Etudiants                                     *\n");
        System.out.println("*              0. Quitter le programme                                    *\n");
        System.out.println("*                                                                         *\n");
        System.out.println("*              Vous pouvez entrer un chiffre entre 0 et 5                 *\n");
        System.out.println("***************************************************************************\n");
        System.out.println("Quel est votre choix ? : \n");
    
    }
    
    public void run(){
        boolean open = true;
        while(open){
            menu();
            String ne = n.nextLine().strip();
            open = traitementChoix(ne); 
        }

        System.out.println("Au revoir!");
        n.close();
    }

    public boolean traitementChoix(String n){
        switch(n){
            case "1"->this.dep.ajouterEtudiant();
            case "2"->this.dep.supprimerEtudiant();
            case "3"->this.dep.modifierEtudiant();
            case "4"->this.dep.afficherListeEtudiant();
            case "5"->this.dep.trierListeEtudiant();
            default -> System.out.println("Mauvaise saisie!!\n veuillez entrer une valeur entre 1 et 6");
        }
        return true;
    }

}