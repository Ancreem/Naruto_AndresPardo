package com.mycompany.naruto.globalDAO;

public interface IUpdateDao<T> extends IDao{
    /**
     * Updates an existing object in the database.
     *
     * @param t The object containing updated information.
     */
    void update(T t, String estado);
}
