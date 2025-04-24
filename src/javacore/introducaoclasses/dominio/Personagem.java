package javacore.introducaoclasses.dominio;

public class Personagem {

    public String nome;
    public int nivel;
    public int forca;
    public int dano;

    public void mostrarStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de força.", nome, forca, nivel);
    }

    // metodo que nao recebe nada e recebe um parametro "inimigo" que é do tipo string
    public void atacar(String inimigo, String habilidade){
        if (habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.", nome, inimigo, dano);
        } else {
            System.out.format("%s atacou e usou a habilidade '%s' no %s e causou %d de dano.", nome, habilidade, inimigo, dano);
        }

    }
}
