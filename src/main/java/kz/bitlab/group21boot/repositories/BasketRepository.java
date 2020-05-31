package kz.bitlab.group21boot.repositories;

import kz.bitlab.group21boot.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket, Long> {
    List<Basket> findAllByAuthor_Id(Long id);
    Basket findAllByAuthor(Users u);
    List<Items> findAllById(Long id);
}