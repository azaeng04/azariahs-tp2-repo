/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.crud.impl;

import com.store.feed.domain.ActiveMQMessage;
import com.store.feed.repository.GenericDAO;
import com.store.feed.service.crud.ActiveMQMessageCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ronald
 */
@Service("ActiveMQMessageCrudService")
@Transactional(readOnly = true)
public class ActiveMQMessageCrudServiceImpl implements ActiveMQMessageCrudService {
    
    @Autowired
    private GenericDAO<ActiveMQMessage> dao;
    private static ActiveMQMessageCrudServiceImpl activeMQMessageCrudServiceImpl;
    
    private ActiveMQMessageCrudServiceImpl() {
    }
    
    public synchronized static ActiveMQMessageCrudServiceImpl getInstance() {
        if (activeMQMessageCrudServiceImpl == null) {
            activeMQMessageCrudServiceImpl = new ActiveMQMessageCrudServiceImpl();
        }
        return activeMQMessageCrudServiceImpl;
    }
    
    public final void setDao(final GenericDAO< ActiveMQMessage> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(ActiveMQMessage.class);
    }
    
    @Override
    public ActiveMQMessage findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<ActiveMQMessage> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(ActiveMQMessage entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(ActiveMQMessage entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(ActiveMQMessage entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        ActiveMQMessage v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<ActiveMQMessage> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public ActiveMQMessage getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<ActiveMQMessage> getEntitiesByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByPropertyName(name, value);
    }
    
    @Override
    public void persistMultipleEntities(List<ActiveMQMessage> object) {
        setDao(dao);
        dao.persistMultipleEntites(object);
    }
    
    @Override
    public void removeMultipleEntities(List<ActiveMQMessage> object) {
        setDao(dao);
        dao.removeMultipleEntities(object);
    }
}