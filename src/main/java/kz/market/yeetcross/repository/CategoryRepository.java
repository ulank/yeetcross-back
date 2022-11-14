package kz.market.yeetcross.repository;

import kz.market.yeetcross.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
