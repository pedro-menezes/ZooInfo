/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;

/**
 *
 * @author pedro-menezes
 */
public interface CRUD<T, C> {

    public abstract boolean save(T objeto);

    public abstract T findById(C codigo);

    public abstract List<T> findAll();

    public abstract boolean remove(C codigo);
}
