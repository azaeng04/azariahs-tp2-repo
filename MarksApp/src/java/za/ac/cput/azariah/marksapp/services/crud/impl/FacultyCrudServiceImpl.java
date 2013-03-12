/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.services.crud.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.azariah.marksapp.domain.Faculty;
import za.ac.cput.azariah.marksapp.repository.GenericDAO;
import za.ac.cput.azariah.marksapp.services.crud.FacultyCrudService;

/**
 *
 * @author Ronald
 */
@Service("FacultyCrudService")
@Transactional
public class FacultyCrudServiceImpl implements FacultyCrudService {
    
    @Autowired
    private GenericDAO<Faculty> dao;
    
    public final void setDao(final GenericDAO< Faculty> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Faculty.class);
    }
    
    public FacultyCrudServiceImpl() {
    }

    @Override
    public Faculty findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }

    @Override
    public List<Faculty> findAll() {
        setDao(dao);
        return dao.findAll();
    }
    
    @Override
    public void persist(Faculty entity) {
        setDao(dao);
        dao.persist(entity);
    }
    
    @Override
    public void merge(Faculty entity) {
        setDao(dao);
        dao.merge(entity);
    }
    
    @Override
    public void remove(Faculty entity) {
        setDao(dao);
        dao.remove(entity);
    }
    
    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Faculty v = dao.findById(entityId);
        dao.remove(v);
    }
    
    @Override
    public List<Faculty> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
        
    }

    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }

    @Override
    public Faculty getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }
    
    @Override
    public List<Faculty> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
