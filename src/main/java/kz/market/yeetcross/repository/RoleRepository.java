package kz.market.yeetcross.repository;

import kz.market.yeetcross.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Ulan
 * @date 11/17/2022
 */

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByRole(String role);
}
