package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 게시판 앱 ==");
        int lastId;
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine();
            if(command.equals("종료")){
                System.out.printf("시스템이 종료됩니다\n");
                break;
            }
        }
        sc.close();
    }
}