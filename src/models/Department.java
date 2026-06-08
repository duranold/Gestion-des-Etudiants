package models;
import java.util.*;


public class Department  {
    private String nom;
    private LinkedList<Etudiant> list = new LinkedList<Etudiant>();


        public Department  (String nom){
            this.nom= nom;
        }

        // setters 
        public void setNom (String n){ this.nom = n; }
        public void setList(LinkedList<Etudiant> e){
            for(Etudiant el : e) this.list.add(el);
        }

        //getters 
        public String getNom(){return this.nom;}
        public LinkedList<Etudiant> getList(){
             LinkedList<Etudiant> etudiants = new LinkedList<Etudiant>();
            return etudiants;
        }
        public void afficherListeEtudiant() {
            System.out.println("\n\nLa liste d'inscription des etudiants\n\nNo\tNOM\tPRENOM\tAGE\tSEXE\tMATIERE\n\n");
            for(Etudiant e: this.list) e.afficherEtd();
        }
        
        
        // Autres methodes



        // @Override
        // public void creerFichier(Path chemin) throws IOException {
        //     if (!Files.exists(chemin)) {
        //         Files.createFile(chemin);
        //         System.out.println("Fichier creer avec succes!");
        //     }else{
        //         System.out.println("Ce fichier existe deja!");
        //     }
            
        // }
        // @Override
        // public void ecrireFichier(Path chemin, LinkedList<Etudiant> et) throws IOException ,ClassCastException {
        //     LinkedList<String> lignes = (LinkedList<String>) et.stream().map(Etudiant::toString).toList();
        //     Files.write(chemin, lignes);
        // }

        // @Override
        // public LinkedList<String> lireFichier(Path chemin) throws IOException {
        //     LinkedList<String> lignes = new LinkedList<String>();
        //     if (Files.exists(chemin)) {
        //         lignes=Files.readAllLines(chemin);
        //     }
        //     return lignes;
        // }
        // @Override
        // public boolean suprimerFichier(Path chemin) throws IOException {
            
        //     if (Files.exists(chemin)) {
        //         Files.delete(chemin);
        //         System.out.println("Le fichier "+ chemin + " a bien ete suprime!");
        //         return true;
        //     }
            
        //     return false;  
        // }

        public Etudiant studentSearch(int mat){
            for(Etudiant e: this.list){
                if(e.getId()== mat) return e;
            }
            System.out.println("L'etudiant rechercher n'existe pas!");
            return null;
        }

        public Etudiant modifierEtudiant (){ 
            Etudiant elt = Department.lireEtudiant();
            for (Etudiant l: this.list) {
                if(l.getName()==elt.getName()) {
                    l.setName(elt.getName());
                    l.setSurName(elt.getSurName());
                    l.setAge(elt.getAge());
                    l.setGender(elt.getGender());
                    return l;
                }
            }
                        
            return null;
        }
        public static Etudiant lireEtudiant() throws InputMismatchException{
            try (Scanner sc = new Scanner (System.in)) {
                System.out.println("Nom: \t");
                String nom = sc.nextLine();

                System.out.println("Prenom: \t ");
                String prenom = sc.nextLine(); 

                System.out.println("Age: \t");
                int age = sc.nextInt();
                sc.nextLine();
                
                System.out.println("sexe(entrez 0 = M ou 1 = F) : \t");
                int sexe = sc.nextInt();
                sc.nextLine();
                            
                System.out.println("Matiere : \t");
                String matiere = sc.nextLine();
                System.out.println("\n\n"); 

                return new Etudiant(nom, prenom, age, sexe, matiere);
            }
        }

        public LinkedList<Etudiant> ajouterEtudiant(){
            Etudiant e= Department.lireEtudiant();
            this.list.add(e);
            return this.list;
        }

        public LinkedList<Etudiant> supprimerEtudiant (){
            Etudiant elt = Department.lireEtudiant();
             for(Etudiant e: this.list){
                if(e.getName()== elt.getName()) this.list.remove(e);
            }
            return this.list;
        }

        public LinkedList<Etudiant> trierListeEtudiant(){
           // this.list.sort();
            return this.list;
        }
}
