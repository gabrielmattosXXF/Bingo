/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bingo;

import Cartela.Cartela;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author ice
 */
public class Bingo {
    
    Random random = new Random();
    private String numerosSorteados = "";
    private String[] vetNumerosSorteados;
    private int numSorteado;

    
    public void Jogo()
    {
        numSorteado=(1+random.nextInt(74));
        numerosSorteados=numerosSorteados+Integer.toString(numSorteado)+" ";
        vetNumerosSorteados=numerosSorteados.split(" ");
    }
    
    public static void main(String[] args) {
       
        Scanner teclado=new Scanner(System.in);
        
        int numJogadores;
        //JOptionPane.showInputDialog("BEM VINDO AO JOGO DE BINGO DO GAGALULU");
        JOptionPane.showMessageDialog(null, "BEM VINDO AO JOGO DE BINGO DO GAGALULU");
        
        System.out.println("Informe o número de jogadores: ");
        numJogadores=teclado.nextInt();
        
        //Cartela cart = new Cartela();
        //cart.criaCartela();
        
        //Cartela cart2 = new Cartela();
        //cart2.criaCartela();
        
        //cart.imprimeCartela(0);
        //cart2.imprimeCartela(1);
        
        //Cartela[] cart = new Cartela[numJogadores];
        
        Cartela[] cart = new Cartela[numJogadores];
        
        for(int i=0; i<numJogadores; i++)
        {
            cart[i] = new Cartela();
        }
        
        for(int i=0; i<numJogadores; i++)
        {
            cart[i].imprimeCartela();
            System.out.println("");
        }
        
    }
    
}

