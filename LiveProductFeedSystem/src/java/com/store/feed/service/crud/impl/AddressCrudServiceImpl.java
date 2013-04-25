/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.crud.impl;

import com.store.feed.domain.Address;
import com.store.feed.repository.GenericDAO;
import com.store.feed.service.crud.AddressCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ronald
 */
@Service("AddressCrudService")
@Transactional
public class AddressCrudServiceImpl implements AddressCrudService {
    
    @Autowired
    private GenericDAO<Address> dao;
    
    public final void setDao(final GenericDAO< Address> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Address.class);
    }
    
    public AddressCrudServiceImpl() {
    }

    @Override
    public Address findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<Address> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(Address entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(Address entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(Address entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Address v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<Address> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public Address getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<Address> getEntitiesByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByPropertyName(name, value);
    }
    
    @Override
    public void persistMultipleEntities(List<Address> object) {
        setDao(dao);
        dao.persistMultipleEntites(object);
    }
    
    @Override
    public void removeMultipleEntities(List<Address> object) {
        setDao(dao);
        dao.removeMultipleEntities(object);
    }
}