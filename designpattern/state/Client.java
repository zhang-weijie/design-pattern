package com.atguigu.designpattern.state;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 创建活动对象，奖品池有5个奖品
        RaffleActivity activity = new RaffleActivity(1);

        // 我们连续抽三次奖
        for (int i = 0; i < 300; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.deductMoney();

            // 第二步抽奖
            activity.raffle();
        }
    }

}
