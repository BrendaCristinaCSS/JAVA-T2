package AtividadeCarro;

import java.util.Scanner;

public class Carro {
    /**
     * @param args
     */
    public static void main(String[] args) {
    
    String marca  = "Toyota";
    String modelo = "Camary";
    
    int AnodeFabricacao = 2023;
    int VelocidadeAtual = 180;
    
    int Velocidade_acelerar = 10;
    int Velocidade_frear = 10;

    
    
    System.out.println("A marca do carro é: " + marca);
    System.out.println("O modelo é: " + modelo);
    System.out.println("A velocidade atual: " + VelocidadeAtual);
    System.out.println("O ano de fabricação: " + AnodeFabricacao);  
    
        //Método
        // O carro só pode atingir 180km/h
        if ((VelocidadeAtual) <= 180){
        }else{
        VelocidadeAtual = 180;
        }
        

    //Scanner acelerar = new  Scanner(System.in);

    //for (Velocidade_acelerar>Velocidade_frear;)
    //{
    //    System.out.println(Velocidade_acelerar+" - ");
    //}

    }
}


