/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meryy.tpcustomermery.service;
import com.meryy.tpcustomermery.entity.Customer;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import jakarta.transaction.Transactional;
@RequestScoped
/**
 *
 * @author hp
 */
public class CustomerManager {
    @PersistenceContext(unitName = "customerPU")
private EntityManager em;
     public List<Customer> getAllCustomers() {
       Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList();
    }
 public Customer update(Customer customer) {
       return em.merge(customer);
    }

    public void persist(Customer customer) {
       em.persist(customer);
    }
    



    
     

    /**
     *
     * @param customer
     * @return
     */
   
    
}