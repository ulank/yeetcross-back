package kz.market.yeetcross.service.impl;

import kz.market.yeetcross.entity.Details;
import kz.market.yeetcross.repository.DetailsRepository;
import kz.market.yeetcross.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@Service
public class DetailsServiceImpl implements DetailsService {

    private final DetailsRepository detailsRepository;

    public DetailsServiceImpl(DetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }


    @Override
    public Details addDetails(Long goodId, Details details) {
        return detailsRepository.saveAndFlush(details);
    }
}
