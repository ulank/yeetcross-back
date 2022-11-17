package kz.market.yeetcross.repository;

import kz.market.yeetcross.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Ulan
 * @date 11/17/2022
 */

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}

