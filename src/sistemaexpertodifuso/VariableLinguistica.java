package sistemaexpertodifuso;

import java.util.Scanner;

class VariableLinguistica {
    int llave;
    String nombre;
    Conjunto[] conjuntos;

    public VariableLinguistica(){
        conjuntos = new Conjunto[8];
    }
    
    /*public void leeClausula(){
        int predicados = 0;
        boolean leerMas = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la llave");
        llave = sc.nextInt();
        StringBuffer buffer;
        String predicado;
        while(leerMas){
            System.out.println("Escribe un predicado negado, si no quieres agregar otro, escribe *");
            predicado = sc.next();
            buffer = new StringBuffer(predicado);
            buffer.setLength(30);
            predicadosNegados[predicados] = buffer.toString();
            if(predicadosNegados[predicados].charAt(0) == '*'){
                leerMas = false;
            }
            predicados++;
            if(predicados == 16){
                leerMas = false;
            }
        }
        System.out.println("Escribe un predicado no negado, si no quieres agregarlo, escribe *");
        predicado = sc.next();
        buffer = new StringBuffer(predicado);
        buffer.setLength(30);
        this.predicado = buffer.toString();
    }
    
    public void leeClausula(int llave){
        int predicados = 0;
        boolean leerMas = true;
        Scanner sc = new Scanner(System.in);
        this.llave = llave;
        StringBuffer buffer;
        String predicado;
        while(leerMas){
            System.out.println("Escribe un predicado negado, si no quieres agregar otro, escribe *");
            predicado = sc.next();
            buffer = new StringBuffer(predicado);
            buffer.setLength(30);
            predicadosNegados[predicados] = buffer.toString();
            if(predicadosNegados[predicados].charAt(0) == '*'){
                leerMas = false;
            }
            predicados++;
            if(predicados == 16){
                leerMas = false;
            }
        }
        System.out.println("Escribe un predicado no negado, si no quieres agregarlo, escribe *");
        predicado = sc.next();
        buffer = new StringBuffer(predicado);
        buffer.setLength(30);
        this.predicado = buffer.toString();
    }
    
    public String muestraClausula(){
        boolean primero = true;
        int i;
        String clausula = "";
        clausula += this.llave+"  ";
        for(i = 0; i < 16 && this.predicadosNegados[i].charAt(0) != '*' && this.predicadosNegados[i].charAt(0) != ' '; i++){
            if(!primero){
                clausula += " v ";
            }
            else{
                primero = false;
            }
            clausula += "¬"+this.predicadosNegados[i].trim();
        }
        if(this.predicado.charAt(0) != '*'){
            if(!primero){
                clausula += " v ";
            }
            else{
                primero = false;
            }
            clausula += this.predicado.trim();
        }
        return clausula;
    }*/

    String muestraVariableLinguistica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
