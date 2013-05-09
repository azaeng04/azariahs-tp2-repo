/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.crud.impl;

import com.store.feed.domain.ProductLocation;
import com.store.feed.repository.GenericDAO;
import com.store.feed.service.crud.ProductLocationCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ronald
 */
@Service("ProductLocationCrudService")
@Transactional(readOnly = true)
public class ProductLocationCrudServiceImpl implements ProductLocationCrudService {
    
    @Autowired
    private GenericDAO<ProductLocation> dao;
    private static ProductLocationCrudServiceImpl productLocationCrudServiceImpl;
    
    private ProductLocationCrudServiceImpl() {
    }
    
    public synchronized static ProductLocationCrudServiceImpl getInstance() {
        if (productLocationCrudServiceImpl == null) {
            productLocationCrudServiceImpl = new ProductLocationCrudServiceImpl();
        }
        return productLocationCrudServiceImpl;
    }
    
    public final void setDao(final GenericDAO< ProductLocation> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(ProductLocation.class);
    }
    
    @Override
    public ProductLocation findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<ProductLocation> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(ProductLocation entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(ProductLocation entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(ProductLocation entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        ProductLocation v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<ProductLocation> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public ProductLocation getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<ProductLocation> getEntitiesByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByPropertyName(name, value);
    }
    
    @Override
    public void persistMultipleEntities(List<ProductLocation> object) {
        setDao(dao);
        dao.persistMultipleEntites(object);
    }
    
    @Override
    public void removeMultipleEntities(List<ProductLocation> object) {
        setDao(dao);
        dao.removeMultipleEntities(object);
    }
}