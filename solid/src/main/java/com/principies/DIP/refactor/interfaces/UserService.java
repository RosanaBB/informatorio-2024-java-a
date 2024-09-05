package com.principies.DIP.refactor.interfaces;


import com.principies.DIP.refactor.factory.UserFactory;
import com.principies.DIP.refactor.interfaces.UserRepository;

public class UserService {
    public void showUser() {
        //Aquí se incumple el principio de inversion de dependencias
        UserRepository userRepository = UserFactory.create();
        User user = userRepository.getUserById(1L);

        System.out.println("Email : " + user.getEmail());
    }
}