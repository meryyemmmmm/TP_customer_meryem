/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meryy.tpcustomermery.service;

import com.meryy.tpcustomermery.entity.Discount;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import java.util.List;

/**
 *
 * @author hp
 */
@RequestScoped
public class DiscountManager {

    @PersistenceContext
    private EntityManager em;

    public List<Discount> getAllDiscounts() {
        Query query = em.createNamedQuery("Discount.findAll");
        return query.getResultList();
    }

    public Discount findById(String code) {
        return em.find(Discount.class, code);
    }

    @Transactional
    public void persist(Discount discount) {
        em.persist(discount);
    }
 
}
