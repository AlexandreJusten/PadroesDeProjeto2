package Modal;

public class LivroInformacoes {
    private String nome;
    private String paginas;
    private String avaliacoes;
    private static LivroInformacoes livroInformacoes;

  private LivroInformacoes(String nome){
        this.nome=nome;
        this.paginas ="";
        this.avaliacoes ="";
  }
    private LivroInformacoes(String nome, String paginas){
        this.nome=nome;
        this.paginas =paginas;
        this.avaliacoes ="";
    }
    private LivroInformacoes(String nome, String avaliacoes, String paginas){
        this.nome=nome;
        this.paginas =paginas;
        this.avaliacoes =avaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
      if (!validar(nome))
          return;
        this.nome = nome;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        if (!validar(paginas))
            return;
        this.paginas = paginas;
    }

    public String getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(String avaliacoes) {
        if (!validar(avaliacoes))
            return;
        this.avaliacoes = avaliacoes;
    }

    public static LivroInformacoes getLivroInformacoes() {
        return livroInformacoes;
    }

    public static void setLivroInformacoes(LivroInformacoes livroInformacoes) {
        LivroInformacoes.livroInformacoes = livroInformacoes;
    }
    private static boolean validar(String texto){
      if (texto.contains(" ")){
          return false;
      }
      return true;
    }
    public static LivroInformacoes criarNome(String nome){
      if (livroInformacoes !=null){
          livroInformacoes.setNome(nome);
          return livroInformacoes;
      }
      if (!validar(nome))
          return null;
      return new LivroInformacoes(nome);
    }

    public static LivroInformacoes criarNomePaginas(String nome, String paginas){
        if (livroInformacoes !=null){
            livroInformacoes.setNome(nome);
            livroInformacoes.setPaginas(paginas);
            return livroInformacoes;
        }
        if (!validar(nome))
            return null;
        if (!validar(paginas))
            return null;
        return new LivroInformacoes(nome,paginas);
    }

    public static LivroInformacoes criaNomeAvaliacoes(String nome, String avaliacoes) {
        if (livroInformacoes != null) {
            livroInformacoes.setNome(nome);
            livroInformacoes.setAvaliacoes(avaliacoes);
            return livroInformacoes;
        }

        if (!validar(nome))
            return null;
        LivroInformacoes a = new LivroInformacoes(nome);
        a.setAvaliacoes(avaliacoes);
        return a;
    }
    public static LivroInformacoes cria(String nome, String paginas, String avaliacoes) {
        if (livroInformacoes != null) {
            livroInformacoes.setNome(nome);
            livroInformacoes.setPaginas(paginas);
            livroInformacoes.setAvaliacoes(avaliacoes);
            return livroInformacoes;
        }

        if (!validar(nome))
            return null;
        if (!validar(paginas))
            return null;
        return new LivroInformacoes(nome, paginas, avaliacoes);
    }
}