/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.meryy.tpcustomermery.jsf;

import com.meryy.tpcustomermery.entity.Customer;
import com.meryy.tpcustomermery.service.CustomerManager;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hp
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
 private List<Customer> customerList;  
     @Inject
  private CustomerManager customerManager;  
    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
         public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
    }
    

