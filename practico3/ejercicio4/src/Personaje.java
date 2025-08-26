import java.util.Random;

public abstract class Personaje {
    Integer vida;
    Integer nivelAtaque;
    Integer nivelDefensa;

    public Integer atacar() {
        Random rnd = new Random();

        return rnd.nextInt((0 + nivelAtaque * 10), (10 + nivelAtaque * 10));

    }

    public abstract void defender(Integer ataque);

}