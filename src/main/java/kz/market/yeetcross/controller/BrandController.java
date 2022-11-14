package kz.market.yeetcross.controller;

import kz.market.yeetcross.entity.Brand;
import kz.market.yeetcross.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/brand/api")
public class BrandController {

    private final BrandRepository brandRepository;


    public BrandController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @PostMapping
    public ResponseEntity<Brand> addBrand(@RequestBody Brand brand){
        return new ResponseEntity<>(brandRepository.save(brand), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Brand>> findAll(){
        return new ResponseEntity<>(brandRepository.findAll(), HttpStatus.OK);
    }

}
