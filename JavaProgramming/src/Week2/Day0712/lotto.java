package Week2.Day0712;


import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;

import java.util.List;

import java.util.Scanner;

 

public class lotto {

 

    public static void main(String[] args) {

 

        lotto lotto = new lotto();
        
        Scanner sc = new Scanner(System.in);

 
        System.out.print("�ζǹ�ȣ ���� ���� �Է�: ");
        
        int gameCnt = sc.nextInt();
        for (int i = 1; i <= gameCnt; i++) {

            System.out.println( i + "��° �ζǹ�ȣ: " + lotto.lottoNumbers());
        }
    }


    String lottoNumbers() {

 
        List<Integer> lottoNum = new ArrayList<Integer>();

        // List �ȿ� �ζǹ�ȣ �߰�

        
        for (int i = 1; i <= 45; i++) {

            lottoNum.add(i);
        }

        // set���� ���� �������� ���´�

        Collections.shuffle(lottoNum);

        int[] lottoNums = new int[6];
        for (int i = 0; i < 6; i++) {
            lottoNums[i] = lottoNum.get(i);
        }

        // ����

        Arrays.sort(lottoNums);
        return Arrays.toString(lottoNums);

    }

}
