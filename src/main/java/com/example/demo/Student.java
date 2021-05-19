package com.example.demo;

import java.lang.Override;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int ID;
    public String ime;
    public String prezime;
    public  int IQ;
    public static class Kurcina{

        public static int idk;
        public static double VK;
    } 
    public Student(int ID, String ime, String prezime, int IQ, double VK){
        this.ID = ID;
        this.ime = ime;
        this.prezime = prezime;
        this.IQ = IQ;
        Kurcina.idk = ID;
        Kurcina.VK = VK;

    }
    public Student(int ID){
        this.ID= ID;
    }
    public Student(){

    }
    public Student( String ime, String prezime, int IQ, int idk, double VK){
        this.ime = ime;
        this.prezime = prezime;
        this.IQ = IQ;
        Kurcina.idk = idk;
        Kurcina.VK = VK;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public String getime(){
        return ime;
    }
    public void setime(String ime){
        this.ime = ime;
    }
    public String getprezime(){
        return prezime;
    }
    public void setprezime(String prezime){
        this.prezime = prezime;
    }
    public int getIQ(){
        return IQ;
    }
    public void setIQ(int IQ){
        this.IQ = IQ;
    }
    public int getidk(){
        return Kurcina.idk;
    }
    public void setidk(int ID){
        Kurcina.idk = ID;
    }
    public double getVK(){
        return Kurcina.VK;
    }
    public void setVK(double VK){
        Kurcina.VK = VK;
    }
    @Override
    public String toString(){
        return "Student{"+
                "ID="+ ID +
                ", ime="+ ime +
                ", prezime="+prezime+
                ", IQ="+IQ+
                ", IDK="+Kurcina.idk+
                ", VK=" +Kurcina.VK+
                "}";
    }

}
