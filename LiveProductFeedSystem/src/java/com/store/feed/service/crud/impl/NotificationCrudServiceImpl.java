/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.crud.impl;

import com.store.feed.domain.Notification;
import com.store.feed.repository.GenericDAO;
import com.store.feed.service.crud.NotificationCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ronald
 */
@Service("NotificationCrudService")
@Transactional
public class NotificationCrudServiceImpl implements NotificationCrudService {
    
    @Autowired
    private GenericDAO<Notification> dao;
    
    public final void setDao(final GenericDAO< Notification> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Notification.class);
    }
    
    public NotificationCrudServiceImpl() {
    }

    @Override
    public Notification findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<Notification> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(Notification entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(Notification entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(Notification entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Notification v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<Notification> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public Notification getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<Notification> getEntitiesByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByPropertyName(name, value);
    }
    
    @Override
    public void persistMultipleEntities(List<Notification> object) {
        setDao(dao);
        dao.persistMultipleEntites(object);
    }
    
    @Override
    public void removeMultipleEntities(List<Notification> object) {
        setDao(dao);
        dao.removeMultipleEntities(object);
    }
}
