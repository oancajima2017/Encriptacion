
public class Principal {

    public static void main(String[] args) {

//        mensaje para encriptar
        String mensaje = "hola mundo";

//        arreglo de caracteres tipo CHAR
//        Permite guardar en una posicion diferente
        char array[] = mensaje.toCharArray();

//        creo un ciclo for con una variable que conte desde 0 hasta 
        for (int i = 0; i < array.length; i++) {

//            el arreglo sera igual al mismo para no perder el valor original 
            array[i] = (char) ((char) array[i] + (char) 5);
        }
//creamos una variable encriptado valueOf transforma en String para poder leer lo que imprimos
        String encriptado = String.valueOf(array);

        System.out.println(encriptado);

        char arrayD[] = encriptado.toCharArray();
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = (char) ((char) arrayD[i] - (char) 5);
        }
        String desencriptado = String.valueOf(arrayD);
        System.out.println(desencriptado);
    }
}
