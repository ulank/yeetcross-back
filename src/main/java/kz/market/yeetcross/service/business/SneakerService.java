package kz.market.yeetcross.service.business;

import kz.market.yeetcross.model.Sneaker;
import kz.market.yeetcross.repository.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Ulan
 * @date 11/17/2022
 */

@Service
public class SneakerService {

    @Autowired
    private SneakerRepository sneakerRepository;

    public Sneaker createSneaker(Sneaker sneaker) {
        return sneakerRepository.save(sneaker);
    }

    public Sneaker updateSneaker(Sneaker newSneaker) throws ClassNotFoundException {
        Optional<Sneaker> oldSneaker = this.sneakerRepository.findById(newSneaker.getId());
        if (oldSneaker.isPresent()) {
            Sneaker updatedSneaker = oldSneaker.get();
            updatedSneaker.setId(newSneaker.getId());
            updatedSneaker.setName(newSneaker.getName());
            updatedSneaker.setDescription(newSneaker.getDescription());
            updatedSneaker.setImage(newSneaker.getImage());
            updatedSneaker.setBrand(newSneaker.getBrand());
            updatedSneaker.setOffers(newSneaker.getOffers());
            updatedSneaker.setHit(newSneaker.isHit());
            sneakerRepository.save(updatedSneaker);
            return updatedSneaker;
        } else {
            throw new ClassNotFoundException("Record not found with id : " + newSneaker.getId());
        }
    }

    public List<Sneaker> getAllSneakers() {
        return sneakerRepository.findAll();
    }

    public List<Sneaker> getAllSneakersHits(){
        return sneakerRepository.getSneakersByIsHitIsTrue();
    }

    public Sneaker getSneakerById(String sneakerId) throws ClassNotFoundException {
        Optional<Sneaker> sneakerOptional = this.sneakerRepository.findById(sneakerId);

        if (sneakerOptional.isPresent()) {
            return sneakerOptional.get();
        } else {
            throw new ClassNotFoundException("Record not found with id : " + sneakerId);
        }
    }

    public void deleteSneakerById(String sneakerId) throws ClassNotFoundException {
        Optional<Sneaker> sneakerOptional = this.sneakerRepository.findById(sneakerId);

        if (sneakerOptional.isPresent()) {
            this.sneakerRepository.delete(sneakerOptional.get());
        } else {
            throw new ClassNotFoundException("Record not found with id : " + sneakerId);
        }
    }
}
