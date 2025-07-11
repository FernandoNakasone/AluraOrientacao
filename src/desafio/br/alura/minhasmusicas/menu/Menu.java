package desafio.br.alura.minhasmusicas.menu;

import desafio.br.alura.minhasmusicas.modelos.Musica;
import desafio.br.alura.minhasmusicas.modelos.Podcast;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Menu {

    List<Musica> musicas = new ArrayList<>();
    List<Podcast> podcasts = new ArrayList<>();

    public void menu(){
        int opcao =0;

        do{
        try{
            opcao = parseInt(showInputDialog(gerarMenu()));
            switch (opcao){
                case 1:
                    adicionarConteudo();
                    break;

                case 2:
                    reproduzirConteudo();
                    break;

                case 3:
                    curtirConteudo();
                    break;

                case 4:
                    exibirDetalhes();
                    break;

                case 5:
                    return;

                default:
                    showMessageDialog(null,"Opção inválida");
            }
        } catch (NumberFormatException e){
            showMessageDialog(null, "Opção inválida");
        }
         }while(true);
        }

    private void adicionarConteudo() {
        String titulo,album,artista,genero,host,descricao;
        double duracao;
        int opcao;
        do {
            opcao = parseInt(showInputDialog("Eschole que tipo de conteudo adicionar: \n" + "1 - Música\n"
                    + "2 - Podcast \n" + "3 - Sair"));

            switch (opcao){
                case 1:
                    titulo = showInputDialog("Informe o nome da musica:");
                    artista = showInputDialog("Informe o artista:");
                    album = showInputDialog("Informe o album da música");
                    duracao = parseDouble(showInputDialog("informe a duração da musica:"));
                    genero = showInputDialog("Informe o genero da musica:");


                    musicas.add(new Musica(titulo,duracao,album,artista,genero));
                    break;

                case 2:
                    titulo = showInputDialog("Informe o nome do podcast:");
                    host = showInputDialog("informe o nome do host:");
                    duracao = parseDouble(showInputDialog("informe a duração do podcast:"));
                    descricao = showInputDialog("Dê uma breve descrição do podcast:");

                    podcasts.add(new Podcast(titulo,duracao,host,descricao));
                    break;

                case 3:
                    return;

                default:
                    showMessageDialog(null,"Opção inválida");
            }

        }while (true);
    }

    private void reproduzirConteudo(){
        String titulo,artista,host;
        int opcao,quantidade;
        do {
            opcao = parseInt(showInputDialog("Eschole que tipo de conteudo reproduzir: \n" + "1 - Música\n"
                    + "2 - Podcast \n" + "3 - Sair"));

            switch (opcao){
                case 1:
                    titulo = showInputDialog("Informe o nome da música:");
                    artista = showInputDialog("Informe o nome do artista:");
                    quantidade = parseInt(showInputDialog("Informe a quantidade de vezes a ser reproduzido:"));

                    for(Musica m : musicas){
                        if(titulo.equalsIgnoreCase(m.getTitulo()) && artista.equalsIgnoreCase(m.getArtista())){
                            showMessageDialog(null,"Reproduzindo " + titulo + " " + quantidade
                                    + " vezes");
                            for(int i=0; i<= quantidade; i++){
                                m.repodruz();
                            }
                            return;
                        }
                    }
                    showMessageDialog(null, "Música não encontrada");
                    break;

                case 2:
                    titulo = showInputDialog("informe o nome do podcast");
                    host = showInputDialog("Informe o nome do host");
                    quantidade = parseInt(showInputDialog("Informe a quantidade de vezes a ser reproduzido"));

                    for(Podcast p : podcasts){
                        if(titulo.equalsIgnoreCase(p.getTitulo()) && host.equalsIgnoreCase(p.getHost())){
                            showMessageDialog(null,"Reproduzindo " + titulo + " " + quantidade
                                    + " vezes");
                            for(int i=0; i<= quantidade; i++){
                                p.repodruz();
                            }
                            return;
                        }
                    }
                    showMessageDialog(null, "Podcast não encontrado");
                    break;

                case 3:
                    return;

                default:
                    showMessageDialog(null,"Opção inválida");
            }
        }while (true);
    }

    private void curtirConteudo(){

        String titulo,artista,host;
        int opcao,quantidade;
        do {
            opcao = parseInt(showInputDialog("Eschole que tipo de conteudo curtir: \n" + "1 - Música\n"
                    + "2 - Podcast \n" + "3 - Sair"));

            switch (opcao){
                case 1:
                    titulo = showInputDialog("Informe o nome da música:");
                    artista = showInputDialog("Informe o nome do artista:");
                    quantidade = parseInt(showInputDialog("Informe a quantidade de vezes a ser curtido:"));

                    for(Musica m : musicas){
                        if(titulo.equalsIgnoreCase(m.getTitulo()) && artista.equalsIgnoreCase(m.getArtista())){
                            showMessageDialog(null,"curtido " + titulo + " " + quantidade
                                    + " vezes");
                            for(int i=0; i<= quantidade; i++){
                                m.curte();
                            }
                            return;
                        }
                    }
                    showMessageDialog(null, "Música não encontrada");
                    break;

                case 2:
                    titulo = showInputDialog("informe o nome do podcast");
                    host = showInputDialog("Informe o nome do host");
                    quantidade = parseInt(showInputDialog("Informe a quantidade de vezes a ser curtido"));

                    for(Podcast p : podcasts){
                        if(titulo.equalsIgnoreCase(p.getTitulo()) && host.equalsIgnoreCase(p.getHost())){
                            showMessageDialog(null,"Curtindo " + titulo + " " + quantidade
                                    + " vezes");
                            for(int i=0; i<= quantidade; i++){
                                p.curte();
                            }
                            return;
                        }
                    }
                    showMessageDialog(null, "Podcast não encontrado");
                    break;

                case 3:
                    return;

                default:
                    showMessageDialog(null,"Opção inválida");
            }
        }while (true);
    }

    private void exibirDetalhes(){
        String aux = "";

        for(Musica m : musicas){
            aux += m;
            aux += "-------------------------------------------------------\n";
        }

        for(Podcast p : podcasts){
            aux += p;
            aux += "-------------------------------------------------------\n";
        }
        showMessageDialog(null, aux);
    }

    private String gerarMenu(){
        String aux = "SISTEMA DE STREAMING\n";
        aux+= "1 - Adicionar novo conteudo\n";
        aux+= "2 - Reproduzir conteudo\n";
        aux+= "3 - Curtir conteudo\n";
        aux+= "4 - Exibir detalhes de todos os conteudos\n";
        aux+= "5 - Finalizar";

        return aux;
    }

}