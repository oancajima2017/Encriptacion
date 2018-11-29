
public class Principal {

    public static void main(String[] args) {

//        mensaje para encriptar
        String mensaje = "hola mundo";

//        arreglo de caracteres tipo CHAR
//        Permite guardar en una posicion diferente
        char array[] = mensaje.toCharArray();

//        creo un arreglo para contear
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ((char) array[i] + (char) 5);
        }

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
