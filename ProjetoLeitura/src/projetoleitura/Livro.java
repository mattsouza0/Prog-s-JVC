package projetoleitura;

import java.util.Random;

/**
 * @author Mattg
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setAberto(false);
        this.setLeitor(leitor);
    }
    
    public String detalhes(){
        return "---------------------------------\n" 
        + "       Detalhes do Livro" 
        + "\nTitulo: " + this.getTitulo()
        + "\nAutor: " + this.getAutor()
        + "\nEstá aberto ? " + this.getAberto()
        + "\nTotal de Paginas: " + this.getTotPaginas()
        + "\nPagina Atual : " + this.getPagAtual() 
        + "\nLeitor: " + this.getLeitor().getNome() 
        + "\nIdade: " + this.getLeitor().getIdade()
        + "\nSexo: " + this.getLeitor().getSexo()
        + "\n---------------------------------\n";
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pg) {
        if(this.getAberto()){
            this.pagAtual = pg;
        }else{
            System.out.println("Impossivel folhear..livro FECHADO");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getAberto()){
            this.setPagAtual(this.getPagAtual()+1);
        }else{
            System.out.println("LIVRO FECHADO IMPOSSÍVEL AVANÇAR PAGINAS");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto()){
            this.setPagAtual(this.getPagAtual()-1);
        }else{
            System.out.println("LIVRO FECHADO IMPOSSÍVEL VOLTAR PAGINAS");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
      
    
}
