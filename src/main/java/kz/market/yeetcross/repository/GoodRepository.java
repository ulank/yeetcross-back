package kz.market.yeetcross.repository;

import kz.market.yeetcross.entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@Repository
public interface GoodRepository extends JpaRepository<Good, Long> {
}
