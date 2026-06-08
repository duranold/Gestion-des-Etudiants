package models;

import java.io.Serializable;
public class Etudiant implements Serializable{
    public Etudiant(String mName,String mSurName, int age, int gender, String major){
     this.mName= mName; this.mSurName = mSurName; this.mAge = age;  this.mGender = gender; 
    this.mMajor = major;    mNbreEtudiant++;  this.id =mNbreEtudiant; 
    }
    public Etudiant(){}
    // getters 

    public String getName(){return this.mName;}
    public String getSurName(){return this.mSurName;}
    public int getAge(){return this.mAge;}
    public int getGender(){ return this.mGender;}
    public int getId(){ return this.id;}
    
    // setters
    
    public  void setName(String a){ this.mName = a;}
    public void setSurName(String a){this.mSurName= a;}
    public void setAge( int a){this.mAge = a;}
    public void setGender(int a){this.mGender = a;}
    // others methods
    
    @Override
    public String toString(){return this.id + "\t" + this.mName+ "\t"+ this.mSurName + "\t"+ this.mAge + "\t"+this.mGender+ "\t"+ this.mMajor+ "\n";} 

    public void afficherEtd(){
        System.out.println(this.toString());
    }

        private String mName;
        private String mSurName;
        private int mAge;
        private int mGender;
        private String mMajor;
        private int id;
        private static int mNbreEtudiant= 0;

}  