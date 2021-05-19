package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



 
@Controller
@RequestMapping(path="/studenti")

public class sController {
    

    @Autowired
    public Interface iinterface;

    @GetMapping(path="/listaj")
    public @ResponseBody Iterable<Student> s() {
      return iinterface.findAll();
    }
    @PostMapping(path="/dodajonog")
    public @ResponseBody String DK(){
      Student nov = new Student();
      nov.setime("Djapex");
      nov.setprezime("Master");
      nov.setIQ(123);
      nov.setVK(12.54);
      iinterface.save(nov);
      return "nov";
    }
    @DeleteMapping(path="/obrisi{id}")
    public String deletePost(@PathVariable int id){
      iinterface.deleteById(id);
      return "obrisan je "+id;
    }
    
    @PostMapping(path="/dodaj")
    public @ResponseBody String dodaj(@RequestParam String ime,
     @RequestParam String prezime,
      @RequestParam int IQ,
       @RequestParam double VK) {
            Student nov = new Student();
            nov.setime(ime);
            nov.setprezime(prezime);
            nov.setIQ(IQ);
            nov.setVK(VK);
            iinterface.save(nov);
            return "nov";
    }
}
