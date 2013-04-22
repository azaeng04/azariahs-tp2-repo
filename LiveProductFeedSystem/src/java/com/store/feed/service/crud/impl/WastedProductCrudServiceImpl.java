/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.crud.impl;

import com.store.feed.domain.WastedProduct;
import com.store.feed.repository.GenericDAO;
import com.store.feed.service.crud.WastedProductCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ronald
 */
@Service("WastedProductCrudService")
@Transactional
public class WastedProductCrudServiceImpl implements WastedProductCrudService {
    
    @Autowired
    private GenericDAO<WastedProduct> dao;
    
    public final void setDao(final GenericDAO< WastedProduct> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(WastedProduct.class);
    }
    
    public WastedProductCrudServiceImpl() {
    }

    @Override
    public WastedProduct findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<WastedProduct> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(WastedProduct entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(WastedProduct entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(WastedProduct entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        WastedProduct v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<WastedProduct> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public WastedProduct getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<WastedProduct> getEntitiesByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByPropertyName(name, value);
    }
    
    @Override
    public void persistMultipleEntities(List<WastedProduct> object) {
        setDao(dao);
        dao.persistMultipleEntites(object);
    }
    
    @Override
    public void removeMultipleEntities(List<WastedProduct> object) {
        setDao(dao);
        dao.removeMultipleEntities(object);
    }
}
