/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.services.crud.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.azariah.marksapp.domain.University;
import za.ac.cput.azariah.marksapp.repository.GenericDAO;
import za.ac.cput.azariah.marksapp.services.crud.UniversityCrudService;

/**
 *
 * @author Ronald
 */
@Service("UniversityCrudService")
@Transactional
public class UniversityCrudServiceImpl implements UniversityCrudService {
    
    @Autowired
    private GenericDAO<University> dao;
    
    public final void setDao(final GenericDAO< University> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(University.class);
    }
    
    public UniversityCrudServiceImpl() {
    }

    @Override
    public University findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<University> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(University entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(University entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(University entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        University v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<University> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public University getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<University> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
