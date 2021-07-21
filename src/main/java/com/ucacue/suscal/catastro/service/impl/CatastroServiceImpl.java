package com.ucacue.suscal.catastro.service.impl;

import com.ucacue.suscal.catastro.entity.Catastro;
import com.ucacue.suscal.catastro.repository.CatastroRepository;
import com.ucacue.suscal.catastro.service.ICrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatastroServiceImpl implements ICrud<Catastro> {

    @Autowired
    private CatastroRepository repo;

    @Override
    public Catastro save(Catastro obj) {
        return repo.save(obj);
    }

    @Override
    public List<Catastro> list() {
        return repo.findAll();
    }

}
