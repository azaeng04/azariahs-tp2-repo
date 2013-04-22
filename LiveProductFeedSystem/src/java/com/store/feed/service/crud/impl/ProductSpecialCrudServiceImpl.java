/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.crud.impl;

import com.store.feed.domain.ProductSpecial;
import com.store.feed.repository.GenericDAO;
import com.store.feed.service.crud.ProductSpecialCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ronald
 */
@Service("ProductSpecialCrudService")
@Transactional
public class ProductSpecialCrudServiceImpl implements ProductSpecialCrudService {
    
    @Autowired
    private GenericDAO<ProductSpecial> dao;
    
    public final void setDao(final GenericDAO< ProductSpecial> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(ProductSpecial.class);
    }
    
    public ProductSpecialCrudServiceImpl() {
    }

    @Override
    public ProductSpecial findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<ProductSpecial> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(ProductSpecial entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(ProductSpecial entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(ProductSpecial entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        ProductSpecial v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<ProductSpecial> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public ProductSpecial getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<ProductSpecial> getEntitiesByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByPropertyName(name, value);
    }
    
    @Override
    public void persistMultipleEntities(List<ProductSpecial> object) {
        setDao(dao);
        dao.persistMultipleEntites(object);
    }
    
    @Override
    public void removeMultipleEntities(List<ProductSpecial> object) {
        setDao(dao);
        dao.removeMultipleEntities(object);
    }
}
