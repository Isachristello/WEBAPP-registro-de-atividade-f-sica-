
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Date dataNascimento;

    public Usuario(int id, String nome, String email, String senha, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }
    
    public void registrar() {}
    public void editar() {}
    public void excluir() {}
    public ArrayList<Atividade> listarAtividades(int id) { return new ArrayList<>(); }
    public ArrayList<Notificacao> receberNotificacoes(int id) { return new ArrayList<>(); }
    public void definirMeta(Meta meta) {}
}

public class Atividade {
    private int id;
    private int usuarioId;
    private String tipo;
    private int duracao;
    private float distanciaCarga;
    private Date data;
    private String intensidade;
    
    public Atividade(int id, int usuarioId, String tipo, int duracao, float distanciaCarga, Date data, String intensidade) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.tipo = tipo;
        this.duracao = duracao;
        this.distanciaCarga = distanciaCarga;
        this.data = data;
        this.intensidade = intensidade;
    }
    
    public void registrar() {}
    public void editar() {}
    public void excluir() {}
    public static ArrayList<Atividade> filtrar() { return new ArrayList<>(); }
    public static ArrayList<Atividade> listar() { return new ArrayList<>(); }
}

public class Notificacao {
    private int id;
    private int usuarioId;
    private String tipo;
    private String mensagem;
    private boolean lida;
    
    public Notificacao(int id, int usuarioId, String tipo, String mensagem, boolean lida) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.tipo = tipo;
        this.mensagem = mensagem;
        this.lida = lida;
    }
    
    public void enviar() {}
    public void marcarComoLida() {}
    public static ArrayList<Notificacao> listar() { return new ArrayList<>(); }
    public void excluir() {}
}

public class Historico {
    private int id;
    private int usuarioId;
    private int atividadeId;
    private int duracao;
    private String dados;
    private float distanciaCarga;
    
    public Historico(int id, int usuarioId, int atividadeId, int duracao, String dados, float distanciaCarga) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.atividadeId = atividadeId;
        this.duracao = duracao;
        this.dados = dados;
        this.distanciaCarga = distanciaCarga;
    }
    
    public void registrar() {}
    public void editar() {}
    public void excluir() {}
    public static ArrayList<Historico> filtrar() { return new ArrayList<>(); }
    public static ArrayList<Historico> listar() { return new ArrayList<>(); }
}

public class Meta {
    private int id;
    private int usuarioId;
    private String tipo;
    private String descricao;
    private float progresso;
    private Date data;
    private String status;
    
    public Meta(int id, int usuarioId, String tipo, String descricao, float progresso, Date data, String status) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.tipo = tipo;
        this.descricao = descricao;
        this.progresso = progresso;
        this.data = data;
        this.status = status;
    }
    
    public void registrar() {}
    public void editar() {}
    public void excluir() {}
    public static ArrayList<Meta> filtrar() { return new ArrayList<>(); }
    public static ArrayList<Meta> listar() { return new ArrayList<>(); }
    public void atualizar() {}
}
