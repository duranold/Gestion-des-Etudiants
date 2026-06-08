package services;

import java.util.*;
import java.nio.file.Path;
import java.io.*;
import models.Etudiant;

public interface SGF {

    void creerFichier( Path chemin) throws IOException; 
    void ecrireFichier(Path chemin, LinkedList<Etudiant> et) throws IOException; 
    LinkedList<String> lireFichier(Path chemin) throws IOException; 
    boolean suprimerFichier(Path chemin) throws IOException; 
}
