package com;

import org.testng.annotations.Test;

import java.util.Random;

public class ifelseTest {
    @Test
    public void ifelseTest() {
        int age = 10;
        if (age < 7) {
            System.out.println(age + "岁，属于儿童");
        } else if (age < 18) {
            System.out.println(age + "岁，属于少年");
        } else if (age < 40) {
            System.out.println(age + "岁，属于青年");
        } else if (age < 60) {
            System.out.println(age + "属于中年");
        } else {
            System.out.println(age + "岁，属于老年");
        }
    }
    @Test
    public void testWhile() {

        boolean isContinue = true;
        int times= 0;
        while(isContinue){
            int r = new Random().nextInt(1000);
            if( r%30 == 0){
                isContinue = false;
                System.out.println(r + "能被30整除，退出");
            }else{
                System.out.println(r + "不能被30整除");
                times++;
            }
            System.out.println("随即产生" + times + "次不能被30整除的数");
        }



    }

    @Test
    public void testdoWhile() {
        boolean isContinue = true;
        int times = 0;
        do {
            int r = new Random().nextInt(1000);
            if( r%30 == 0){
                isContinue = false ;
                System.out.println(r + "能被30整除，退出");
            }else{
                System.out.println(r + "不能被30整除，继续");
                times++;
            }

        }while (isContinue);
        System.out.println("随机产生" + times+ "次不能被30整除的数");
    }


    @Test
    public void testFor() {
        int sum = 0;
        for(int i = 0 ; i < 100 ; i++){
            if(i%2 != 0){
                System.out.println(i+"是单数");
                sum = sum + i ;
            }
        }
        System.out.println("单数总和是"+sum);
    }


    @Test
    public void testSwitchCase() {
        int command = 5 ;
        switch(command){
            case 1:
                System.out.println("扫地");
                break;
            case 2:
                System.out.println("开灯");
                break;
            case 3:
                System.out.println("关灯");
                break;
            case 4:
                System.out.println("播放音乐");
                break;
            case 5:
                System.out.println("关闭音乐");
                break;
            default:
                break;

        }
    }



    @Test
    public void testBreak() {

        int count = 0 ;
        while(true){
            int random = new Random().nextInt(1000);
            if(random%30 == 0){
                System.out.println(random + "能被30整除，退出");
                System.out.println("不能被30整除的数共" + count+"个");
                break;
            }else{
                System.out.println(random + "不能被30整除");
                count++;
            }

        }
    }


    int getMaxNumRem7(int n1 , int n2){

        for(int i = n2 ; i >= 0 ; i--){
            if(i%n1 == 7 ){

                return i;

            }

        }
        return -1;

    }


    @Test
    public void testGetMaxNumRem7() {
        int res = getMaxNumRem7(9 ,100);
        System.out.println(res);
    }
    @Test
    public void testContinue() {
        int sum = 0;
        for(int i = 0; i <= 100;i++){
            if(i%7 != 0){
                continue;
            }
            sum += i;

        }
        System.out.println("1--100能被7整除的数的和为" + sum);
    }


    @Test
    public int test() {
        return 0;
    }

}
