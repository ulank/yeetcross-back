package kz.market.yeetcross.controller;

import kz.market.yeetcross.model.Sneaker;
import kz.market.yeetcross.service.business.SneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ulan
 * @date 11/17/2022
 */

@RestController
@RequestMapping("/api/business")
public class SneakerController {

    @Autowired
    private SneakerService sneakerService;

    @GetMapping("/sneakers")
    public ResponseEntity<List<Sneaker>> getAllProduct() {
        return ResponseEntity.ok().body(sneakerService.getAllSneakers());
    }

    @GetMapping("/sneakers/{id}")
    public ResponseEntity<Sneaker> getSneakerById(@PathVariable String id) throws ClassNotFoundException {
        return new ResponseEntity<>(sneakerService.getSneakerById(id), HttpStatus.OK);
    }

    @PostMapping("/sneakers")
    public ResponseEntity<Sneaker> createSneaker(@RequestBody Sneaker sneaker) {
        return new ResponseEntity<>(this.sneakerService.createSneaker(sneaker), HttpStatus.ACCEPTED);
    }

    @PutMapping("/sneakers/{id}")
    public ResponseEntity<Sneaker> updateSneaker(@PathVariable String id, @RequestBody Sneaker sneaker) throws ClassNotFoundException {
        return new ResponseEntity<>(this.sneakerService.updateSneaker(sneaker), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/sneakers/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String id) throws ClassNotFoundException {
        try {
            this.sneakerService.deleteSneakerById(id);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException(e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
