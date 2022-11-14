package kz.market.yeetcross.service.impl;

import kz.market.yeetcross.entity.Brand;
import kz.market.yeetcross.repository.BrandRepository;
import kz.market.yeetcross.repository.GoodRepository;
import kz.market.yeetcross.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public Brand addBrand(Brand brand) {
        return brandRepository.save(brand);
    }

}
