/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.crud.impl;

import com.store.feed.domain.StockManager;
import com.store.feed.repository.GenericDAO;
import com.store.feed.service.crud.StockManagerCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ronald
 */
@Service("StockManagerCrudService")
@Transactional(readOnly = true)
public class StockManagerCrudServiceImpl implements StockManagerCrudService {
    
    @Autowired
    private GenericDAO<StockManager> dao;
    private static StockManagerCrudServiceImpl stockManagerCrudServiceImpl;
    
    private StockManagerCrudServiceImpl() {
    }
    
    public synchronized static StockManagerCrudServiceImpl getInstance() {
        if (stockManagerCrudServiceImpl == null) {
            stockManagerCrudServiceImpl = new StockManagerCrudServiceImpl();
        }
        return stockManagerCrudServiceImpl;
    }
    
    public final void setDao(final GenericDAO< StockManager> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(StockManager.class);
    }
    
    @Override
    public StockManager findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<StockManager> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(StockManager entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(StockManager entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(StockManager entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        StockManager v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<StockManager> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public StockManager getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<StockManager> getEntitiesByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByPropertyName(name, value);
    }
    
    @Override
    public void persistMultipleEntities(List<StockManager> object) {
        setDao(dao);
        dao.persistMultipleEntites(object);
    }
    
    @Override
    public void removeMultipleEntities(List<StockManager> object) {
        setDao(dao);
        dao.removeMultipleEntities(object);
    }
}