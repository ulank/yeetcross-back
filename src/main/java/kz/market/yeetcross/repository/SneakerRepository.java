package kz.market.yeetcross.repository;

import kz.market.yeetcross.model.Sneaker;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Ulan
 * @date 11/17/2022
 */

public interface SneakerRepository extends MongoRepository<Sneaker, String> {
    List<Sneaker> getSneakersByIsHitIsTrue();
}
