package br.com.etecia.filmesapp;

public class filmes {
    //atributos globais
    private String titulo;
    private String descricão;
    private String  categoria;
    private  int img;

    //cria o construtor
    public filmes(String titulo, String descricão, String categoria, int img) {
        this.titulo = titulo;
        this.descricão = descricão;
        this.categoria = categoria;
        this.img = img;
    }
    // Metodos de acesso - getter e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricão() {
        return descricão;
    }

    public void setDescricão(String descricão) {
        this.descricão = descricão;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
