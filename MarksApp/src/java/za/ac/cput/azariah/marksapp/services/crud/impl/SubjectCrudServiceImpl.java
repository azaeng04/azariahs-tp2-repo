/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.services.crud.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.azariah.marksapp.domain.Subject;
import za.ac.cput.azariah.marksapp.repository.GenericDAO;
import za.ac.cput.azariah.marksapp.services.crud.SubjectCrudService;

/**
 *
 * @author Ronald
 */
@Service("SubjectCrudService")
@Transactional
public class SubjectCrudServiceImpl implements SubjectCrudService {
    
    @Autowired
    private GenericDAO<Subject> dao;
    
    public final void setDao(final GenericDAO< Subject> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Subject.class);
    }
    
    public SubjectCrudServiceImpl() {
    }

    @Override
    public Subject findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<Subject> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(Subject entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(Subject entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(Subject entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Subject v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<Subject> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public Subject getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<Subject> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
