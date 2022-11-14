package kz.market.yeetcross.service;

import kz.market.yeetcross.entity.Details;

/**
 * @author Ulan
 * @date 11/9/2022
 */

public interface DetailsService {

    Details addDetails(Long goodId, Details details);

}
