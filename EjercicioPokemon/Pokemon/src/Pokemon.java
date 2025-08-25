import java.util.Random;

public abstract class Pokemon {

    protected String nombre;
    protected Integer vida = 100;
    protected String tipo;
    protected Integer ataque;
    protected Integer defensa;
    protected Integer velocidad;
    protected String debilidad;
    protected Integer salvajismo;

    public Pokemon(String nombre) {
        Random rnd = new Random();
        this.nombre = nombre;
        this.ataque = rnd.nextInt(0, 101);
        this.defensa = rnd.nextInt(0, 101);
        this.salvajismo = rnd.nextInt(0, 101);
        this.velocidad = rnd.nextInt(0, 101);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Vida: " + this.vida + " Tipo: " + this.tipo + " Ataque: " + this.ataque
                + " Defensa: " + this.defensa;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getDebilidad() {
        return this.debilidad;
    }

    public abstract void defensa(Integer danioRecibido);

    // Funcion en que se ataca al pokemon que viene como parametro
    public void ataque(Pokemon pokemonObjetivo) {
        Integer danioEmitido;
        // verifico la debilidad del objetivo
        if (pokemonObjetivo.getDebilidad().equals(this.tipo)) {
            // si sale dentro del 70% es critico
            danioEmitido = (int) ((new Random().nextInt(11) < 7) ? this.ataque * 1.50 : this.ataque);
        } else {
            danioEmitido = this.ataque;
        }
        // El pokemon se defiende del danio recibido
        pokemonObjetivo.defensa(danioEmitido);
    }
}