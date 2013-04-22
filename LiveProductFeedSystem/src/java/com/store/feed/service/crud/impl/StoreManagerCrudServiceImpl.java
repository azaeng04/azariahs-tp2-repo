/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.crud.impl;

import com.store.feed.domain.StoreManager;
import com.store.feed.repository.GenericDAO;
import com.store.feed.service.crud.StoreManagerCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ronald
 */
@Service("StoreManagerCrudService")
@Transactional
public class StoreManagerCrudServiceImpl implements StoreManagerCrudService {
    
    @Autowired
    private GenericDAO<StoreManager> dao;
    
    public final void setDao(final GenericDAO< StoreManager> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(StoreManager.class);
    }
    
    public StoreManagerCrudServiceImpl() {
    }

    @Override
    public StoreManager findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<StoreManager> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(StoreManager entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(StoreManager entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(StoreManager entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        StoreManager v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<StoreManager> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public StoreManager getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<StoreManager> getEntitiesByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByPropertyName(name, value);
    }
    
    @Override
    public void persistMultipleEntities(List<StoreManager> object) {
        setDao(dao);
        dao.persistMultipleEntites(object);
    }
    
    @Override
    public void removeMultipleEntities(List<StoreManager> object) {
        setDao(dao);
        dao.removeMultipleEntities(object);
    }
}
