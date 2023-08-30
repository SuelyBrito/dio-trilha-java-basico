/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu nome:");
        String nomeCli = scanner.next();
        System.out.println("Digite o numero de sua conta:");
        int  numConta = scanner.nextInt();
        System.out.println("Digite o numero de sua agencia :");
        String numAgen = scanner.next();
        System.out.println("Digite o seu saldo atual:");
        Double   vlsaldo = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Olá " + nomeCli + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                numAgen + " , conta "+ numConta + " e seu saldo "  + df.format(vlsaldo) + " já está disponível para saque");
        
    }
   
}
