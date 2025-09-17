public class ControladorMultaLibro implements IMulta {

    @Override
    public Double calcularMulta(Integer diasDemora) {
        return diasDemora * 500.0;
    }

}
