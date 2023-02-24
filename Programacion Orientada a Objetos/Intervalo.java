class Intervalo {

    public Intervalo(double inferior, double superior)
    public Intervalo(Intervalo intervalo)
    public Intervalo(double superior)
    public Intervalo()

    public Intervalo clone()
    public void longitud()
    public void desplazar(double desplazamiento)
    public Intervalo desplazado(double desplazamiento)
    public boolean incluye(double valor)
    public boolean incluye(Intervalo intervalo)
    public boolean equals(Intervalo intervalo)
    public Intervalo interseccion(Intervalo intervalo)
    public boolean intersecta(Intervalo intervalo)
    public void oponer()
    public void doblar()
    public void recoger()
    public void mostrar()
    public Intervalo[] trocear(int trozos)

}

class Coordenada{
    public void recoger()
    public void mostrar()
}

class Fecha{

    public Fecha(Fecha fecha) {
        
    }

    public Fecha(int dia, int mes, int anio) {
        
    }
    public Fecha(String fecha) {
        
    }
    
    public String diaSemana() {
        
    }
    public Fecha[] trocear(int cantidad, Fecha desde) {
        
    }
    public boolean esBiciesto() {
        
    }
    public void sumar(Fecha fecha) {
        
    }
    public boolean esFestivo() {
        
    }
}