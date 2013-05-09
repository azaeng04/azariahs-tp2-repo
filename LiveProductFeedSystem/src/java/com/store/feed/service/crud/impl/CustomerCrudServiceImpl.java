/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.crud.impl;

import com.store.feed.domain.Customer;
import com.store.feed.repository.GenericDAO;
import com.store.feed.service.crud.CustomerCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ronald
 */
@Service("CustomerCrudService")
@Transactional(readOnly = true)
public class CustomerCrudServiceImpl implements CustomerCrudService {
    
    @Autowired
    private GenericDAO<Customer> dao;
    private static CustomerCrudServiceImpl customerCrudServiceImpl;
    
    private CustomerCrudServiceImpl() {
    }
    
    public synchronized static CustomerCrudServiceImpl getInstance() {
        if (customerCrudServiceImpl == null) {
            customerCrudServiceImpl = new CustomerCrudServiceImpl();
        }
        return customerCrudServiceImpl;
    }
    
    public final void setDao(final GenericDAO< Customer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Customer.class);
    }
    
    @Override
    public Customer findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(Customer entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(Customer entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(Customer entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Customer v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<Customer> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public Customer getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<Customer> getEntitiesByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByPropertyName(name, value);
    }
    
    @Override
    public void persistMultipleEntities(List<Customer> object) {
        setDao(dao);
        dao.persistMultipleEntites(object);
    }
    
    @Override
    public void removeMultipleEntities(List<Customer> object) {
        setDao(dao);
        dao.removeMultipleEntities(object);
    }
}