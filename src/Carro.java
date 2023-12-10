 class Pessoas {
    private String nome;
    private int idade;

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }




    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

 class Carro {
    private String modelo;
    private String placa;
    private Pessoas proprietario;

    public Carro(String modelo, String placa, Pessoas proprietario) {
        this.modelo = modelo;
        this.placa = placa;
        this.proprietario = proprietario;
    }




    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public Pessoas getProprietario() {
        return proprietario;
    }
}

