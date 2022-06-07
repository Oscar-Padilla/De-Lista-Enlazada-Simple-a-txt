import java.util.LinkedList;
import java.io.FileWriter;
import java.io.IOException;
//Importamos las librerias necesarias para implementar los metodos
//correspondientes
public class LESaTXT 
{
    public static void main(String[] args) throws IOException 
    {
        //Declaré 3 listas
        //La primera es en la que se va a almacenar los 10 datos con
        //numeros aleatorios del 1 al 100
        LinkedList ListaOG = new LinkedList();
        //En la segunda se almacenarán unicamente los datos menores a 50
        LinkedList Lista1 = new LinkedList();
        //Y en la tercera lista es para albergar los datos mayores a 50
        LinkedList Lista2 = new LinkedList();
        //El ciclo for es para crear los 10 nodos dentro de la lista
        for (int i = 0; i < 10; i++) 
        {
            //Declaramos NumR como la variable en la que se almacena
            //el dato aleatorio, como Math.Random() da numeros de tipo
            //double, el tipo de variable es ese
            double NumR=Math.random()*100;
            //Se crea el objeto numR con la conversion del numero 
            //aleatorio double a un numero de tipo entero
            Object numR=(int)NumR;
            //Por ultimo guardamos en la lista el objeto ya convertido
            ListaOG.addLast(numR);
            //Se convierte a entero para ser más practicos al hacer las
            //listas y porque se ve bonito los numeros enteros :)
        }
        //Se imprime la lista actual con los numeros aleatorios
        System.out.println("El contenido es: "+ListaOG.toString());
        //Inicalizamos otro ciclo for para pasar por todos los 
        //numeros posibles de entre el 0 y el 50
        for (int i = 0; i < 50; i++) 
        {
            //Decimos que si la lista original contiene un numero
            //dentro del rango...
            if(ListaOG.contains(i))
            {
                //Segun el numero en el que vaya el ciclo se agregará
                //a la lista correspondiente, en este caso es la de
                //menores a 50
                Lista1.add(i);
            }
        }
        //Se imprime la nueva lista con los unicos datos menores a 50
        System.out.println("Menores a 50: "+Lista1);
        //Se inicializa un nuevo ciclo que inicia del 50 al 100, se toma
        //desde el 50 como mayor ya que inicia desde el 0
        for (int i = 50; i < 100; i++) 
        {
            //Se repite el mismo proceso, pero ahora con la lista designada
            //para recibir a los datos mayores a 50
            if(ListaOG.contains(i))
            {
                //Igual se agrega el dato a la nueva lista
                Lista2.add(i);
            }
        }
        //Se imprime la nueva lista con los datos originales que son
        //mayores a 50
        System.out.println("Mayores a 50: "+Lista2);
        //Se declaran las rutas necesarias para almacenar los archivos
        //de texto, se hace desde un usuario publico para que en dado
        //caso que el programa se "corra" en otro dispositivo se pueda
        //almacenar en este
        String ruta1="C:\\Users\\Public\\Documents\\Menores a 50.txt";
        String ruta2="C:\\Users\\Public\\Documents\\Mayores a 50.txt";
        //Declaramos archivo como la variable para llamar a los metodos
        //de la libreria, junto con la ruta del archivo de texto
        FileWriter archivo=new FileWriter(ruta1);
        //Le damos formato bonito al archivo de texto 
        archivo.write("Lista original: ");
        //Pondremos la lista original con los 10 datos generados
        //aleatoriamente 
        archivo.write(ListaOG.toString()+"\n");
        //De igual manera, pero ahora con la lista con los datos menores
        //a 50
        archivo.write("Lista Menores a 50: ");
        archivo.write(Lista1.toString());
        //Finalizamos el archivo
        archivo.close();
        //Creamos el otro archivo siguiendo los mismos pasos que el anterior
        FileWriter archivo1=new FileWriter(ruta2);
        //Se escribe en el documento con la lista original 
        archivo1.write("Lista original: ");
        archivo1.write(ListaOG.toString()+"\n");
        //Y siguiente de la lista con los datos mayores a 50
        archivo1.write("Lista Mayores a 50: ");
        archivo1.write(Lista2.toString());
        //Cerramos el archivo 
        archivo1.close();
    }
}
