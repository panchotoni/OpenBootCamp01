public class mian {
    public static void main(String[] args) {
        int resultado = suma(1,2,3);
        System.out.println(resultado);
        //Invocamos la funcion y imprimimos su resultado

        Coche miAuto = new Coche();
        miAuto.SumarPuerta();
        miAuto.SumarPuerta();
        System.out.println(miAuto.puertas);

    }

    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;

    public void SumarPuerta() {
        this.puertas++;
    }
}
