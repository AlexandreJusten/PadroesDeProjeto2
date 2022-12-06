package patterns.commands;

import java.util.Stack;

public class Executor {

    private Stack<Comandos> feitos;
    private Stack<Comandos> desfeitos;

    public Executor() {
        super();
        this.feitos = new Stack<Comandos>();
        this.desfeitos = new Stack<Comandos>();
    }

    public String fazer(Comandos c){
        feitos.push(c);
        desfeitos.clear();
        return c.fazer();
    }
    public String desfazer(){
        if (feitos.isEmpty())
            return "";
        Comandos c=feitos.pop();
        desfeitos.push(c);
        return c.desfazer();
    }

    public String refazer(){
        if (desfeitos.isEmpty())
            return "";
        Comandos c= desfeitos.pop();
        feitos.push(c);
        return c.fazer();
    }
}
