package org.example.gestioneBiblioteca.services;

import org.example.gestioneBiblioteca.models.User;

import java.util.List;

public interface UserService {

    public User createUser(String nome, String email, String telefono);
    public User createFakeUser();
    public void saveUser(User user);
    public User findUser(long id);
    public List<User> findAll();
    public void deleteUser(User user);

}
