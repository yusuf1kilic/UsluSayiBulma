package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        Scanner input=new Scanner(System.in);
        System.out.print("üssü alınacak sayıyı giriniz : ");
        int n,k,total=1;
        n= input.nextInt();
        System.out.print("üssü yazınız : ");
        k= input.nextInt();
        for (int i=0; i<k;i++){
            total=total*n;
        }
        System.out.println("sonuç : "+total);

    }
}
