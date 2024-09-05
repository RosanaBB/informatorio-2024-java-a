package com.principies.DIP.refactor.factory;



import com.principies.DIP.refactor.interfaces.UserRepository;
import com.principies.DIP.refactor.LocalUserRepository;

public class UserFactory {

    /**
     * -> Esta clase se encarga de construir el objeto repository por nosotros
     *
     * -> Puede devolver LocalUserRepostiroy porque justamente esta clase implementa
     * UserRepository esto le permite devolver LocalUserRepository.
     *
     * -> Al devolver LocalUserRepository estamos devolviendo solo
     * Los metodos de local.
     */
    public static UserRepository create() {
        return new LocalUserRepository();
    }
}