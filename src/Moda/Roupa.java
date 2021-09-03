package Moda;

public class Roupa {

    String nome;
    String cor;
    String marca;
    String tamanho;
    String colecao;
    String descricao;


    public Roupa(String nome, String cor, String marca, String tamanho, String colecao, String descricao) {
        this.nome = nome;
        this.cor = cor;
        this.marca = marca;
        this.tamanho = tamanho;
        this.colecao = colecao;
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Roupa{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", colecao='" + colecao + '\'' +
                '}';
    }
}
