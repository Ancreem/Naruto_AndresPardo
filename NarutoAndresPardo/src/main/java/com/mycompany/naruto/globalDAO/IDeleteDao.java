package com.mycompany.naruto.globalDAO;

public interface IDeleteDao<T> extends IDao {
    /**
     * Deletes an object from the database based on its unique identifier.
     *
     * @param id The unique identifier of the object to be deleted.
     */
    void delete(long id);
}
