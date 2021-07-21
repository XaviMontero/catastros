package com.ucacue.suscal.catastro.service;

import java.util.List;


public interface ICrud<T> {
	T save (T obj); 
	List<T> list();
}
