/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.services.crud.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.azariah.marksapp.domain.Lecturer;
import za.ac.cput.azariah.marksapp.repository.GenericDAO;
import za.ac.cput.azariah.marksapp.services.crud.LecturerCrudService;

/**
 *
 * @author 210192461
 */
@Service("LecturerCrudService")
@Transactional
public class LecturerCrudServiceImpl implements LecturerCrudService{
    
    @Autowired
    private GenericDAO<Lecturer> dao;

    public final void setDao(final GenericDAO< Lecturer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Lecturer.class);
    }

    public LecturerCrudServiceImpl() {
    }
    @Override
    public Lecturer findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Lecturer> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Lecturer entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Lecturer entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Lecturer entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Lecturer v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Lecturer> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Lecturer getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Lecturer> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
