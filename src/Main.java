public class Main {
    public static void main(String[] args) {
       int numeroif=2;
        int numerowhile=0;
        int numerofor=0;
        String estacion="OTOÑO";

       if (numeroif>0){
           System.out.println("es positivo");
       }else if(numeroif<0){
           System.out.println("es negativo");
       }else{
           System.out.println("es 0");
       }

       while (numerowhile<3){
           numerowhile++;
           System.out.println("el numero es: "+ numerowhile);
       }

       do {
           System.out.println("el numero es "+ numerowhile);
       }while (numerowhile<3);

        for (numerofor = 0; numerofor < 3; numerofor++) {
            System.out.println("el numero es: "+numerofor);
        }

        switch (estacion){
            case "INVIERNO":
                System.out.println("INVIERNO");
                break;
            case "VERANO":
                System.out.println("VERANO");
                break;
            case "OTOÑO":
                System.out.println("OTOÑO");
                break;
            case "PRIMAVERA":}
                System.out.println("PRIMAVERA");

        }
    }
