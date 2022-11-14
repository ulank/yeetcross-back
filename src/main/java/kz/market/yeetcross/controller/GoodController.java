package kz.market.yeetcross.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kz.market.yeetcross.entity.Good;
import kz.market.yeetcross.service.GoodService;
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
@RequestMapping(value = "/good/api")
@Tag(name = "Good Controller", description = "Good management resource")
public class GoodController {

    private final GoodService goodService;

    public GoodController(GoodService goodService) {
        this.goodService = goodService;
    }

    @GetMapping
    @Operation(summary = "Get all goods")
    public ResponseEntity<List<Good>> findAll() {
        return new ResponseEntity<>(goodService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    @Operation(summary = "Add good")
    public ResponseEntity<Good> addGood(@RequestBody Good good) {
        return new ResponseEntity<>(goodService.addGood(good), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/id/{id}")
    @Operation(summary = "Delete good by id")
    public ResponseEntity<?> deleteGoodById(@PathVariable Long id) {
        try {
            goodService.deleteGoodById(id);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
