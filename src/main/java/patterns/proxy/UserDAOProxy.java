package patterns.proxy;

import Modal.User;
import controller.UserException;
import service.UserDAOInterface;

import java.util.HashMap;
import java.util.Map;

public class UserDAOProxy implements UserDAOInterface {

    private Map<String,User> users;

    public UserDAOProxy() {
       super();
       this.users=new HashMap<>();
    }

    @Override
    public void addUser(String nome) throws UserException {
        this.users.put(nome,new User(nome));
    }

    @Override
    public User getUser(String nome) throws UserException {

        return users.get(nome);
    }
}
