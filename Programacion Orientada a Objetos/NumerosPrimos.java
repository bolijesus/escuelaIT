public class NumerosPrimos {

    private int[] numerosPrimos;

    public static void main(String[] args) {
        NumerosPrimos primos = new NumerosPrimos();
        int[] numeros = primos.losPrimeros(50);
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println(suma);        
    }

    public int[] losPrimeros(int numero) {
        this.numerosPrimos = new int[numero];
        int cuentaNumeroPrimo = 0;
        int i = 0;
        while (cuentaNumeroPrimo < numero) {
            if (this.esPrimo(i)) {
                this.numerosPrimos[cuentaNumeroPrimo] = i;
                cuentaNumeroPrimo++;
            }
            i++;
        }

        return this.numerosPrimos;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1 ) {
            return false;
        } 
        for (int i = 2; i < numero; i++) {
            if (numero%i == 0) {
                return false;
            }
        } 
        return true;
    }
}
