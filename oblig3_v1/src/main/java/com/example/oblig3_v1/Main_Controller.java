package com.example.oblig3_v1;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class Main_Controller {

    @Autowired
    OrderRepository rep;

    @PostMapping("/addOrder")
    public void lagreBillett(Order orderInn) { rep.save(orderInn); } // POST metoden som legger til objekter i arrayet.

    @GetMapping("/getOrders")
    public List<Order> hentAlle() {
        return rep.findByOrderByName();
    } // GET metoden som henter ut billettene.

    @DeleteMapping("/slettAlle")
    public void slettAlle() { rep.deleteAll(); } // GET metoden som sletter alle objektene i arrayet ved bruk av clear().

    @Transactional
    @DeleteMapping("/slettEnkel/{id}")
    public void slettEnkel(@PathVariable String id) { rep.deleteById(Integer.parseInt(id)); } // DELETE metoden som sletter ett enkelt objekt med currentID.
}
