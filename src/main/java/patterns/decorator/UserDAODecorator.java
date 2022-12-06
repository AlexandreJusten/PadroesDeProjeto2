package patterns.decorator;

import Modal.User;
import controller.UserException;
import patterns.proxy.UserDAOProxy;
import service.UserDAOInterface;

public class UserDAODecorator implements UserDAOInterface {
    private static UserDAOInterface userDAO;

    private UserDAOInterface getDAO() {
        if (userDAO==null)
            userDAO=new UserDAOProxy();
        return userDAO;
    }

    @Override
    public void addUser(String nome) throws UserException {
        if (nome.isBlank())
            throw new UserException("Digite um nome Valido");
        getDAO().addUser(nome);
    }

    @Override
    public User getUser(String nome) throws UserException {
        if (nome.isBlank())
            throw new UserException("Digite um nome Valido");
            User u = getDAO().getUser(nome);
        if (u==null)
            throw new UserException("Digite um nome Valido");
        return u;
    }
}
