package MyRedPacket;

import known.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class Lucky implements OpenMode {
    /*
       把totalMoney 随机分成 count 份 .  每份金额累和 等于 totalMoney

     */
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
        // 1.   创建集合
        ArrayList<Integer> list = new ArrayList<>();;

        // 2.  保存 循环次数
        int time = count - 1;

        // 3. 随机
        Random random = new Random();

        for (int i = 0; i < time; i++) {
            // 随机生成金额,并保存
           int redMoney=  random.nextInt( totalMoney / count * 2 )+1;
            list.add(redMoney);

            // 修改 金额和个数
            totalMoney -= redMoney;
            count--;
        }

        // 4.剩余
        list.add(totalMoney);
        return list;
    }
}
