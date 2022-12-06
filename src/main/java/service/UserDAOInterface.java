package service;

import Modal.User;
import controller.UserException;

public interface UserDAOInterface {

   void addUser(String nome) throws UserException;

   User getUser(String nome) throws UserException;
}
