/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cartela;

import java.util.Random;
import java.text.NumberFormat;
import java.text.DecimalFormat;



/**
 *
 * @author ice
 */
public class Cartela {
    
    Random random = new Random();
    
    private static int numeroCart=0;
    
    private int[][] cartela=new int[5][5];
    
    NumberFormat tresDigitos = new DecimalFormat("000");
    NumberFormat doisDigitos = new DecimalFormat("00");
    
    
    public Cartela()
    {
        
    }
    
    public void criaCartela()
    {
        numeroCart++;
        
        for(int j=0; j<5; j++)
        {
            for(int i=0;i<5;i++)
            {
                if(i==2 && j==2)
                {
                    cartela[i][j]=0;
                }
                else if(j==0)
                {
                    cartela[i][j]=1+random.nextInt(14);
                    verificaRepeticao(i, j);
                    
                }
                else if(j==1)
                {
                    cartela[i][j]=16+random.nextInt(14);
                    verificaRepeticao(i, j);
                }
                else if(j==2)
                {
                    cartela[i][j]=31+random.nextInt(14);
                    verificaRepeticao(i, j);
                }
                else if(j==3)
                {
                    cartela[i][j]=46+random.nextInt(14);
                    verificaRepeticao(i, j);
                }
                else if(j==4)
                {
                    cartela[i][j]=61+random.nextInt(14);
                    verificaRepeticao(i, j);
                }
            }
            ordenarColuna();
        }
        
        
    }
    
    private void ordenarColuna()
    {
        for(int j=0;j<5;j++)
        {
            for(int k=0; k<4; k++)
            {
                for(int i=0;i<4;i++)
                {
                    if(cartela[i][j]>cartela[i+1][j] && cartela[i+1][j]==0)
                    {
                        if(cartela[i][j]>cartela[i+2][j])
                        {
                            int aux=cartela[i][j];
                            cartela[i][j]=cartela[i+2][j];
                            cartela[i+2][j]=aux;
                        }
                    }
                    else if(cartela[i][j]>cartela[i+1][j])
                    {
                        int aux=cartela[i][j];
                        cartela[i][j]=cartela[i+1][j];
                        cartela[i+1][j]=aux;
                    }
                }
            }
        }
    }

    public void imprimeCartela(int num)
    {
        System.out.println("Cartela numero : "+tresDigitos.format(num+1));
        System.out.println(" B  I  N  G  O");
        
        for(int i=0;i<5;i++)
        {
            System.out.println(doisDigitos.format(cartela[i][0])+" "+doisDigitos.format(cartela[i][1])+" "+doisDigitos.format(cartela[i][2])+" "+doisDigitos.format(cartela[i][3])+" "+doisDigitos.format(cartela[i][4]));

            //System.out.println("\n");
        }
    }
    
    public void verificaRepeticao(int i, int j)
    {
        for(int k=0; k<i; k++)
        {
            if(cartela[i][j]==cartela[k][j])
            {
                cartela[i][j]=(15*j+1)+random.nextInt(14);
                
                verificaRepeticao(i, j);
            }
        }
    }
}
