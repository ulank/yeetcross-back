package kz.market.yeetcross.service;

import kz.market.yeetcross.entity.Good;

import java.util.List;

/**
 * @author Ulan
 * @date 11/9/2022
 */

public interface GoodService {

    List<Good> findAll();

    Good addGood(Good good);

    void deleteGoodById(Long goodId);
}
