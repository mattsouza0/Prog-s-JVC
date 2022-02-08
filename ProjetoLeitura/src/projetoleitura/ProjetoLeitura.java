package projetoleitura;

/**
 * @author Mattg
 */
public class ProjetoLeitura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        
        p[0] = new Pessoa("Dagobeldo Peixoto", 69, "Masculino");
        p[1] = new Pessoa("Maria Firmina", 23, "Feminino");
        
        l[0] = new Livro("A volta dos que não foram", "Jubileu Silva", 478, p[0]);
        
        l[1] = new Livro("A volta dos que não foram 2: O retorno", "Jubileu Silva Campos",709,p[0]);
        
        l[2] = new Livro("A volta dos que não foram 3: A chegada dos que não foram", "Jubileu Silva Campos Irineu", 909, p[1]);
        
        l[1].abrir();
        l[1].folhear(23);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
        
        //for(int i=0;i<l.length;i++){
        //   System.out.println(l[i].detalhes());
        //}
        
    }
    
}
