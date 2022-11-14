package kz.market.yeetcross.service.impl;

import kz.market.yeetcross.entity.Good;
import kz.market.yeetcross.repository.GoodRepository;
import kz.market.yeetcross.service.GoodService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@Service
public class GoodServiceImpl implements GoodService {

    private final GoodRepository goodRepository;

    public GoodServiceImpl(GoodRepository goodRepository) {
        this.goodRepository = goodRepository;
    }

    @Override
    public List<Good> findAll() {
        return goodRepository.findAll();
    }

    @Override
    public Good addGood(Good good) {
        return goodRepository.save(good);
    }

    @Override
    public void deleteGoodById(Long goodId) {
        goodRepository.deleteById(goodId);
    }

}
